package adaptor;

public class TvSamsung implements Tv{
    @Override
    public void ligar() {
        System.out.println("Ligado Tv Sumsung....");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando Tv Sumsung....");
    }
}
