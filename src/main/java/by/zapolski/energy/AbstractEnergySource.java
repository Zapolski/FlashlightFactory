package by.zapolski.energy;

public abstract class AbstractEnergySource implements IEnergySource {
    protected int charge;

    public AbstractEnergySource(int charge) {
        this.charge = charge;
    }

    public boolean useCharge(int count) {
        if ((charge-count)>=0){
            charge -= count;
            return true;
        }
        return false;
    }

    public int getCharge() {
        return charge;
    }
}
