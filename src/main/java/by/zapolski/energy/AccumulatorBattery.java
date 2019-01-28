package by.zapolski.energy;

public class AccumulatorBattery extends AbstractEnergySource {
    public static final int CAPACITY = 700;

    public AccumulatorBattery() {
        super(CAPACITY);
    }

    public void recharge(){
        charge= CAPACITY;
    }

}
