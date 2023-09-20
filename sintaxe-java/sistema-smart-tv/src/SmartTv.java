public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;


    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
        
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuir o volume para: " + volume);
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void aumentarCanal(){
        canal++;
    }
      public void diminuirCanal(){
        canal--;
    }
    public void ligar(){
        ligada = true;
        System.out.println("Ligando TV .......");
        System.out.println(".......Ola........");
    }

    public void desligar(){
        ligada = false;
        System.out.println("Desliigando TV .......");
        System.out.println(".......Tchau.......");
    }
}