package interface_segregation.com;

public class Vaca implements AnimalTerrestre {
    @Override
    public void comer() {
        //Comendo...
    }

    @Override
    public void andar() {
        //Andando...
    }
}
