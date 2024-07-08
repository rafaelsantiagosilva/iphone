package smartphone.musicas;

import java.util.ArrayList;

public class IPod {
     private boolean aberto;
     private Playlist playlistAtual;
     private ArrayList<Playlist> playlists;

     public IPod(boolean aberto, ArrayList<Playlist> playlists) {
          this.aberto = aberto;
          this.playlists = playlists;
          this.playlistAtual = null;
     }

     public boolean isAberto() {
          return aberto;
     }

     public Playlist getPlaylistAtual() {
          return playlistAtual;
     }

     public Playlist[] getPlaylists() {
          return playlists.toArray(new Playlist[0]);
     }

     public void setAberto(boolean aberto) {
          this.aberto = aberto;
     }

     public void setPlaylistAtual(Playlist novaPlaylist) {
          this.playlistAtual = novaPlaylist;
     }

     public void setPlaylists(Playlist[] novasPlaylists) {
          this.playlists.clear();
          for (Playlist playlist : novasPlaylists) {
               this.playlists.add(playlist);
          }
     }

     public void tocarPlaylist(String nomeDaPlaylist) {
          for (Playlist playlist : playlists) {
               if (playlist.getNome().equals(nomeDaPlaylist)) {
                    setPlaylistAtual(playlist);
                    playlist.play();
                    return;
               }
          }
          System.out.println("Playlist not found: " + nomeDaPlaylist);
     }

     public void mudarPlaylist(String nomeDaPlaylist) {
          tocarPlaylist(nomeDaPlaylist);
     }

     public void pausarPlaylistAtual() {
          if (playlistAtual != null) {
               playlistAtual.pause();
          } else {
               System.out.println("No playlist is currently playing.");
          }
     }

     public void criarPlaylist(String nome, ArrayList<Musica> musicas) {
          playlists.add(new Playlist(nome, musicas));
          System.out.println("Created playlist: " + nome);
     }

     public void excluirPlaylist(String nomeDaPlaylist) {
          playlists.removeIf(playlist -> playlist.getNome().equals(nomeDaPlaylist));
          System.out.println("Deleted playlist: " + nomeDaPlaylist);
     }

     public void entrar() {
          setAberto(true);
          System.out.println("IPod is now open.");
     }

     public void sair() {
          setAberto(false);
          System.out.println("IPod is now closed.");
     }

     public void info() {
          System.out.println("IPod is " + (aberto ? "open" : "closed"));
          for (Playlist playlist : playlists) {
               playlist.info();
          }
     }
}
