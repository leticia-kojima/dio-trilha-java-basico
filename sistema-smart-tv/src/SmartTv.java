public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        System.out.println("Aumentando volume");
        volume++;
    }

    public void diminuirVolume(){
        System.out.println("Diminuindo volume");
        volume--;
    }

    public void aumentarCanal(){
        System.out.println("Aumentando canal");
        canal++;
    }

    public void diminuirCanal(){
        System.out.println("Diminuindo canal");
        canal--;
    }

    public void mudarCanal(int novoCanal){
        System.out.println("Mudando de canal");
        canal = novoCanal;
    }

}
