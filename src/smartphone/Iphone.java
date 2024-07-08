package smartphone;

import smartphone.musicas.*;
import smartphone.web.*;
import smartphone.comunicacao.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class Iphone {
     public static void main(String[] args) {
          // Criando músicas
          Musica musica1 = new Musica("Song 1", "Author 1", 300, LocalDate.of(2020, 1, 1));
          Musica musica2 = new Musica("Song 2", "Author 2", 250, LocalDate.of(2021, 2, 1));
          ArrayList<Musica> musicas = new ArrayList<>();
          musicas.add(musica1);
          musicas.add(musica2);

          // Criando playlist
          Playlist playlist = new Playlist("My Playlist", musicas);
          ArrayList<Playlist> playlists = new ArrayList<>();
          playlists.add(playlist);

          // Criando iPod
          IPod iPod = new IPod(false, playlists);

          // Criando Clima
          Clima clima = new Clima();

          // Criando Safari
          Safari safari = new Safari();

          // Criando AparelhoTelefonico
          AparelhoTelefonico telefone = new AparelhoTelefonico(false);

          // Utilizando iPod
          iPod.entrar();
          iPod.tocarPlaylist("My Playlist");
          iPod.pausarPlaylistAtual();
          iPod.sair();

          // Utilizando Clima
          clima.entrar();
          clima.fazerPrevisaoDoTempo();
          clima.sair();

          // Utilizando Safari
          safari.entrar();
          safari.abrirPagina("www.example.com");
          safari.fecharAba("www.example.com");
          safari.sair();

          // Utilizando AparelhoTelefonico
          telefone.entrar();
          telefone.atenderLigacao();
          telefone.encerrarLigacao();
          telefone.sair();
     }
}
