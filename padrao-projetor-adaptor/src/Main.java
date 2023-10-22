import adaptor.AdapterTvLg;
import adaptor.AdapterTvSunsung;
import adaptor.TvLg;
import adaptor.TvSamsung;

public class Main {
    public static void main(String[] args) {
        TvLg tvLg = new TvLg();

        AdapterTvLg lg = new AdapterTvLg(tvLg);
        lg.ligar();
        lg.desligar();

        System.out.println();

        TvSamsung tvSamsung = new TvSamsung();

        AdapterTvSunsung tvSunsung = new AdapterTvSunsung(tvSamsung);
        tvSunsung.ligar();
        tvSunsung.desligar();
    }
}