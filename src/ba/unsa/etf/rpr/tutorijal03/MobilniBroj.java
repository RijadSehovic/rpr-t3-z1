package ba.unsa.etf.rpr.tutorijal03;

public class MobilniBroj extends TelefonskiBroj {
    int mobilnaMreza;
    String broj;

    public MobilniBroj(int mobilnaMreza, String broj) {      //bosanska tastatura setxkbmap bs
        this.mobilnaMreza = mobilnaMreza;
        this.broj = broj;
    }
    @Override
    public String ispisi(){
        final String format = String.format("0%d-%s", mobilnaMreza, broj);
        return format;
    }
}
