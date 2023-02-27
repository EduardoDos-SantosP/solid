package dependency_inversion.com;

public class Carro {
    private Motor motor;

    public Carro(Motor motor) {
        this.motor = motor;
    }

    public void ligar() {
        motor.ligar();
    }
    public void desligar() {
        motor.desligar();
    }
}
