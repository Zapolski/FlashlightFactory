package by.zapolski.flashlight;

import by.zapolski.energy.IEnergySource;
import by.zapolski.energyConsumer.IEnergyConsumer;

public class SimpleFlashlight implements Flashlight{

    protected boolean enable;
    protected IEnergySource energySource;
    protected IEnergyConsumer lightSource;

    public SimpleFlashlight(IEnergySource energySource, IEnergyConsumer lightSource) {
        this.energySource = energySource;
        this.lightSource = lightSource;
    }

    public boolean turnOn() {
        if (!enable){
            enable = energySource.useCharge(lightSource.getChargeToTurn());
            return enable;
        }
        return enable;
    }

    public void turnOff() {
        enable=false;
    }

    public IEnergySource getEnergySource() {
        return energySource;
    }

    public void setEnergySource(IEnergySource energySource) {
        this.energySource = energySource;
    }
}
