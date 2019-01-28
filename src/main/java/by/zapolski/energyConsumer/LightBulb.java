package by.zapolski.energyConsumer;

public class LightBulb implements IEnergyConsumer {
    private int chargeToTurn;

    public LightBulb() {
        this.chargeToTurn = 10;
    }

    public int getChargeToTurn() {
        return chargeToTurn;
    }
}
