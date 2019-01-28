package by.zapolski.energyConsumer;

public class Speacker implements IEnergyConsumer{

    private int chargeToTurn;

    public Speacker() {
        this.chargeToTurn = 5;
    }

    public int getChargeToTurn() {
        return chargeToTurn;
    }
}
