package interface_segregation.com;

public class Pato implements AnimalTerrestre, AnimalAquatico, AnimalVoador {
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
