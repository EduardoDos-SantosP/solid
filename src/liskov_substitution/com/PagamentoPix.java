package liskov_substitution.com;

public class PagamentoPix extends Pagamento {
    private String chavePix;

    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }

    public void pagar() {
        //Efetua pagamento via pix
    }
}
