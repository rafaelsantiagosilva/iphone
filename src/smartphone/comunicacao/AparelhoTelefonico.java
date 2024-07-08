package smartphone.comunicacao;

public class AparelhoTelefonico {
     private boolean aberto;
     private boolean ligacaoEmAndamento;

     public AparelhoTelefonico(boolean aberto) {
          this.aberto = aberto;
          this.ligacaoEmAndamento = false;
     }

     public boolean isAberto() {
          return aberto;
     }

     public boolean isLigacaoEmAndamento() {
          return ligacaoEmAndamento;
     }

     public void setAberto(boolean aberto) {
          this.aberto = aberto;
     }

     public void setLigacaoEmAndamento(boolean andamento) {
          this.ligacaoEmAndamento = andamento;
     }

     public void atenderLigacao() {
          setLigacaoEmAndamento(true);
          System.out.println("Call answered.");
     }

     public void recusarLigacao() {
          System.out.println("Call declined.");
     }

     public void encerrarLigacao() {
          setLigacaoEmAndamento(false);
          System.out.println("Call ended.");
     }

     public void iniciarCorreioDeVoz() {
          System.out.println("Voicemail initiated.");
     }

     public void entrar() {
          setAberto(true);
          System.out.println("Phone app is now open.");
     }

     public void sair() {
          setAberto(false);
          System.out.println("Phone app is now closed.");
     }

     public void info() {
          System.out.println("Phone app is " + (aberto ? "open" : "closed"));
          System.out.println("Call in progress: " + ligacaoEmAndamento);
     }
}
