package by.zapolski.energyConsumer;

public class LightLED implements IEnergyConsumer{
    private int chargeToTurn;

    public LightLED() {
        this.chargeToTurn = 3;
    }

    public int getChargeToTurn() {
        return chargeToTurn;
    }
}
