package ba.unsa.etf.rpr.tutorijal03;

public class FiksniBroj extends TelefonskiBroj {
    public enum Grad {
        BIHAC("037"), BRCKO("049"), BUGOJNO("030"), GORAZDE("038"), LIVNO("034"), MOSTAR("036"), ORASJE("031"), SARAJEVO("033"), SIROKI("039"), TUZLA("035"), ZENICA("032");

        private String pozivni;



        Grad(String s) {
            this.pozivni = s;
        }

        public String getPozivni() {
            return pozivni;
        }
    }
    String broj;
    Grad grad;

    public FiksniBroj(String broj, Grad grad) {
        this.broj = broj;
        this.grad = grad;
    }
    @Override
    public String ispisi() {
        return String.format("%s/%s - %s", grad.getPozivni(),broj.substring(0,3),broj.substring(4,6));
    }

}
