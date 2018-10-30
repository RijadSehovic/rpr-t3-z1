package ba.unsa.etf.rpr.tutorijal03;

public class FiksniBroj extends TelefonskiBroj {
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
