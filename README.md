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

- Validação de dados de entrada.
- Interface de usuário aprimorada.
- Armazenamento de dados em um banco de dados.
- Capacidade de edição de informações.
- Pesquisa avançada.
- Autenticação e controle de acesso.
