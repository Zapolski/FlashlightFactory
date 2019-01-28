package by.zapolski.energyConsumer;

public class LightLED implements IEnergyConsumer{
    private int chargeToTurn;

    public LightLED() {
        this.chargeToTurn = 2;
    }

    public int getChargeToTurn() {
        return chargeToTurn;
    }
}
