package open_closed.sem;

public class CalculadoraImposto {
    public double calcularImposto(Pessoa pessoa) {
        switch (pessoa.getTipoPessoa()) {
            case "fisica":
                //Calcule imposto pessoa física
                return 0;
            case "juridica":
                //Calcule imposto pessoa jurídica
                return 1;
            default:
                throw new IllegalArgumentException("Tipo de pessoa não suportado");
        }
    }
}
