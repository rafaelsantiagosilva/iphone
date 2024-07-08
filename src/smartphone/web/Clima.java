package smartphone.web;

public class Clima {
     private boolean aberto;

     public Clima() {
          this.aberto = false;
     }

     public boolean isAberto() {
          return aberto;
     }

     private void setAberto(boolean aberto) {
          this.aberto = aberto;
     }

     private float preverTemperatura() {
          return 25.0f; // Simulated temperature
     }

     private String preverClima() {
          return "Sunny"; // Simulated weather
     }

     public void fazerPrevisaoDoTempo() {
          System.out.println("Temperature: " + preverTemperatura() + "°C, Weather: " + preverClima());
     }

     public void entrar() {
          setAberto(true);
          System.out.println("Weather app is now open.");
     }

     public void sair() {
          setAberto(false);
          System.out.println("Weather app is now closed.");
     }
}
