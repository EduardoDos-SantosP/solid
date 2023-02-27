package interface_segregation.sem;

public class Vaca implements Animal {
    @Override
    public void comer() {
        //Comendo...
    }

    @Override
    public void andar() {
        //Andando...
    }

    @Override
    public void nadar() {
        //Nadan... Não. Pera.
    }

    @Override
    public void voar() {
        //Oxi! Vaca não voa!
    }
}
