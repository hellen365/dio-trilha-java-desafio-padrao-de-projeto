package adaptor;

public class AdapterTvLg extends TvLg {

    private TvLg tvLg;

    public AdapterTvLg(TvLg tvLg) {
        this.tvLg = tvLg;
    }

    public void ligarTv() {
        tvLg.ligar();
    }

    public void desligarTv(){
        tvLg.desligar();
    }

}
