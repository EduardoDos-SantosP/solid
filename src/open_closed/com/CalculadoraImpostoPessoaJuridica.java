package open_closed.com;

public class CalculadoraImpostoPessoaJuridica implements CalculadoraImposto {
    public CalculadoraImpostoPessoaJuridica(PessoaJuridica pessoa) {
    }

    @Override
    public double calcularImposto() {
        return 0;
    }
}
