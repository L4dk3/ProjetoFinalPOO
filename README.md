# ProjetoFinalPOO

Este é um projeto de gerenciamento de peixes cartilaginosos, desenvolvido em Java, que permite adicionar, pesquisar, remover e listar informações sobre esses animais. Ele oferece uma interface gráfica para interagir com os dados de forma amigável.

## Funcionalidades

- Adicione novos peixes cartilaginosos ao sistema, fornecendo o nome e nome científico.
- Pesquise peixes por nome.
- Remova peixes com base no nome.
- Liste todos os peixes cadastrados.
- Salve os dados em um arquivo para preservação.

## Estrutura do Projeto

O projeto é composto por diversas classes e interfaces, cada uma com suas responsabilidades:

- `PeixeFacade`: Define as operações básicas para gerenciamento de peixes.
- `GerenciadorPeixes`: Implementa `PeixeFacade` e gerencia a lista de peixes.
- `PeixeCartilaginoso`: Representa os peixes cartilaginosos.
- `TipoPeixeCartilaginoso`: Enumeração para tipos de peixes cartilaginosos.
- `SalvarDados` e `RecuperarDados`: Classes para salvar e recuperar dados em arquivos.
- `PeixeGUI`: Interface gráfica para interagir com o sistema.
- `TestePeixes`: Classe de teste para verificar as operações do gerenciador.

- ## Melhorias Futuras

O projeto está em constante evolução, e algumas melhorias futuras que podem ser consideradas incluem:

- Interface de Usuário Aprimorada: Melhorar a interface de usuário (PeixeGUI) com recursos como feedback visual para ações (por exemplo, confirmação de adição/remoção bem-sucedida), validação em tempo real dos campos de entrada e uma interface mais amigável.

- Recuperação de Dados aprimorada: Implementar um sistema de recuperação de dados mais robusto, permitindo a importação de dados a partir de diferentes fontes, como bancos de dados externos.

- Armazenamento de Dados: Utilizar um sistema de gerenciamento de banco de dados para armazenar os dados dos peixes em vez de usar arquivos de texto. Isso facilitaria a consulta e manutenção dos dados.

- Capacidade de Edição: Adicionar a capacidade de editar informações de peixes existentes, além de apenas adicionar e remover. Isso seria útil para atualizar informações quando necessário.

- Pesquisa Avançada: Implementar uma pesquisa avançada que permita aos usuários pesquisar peixes com base em critérios específicos, como tipo de peixe, nome científico, etc.

- Documentação: Criar documentação abrangente para o projeto, incluindo documentação do código-fonte e manuais de usuário, para facilitar o uso e manutenção do sistema.

- Testes Unitários: Expandir os testes unitários para cobrir mais cenários, garantindo uma cobertura mais abrangente do código.

