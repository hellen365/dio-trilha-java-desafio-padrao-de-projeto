package adaptor;

public class AdapterTvSunsung extends TvSamsung {

    private TvSamsung tvSamsung;

    public AdapterTvSunsung(TvSamsung tvSamsung) {
        this.tvSamsung = tvSamsung;
    }

    public void ligarTv() {
        tvSamsung.ligar();
    }

    public void desligarTv(){
        tvSamsung.desligar();
    }

}
