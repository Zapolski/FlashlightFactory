package by.zapolski.products.radio;

import by.zapolski.energy.IEnergySource;
import by.zapolski.energyConsumer.IEnergyConsumer;
import by.zapolski.products.IDevice;

public class SimpleRadio implements IDevice {

    boolean enable;
    IEnergySource energySource;
    IEnergyConsumer speaker;

    public SimpleRadio(IEnergySource energySource, IEnergyConsumer speaker) {
        this.energySource = energySource;
        this.speaker = speaker;
    }

    public boolean turnOn(){
        if (!enable){
            enable = energySource.useCharge(speaker.getChargeToTurn());
            return enable;
        }
        return enable;
    }

    public void turnOff(){
        enable=false;
    }
}
