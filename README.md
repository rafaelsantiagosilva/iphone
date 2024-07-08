# Iphone📲

Este projeto foi desenvolvido como parte do bootcamp "Desenvolvimento Java com IA" da DIO. O foco principal foi a criação e implementação da UML (Unified Modeling Language) para representar a estrutura de um sistema de aplicativos em um smartphone.

## Estrutura do Projeto

O projeto é dividido em três pacotes principais, cada um contendo classes que representam diferentes funcionalidades do smartphone:

### 1. smartphone.musicas

Musica: Representa uma música, com atributos como título, autor, duração, se está tocando e data de lançamento.
Playlist: Representa uma playlist de músicas, contendo métodos para manipular as músicas.
IPod: Representa um aplicativo de música, contendo playlists e métodos para manipulação das mesmas.

### 2. smartphone.web

Clima: Representa um aplicativo de previsão do tempo, com métodos para prever a temperatura e o clima.
PaginaWeb: Representa uma página web, com atributos como título, conteúdo e se está aberta.
Safari: Representa um navegador web, com métodos para manipular páginas e abas.

### 3. smartphone.comunicacao

AparelhoTelefonico: Representa um aplicativo de telefone, com métodos para atender, recusar e encerrar chamadas.

### 4. smartphone

Iphone: Classe principal que contém uma instância de cada um dos aplicativos acima (Clima, Safari, IPod e AparelhoTelefonico). Esta classe demonstra o uso básico dos aplicativos no método main.

## Como Executar

1. Clone o repositório:

   `git clone https://github.com/rafaelsantiagosilva/iphone.git`

2. Navegue até o diretório do projeto:

   `cd projeto-smartphone`

3. Compile as classes Java:

   `javac -d bin src/smartphone/`

4. Execute a classe principal:

   `java -cp bin smartphone.Iphone`

## Funcionalidades

### Musica

Play e pause de músicas.
Exibição de informações das músicas.

### Playlist

Mudança de músicas dentro da playlist.
Play e pause da playlist.
Exibição de informações da playlist.

### IPod

Tocar e pausar playlists.
Criação e exclusão de playlists.
Exibição de informações do IPod.

### Clima

Previsão de temperatura e clima.
Exibição de informações do aplicativo de clima.

### PaginaWeb

Abertura e fechamento de páginas web.
Exibição de informações das páginas web.

### Safari

Abertura e fechamento de abas.
Abertura de páginas web.
Exibição de informações do navegador.

### AparelhoTelefonico

Atender, recusar e encerrar ligações.
Exibição de informações do aplicativo de telefone.
