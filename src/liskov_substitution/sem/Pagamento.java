package liskov_substitution.sem;

public class Pagamento {
    private double valor;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void pagar() {
        //Efetua pagamento genérico
    }
}
