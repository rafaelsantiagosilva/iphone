package smartphone.web;

public class PaginaWeb {
     private String titulo;
     private String conteudo;
     private boolean aberta;

     public PaginaWeb(String titulo, String conteudo) {
          this.titulo = titulo;
          this.conteudo = conteudo;
          this.aberta = false;
     }

     public String getTitulo() {
          return titulo;
     }

     public String getConteudo() {
          return conteudo;
     }

     public boolean isAberta() {
          return aberta;
     }

     public void setTitulo(String titulo) {
          this.titulo = titulo;
     }

     public void setConteudo(String conteudo) {
          this.conteudo = conteudo;
     }

     private void setAberta(boolean aberta) {
          this.aberta = aberta;
     }

     public void abrir() {
          setAberta(true);
          System.out.println("Opened page: " + titulo);
     }

     public void fechar() {
          setAberta(false);
          System.out.println("Closed page: " + titulo);
     }

     public void info() {
          System.out.println("Page Title: " + titulo + ", Content: " + conteudo);
     }
}
