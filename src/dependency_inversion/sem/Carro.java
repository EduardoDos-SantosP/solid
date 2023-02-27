package dependency_inversion.sem;

public class Carro {
    private MotorCombustao motor;

    public Carro(MotorCombustao motor) {
        this.motor = motor;
    }

    public void ligar() {
        motor.ligar();
    }
    public void desligar() {
        motor.desligar();
    }
}
