package interface_segregation.sem;

public class Pato implements Animal {
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
        //Nadando...
    }

    @Override
    public void voar() {
        //Voando...
    }
}
