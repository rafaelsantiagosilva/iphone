package smartphone.web;

import java.util.ArrayList;

public class Safari {
     private boolean aberto;
     private ArrayList<String> abas;
     private PaginaWeb paginaWeb;
     private ArrayList<PaginaWeb> paginas;

     public Safari() {
          this.aberto = false;
          this.abas = new ArrayList<>();
          this.paginas = new ArrayList<>();
     }

     public boolean isAberto() {
          return aberto;
     }

     public PaginaWeb getPaginaWeb() {
          return paginaWeb;
     }

     public ArrayList<PaginaWeb> getPaginas() {
          return paginas;
     }

     private void setAberto(boolean aberto) {
          this.aberto = aberto;
     }

     public void setPaginaAtual(PaginaWeb novaPagina) {
          this.paginaWeb = novaPagina;
     }

     public void setPaginas(ArrayList<PaginaWeb> novasPaginas) {
          this.paginas = novasPaginas;
     }

     public void abrirPagina(String urlDaPagina) {
          PaginaWeb novaPagina = new PaginaWeb(urlDaPagina, "Content of " + urlDaPagina);
          paginas.add(novaPagina);
          setPaginaAtual(novaPagina);
          novaPagina.abrir();
     }

     public void abrirNovaAba(String nomeDaAba) {
          abas.add(nomeDaAba);
          System.out.println("Opened new tab: " + nomeDaAba);
     }

     public void fecharAba(String nomeDaAba) {
          abas.remove(nomeDaAba);
          System.out.println("Closed tab: " + nomeDaAba);
     }

     public void sairDaPagina() {
          if (paginaWeb != null) {
               paginaWeb.fechar();
          }
     }

     public void entrar() {
          setAberto(true);
          System.out.println("Safari is now open.");
     }

     public void sair() {
          setAberto(false);
          System.out.println("Safari is now closed.");
     }

     public void info() {
          System.out.println("Safari is " + (aberto ? "open" : "closed"));
          for (PaginaWeb pagina : paginas) {
               pagina.info();
          }
     }
}
