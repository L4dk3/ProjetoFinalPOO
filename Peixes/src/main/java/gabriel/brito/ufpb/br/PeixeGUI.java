package gabriel.brito.ufpb.br;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

public class PeixeGUI {
    private JFrame frame;
    private JTextField nomeField;
    private JTextField nomeCientificoField;
    private JLabel resultadoPesquisa;
    private PeixeFacade facade;
    private SalvarDados salvar;


    public PeixeGUI(PeixeFacade facade) {
        this.facade = facade;
        salvar = new SalvarDados(this.facade);
        frame = new JFrame("Cadastro de Peixes Cartilaginosos");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }



    private void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel nomeLabel = new JLabel("Nome:");
        nomeLabel.setBounds(10, 20, 80, 25);
        panel.add(nomeLabel);

        nomeField = new JTextField(20);
        nomeField.setBounds(100, 20, 165, 25);
        panel.add(nomeField);

        JLabel nomeCientificoLabel = new JLabel("Nome Científico:");
        nomeCientificoLabel.setBounds(10, 50, 80, 25);
        panel.add(nomeCientificoLabel);

        nomeCientificoField = new JTextField(20);
        nomeCientificoField.setBounds(100, 50, 165, 25);
        panel.add(nomeCientificoField);

        JButton adicionarButton = new JButton("Adicionar");
        adicionarButton.setBounds(10, 80, 80, 25);
        adicionarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nome = nomeField.getText();
                String nomeCientifico = nomeCientificoField.getText();
                PeixeCartilaginoso peixe = new PeixeCartilaginoso(nome, nomeCientifico);
                facade.adicionarPeixe(peixe);
            }
        });
        panel.add(adicionarButton);

        JButton removerButton = new JButton("Remover");
        removerButton.setBounds(100, 80, 80, 25);
        removerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nome = nomeField.getText();
                facade.removerPeixe(nome);
            }
        });
        panel.add(removerButton);

        JButton pesquisarButton = new JButton("Pesquisar");
        pesquisarButton.setBounds(190, 80, 90, 25);
        pesquisarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nome = nomeField.getText();
                PeixeCartilaginoso peixe = facade.pesquisarPeixe(nome);
                if (peixe != null) {
                    resultadoPesquisa.setText("Nome: " + peixe.getNome() + ", Nome Científico: " + peixe.getNomeCientifico());
                } else {
                    resultadoPesquisa.setText("Peixe não encontrado");
                }
            }
        });
        panel.add(pesquisarButton);

        resultadoPesquisa = new JLabel("");
        resultadoPesquisa.setBounds(10, 110, 280, 25);
        panel.add(resultadoPesquisa);

        JButton listarButton = new JButton("Listar Peixes");
        listarButton.setBounds(10, 140, 110, 25);
        listarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame listarFrame = new JFrame("Peixes Cadastrados");
                listarFrame.setSize(300, 200);
                listarFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                JTextArea textArea = new JTextArea();
                for (PeixeCartilaginoso peixe : facade.getPeixes()) {
                    textArea.append(peixe.getNome() + " - " + peixe.getNomeCientifico() + "\n");
                }

                listarFrame.add(new JScrollPane(textArea));
                listarFrame.setVisible(true);
            }
        });
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                try {
                    salvar.salvarDados("arquivo.txt");
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
        panel.add(listarButton);
    }




}