# Sistema de Cinema em PHP

Este é um sistema de cinema desenvolvido como parte de uma atividade do curso técnico em Informática. O sistema foi construído com base em um diagrama UML que representa as principais classes e suas relações. O objetivo do sistema é gerenciar informações relacionadas a filmes, sessões, atores, ingressos, salas e categorias de ingressos.

## Diagrama UML

Abaixo está o diagrama UML que serve como base para o desenvolvimento do sistema:

![Diagrama UML](/bg3.png)

## Classes Principais

### Filme
- Representa um filme que será exibido no cinema.
- Atributos:
  - idFilme: identificador único do filme.
  - titulo: título do filme.
  - genero: gênero do filme (enumeração).
  - duracao: duração do filme em minutos.

### Sessao
- Representa uma sessão de exibição de um filme em uma sala.
- Atributos:
  - idSessao: identificador único da sessão.
  - filme: o filme a ser exibido (relacionamento com a classe Filme).
  - sala: a sala em que a sessão será realizada (relacionamento com a classe Sala).
  - horario: horário de início da sessão.

### Ator
- Representa um ator que participou de um filme.
- Atributos:
  - idAtor: identificador único do ator.
  - nome: nome do ator.
  - dataNascimento: data de nascimento do ator.
  - nacionalidade: nacionalidade do ator.

### Ingresso
- Representa um ingresso para uma sessão de cinema.
- Atributos:
  - idIngresso: identificador único do ingresso.
  - sessao: a sessão para a qual o ingresso foi adquirido (relacionamento com a classe Sessao).
  - tipo: tipo do ingresso (enumeração).
  - categoria: categoria do ingresso (enumeração).

### Sala
- Representa uma sala de cinema onde as sessões são realizadas.
- Atributos:
  - idSala: identificador único da sala.
  - nome: nome ou número da sala.
  - capacidade: capacidade máxima de espectadores da sala.

### Enumerações
- EnumCategoriaIngresso: define as categorias de ingresso (ex: inteiro, meia-entrada).
- EnumTipoIngresso: define os tipos de ingresso (ex: 2D, 3D).
- EnumGeneroFilme: define os gêneros de filme (ex: ação, comédia, drama).

## Funcionalidades Implementadas

O sistema implementa as seguintes funcionalidades básicas:
- Cadastro, edição e exclusão de filmes, sessões, atores, ingressos e salas.
- Listagem de filmes, sessões, atores, ingressos e salas.
- Venda de ingressos para sessões disponíveis.
- Busca de filmes por gênero, sessões por horário, etc.

## Tecnologias Utilizadas

O sistema foi desenvolvido utilizando PHP como linguagem de programação e MySQL como banco de dados. Além disso, foram utilizadas técnicas de programação orientada a objetos para a implementação das classes e relações definidas no diagrama UML.

## Como Executar o Sistema

Para executar o sistema em seu ambiente local, siga estas etapas:
1. Clone este repositório em sua máquina.
2. Importe o banco de dados fornecido (`script_sql.sql`) em seu sistema de gerenciamento de banco de dados MySQL.
3. Configure as credenciais de acesso ao banco de dados no arquivo `conexao.php`.
4. Inicie um servidor web compatível com PHP em seu computador.
5. Acesse o sistema através do navegador web, utilizando a URL correspondente ao diretório onde o sistema foi clonado.

## Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues para relatar bugs, sugerir melhorias ou enviar pull requests com novas funcionalidades.

## Autores

Este sistema foi desenvolvido por [Seu Nome] como parte da atividade do curso técnico em Informática.
