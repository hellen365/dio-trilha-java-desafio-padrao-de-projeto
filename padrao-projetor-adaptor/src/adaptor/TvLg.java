package adaptor;

public class TvLg implements Tv {

    @Override
    public void ligar() {
        System.out.println("Ligado Tv LG....");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando Tv LG....");
    }
}
