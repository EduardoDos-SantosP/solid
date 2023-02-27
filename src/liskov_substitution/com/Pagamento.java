package liskov_substitution.com;

public abstract class Pagamento {
    private double valor;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public abstract void pagar();
}
