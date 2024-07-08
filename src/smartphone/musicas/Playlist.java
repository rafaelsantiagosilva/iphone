package smartphone.musicas;

import java.util.ArrayList;

public class Playlist {
     private String nome;
     private Musica musicaAtual;
     private ArrayList<Musica> musicas;
     private boolean tocando;

     public Playlist(String nome, ArrayList<Musica> musicas) {
          this.nome = nome;
          this.musicas = musicas;
          this.musicaAtual = null;
          this.tocando = false;
     }

     public String getNome() {
          return nome;
     }

     public Musica getMusicaAtual() {
          return musicaAtual;
     }

     public boolean isTocando() {
          return tocando;
     }

     public void setNome(String novoNome) {
          this.nome = novoNome;
     }

     private void setMusicaAtual(Musica novaMusica) {
          this.musicaAtual = novaMusica;
     }

     private void setTocando(boolean tocando) {
          this.tocando = tocando;
     }

     public void mudarMusica(String nomeDaMusica) {
          for (Musica musica : musicas) {
               if (musica.getTitulo().equals(nomeDaMusica)) {
                    setMusicaAtual(musica);
                    System.out.println("Changed to music: " + nomeDaMusica);
                    return;
               }
          }
          System.out.println("Music not found: " + nomeDaMusica);
     }

     public void play() {
          if (musicaAtual != null) {
               musicaAtual.play();
               setTocando(true);
          } else {
               System.out.println("No music selected to play.");
          }
     }

     public void pause() {
          if (musicaAtual != null) {
               musicaAtual.pause();
               setTocando(false);
          } else {
               System.out.println("No music is playing.");
          }
     }

     public void info() {
          System.out.println("Playlist: " + nome);
          for (Musica musica : musicas) {
               musica.info();
          }
     }
}
