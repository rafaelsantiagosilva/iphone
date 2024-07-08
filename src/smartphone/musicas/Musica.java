package smartphone.musicas;

import java.time.LocalDate;

public class Musica {
     private String titulo;
     private String autor;
     private int duracaoEmSegundos;
     private boolean tocando;
     private LocalDate dataLancamento;

     public Musica(String titulo, String autor, int duracaoEmSegundos, LocalDate dataLancamento) {
          this.titulo = titulo;
          this.autor = autor;
          this.duracaoEmSegundos = duracaoEmSegundos;
          this.dataLancamento = dataLancamento;
          this.tocando = false;
     }

     public String getTitulo() {
          return titulo;
     }

     public String getAutor() {
          return autor;
     }

     public int getDuracaoEmSegundos() {
          return duracaoEmSegundos;
     }

     public boolean isTocando() {
          return tocando;
     }

     public LocalDate getDataLancamento() {
          return dataLancamento;
     }

     public void setTitulo(String titulo) {
          this.titulo = titulo;
     }

     public void setAutor(String autor) {
          this.autor = autor;
     }

     public void setDuracaoEmSegundos(int duracaoEmSegundos) {
          this.duracaoEmSegundos = duracaoEmSegundos;
     }

     private void setTocando(boolean tocando) {
          this.tocando = tocando;
     }

     public void setDataLancamento(LocalDate dataLancamento) {
          this.dataLancamento = dataLancamento;
     }

     public void play() {
          setTocando(true);
          System.out.println("Playing " + titulo);
     }

     public void pause() {
          setTocando(false);
          System.out.println("Paused " + titulo);
     }

     public void info() {
          System.out.println("Title: " + titulo + ", Author: " + autor + ", Duration: " + duracaoEmSegundos
                    + " seconds, Release Date: " + dataLancamento);
     }
}
