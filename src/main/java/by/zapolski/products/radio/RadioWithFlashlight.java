package by.zapolski.products.radio;

import by.zapolski.energy.IEnergySource;
import by.zapolski.energyConsumer.IEnergyConsumer;
import by.zapolski.products.IDevice;

public class RadioWithFlashlight implements IDevice {

    boolean enable;

    IEnergySource energySource;
    IEnergySource energySource2;

    IEnergyConsumer light;
    IEnergyConsumer speaker;

    public RadioWithFlashlight(IEnergySource energySource, IEnergySource energySource2,
                               IEnergyConsumer light, IEnergyConsumer speaker) {
        this.energySource = energySource;
        this.energySource2 = energySource2;
        this.light = light;
        this.speaker = speaker;
    }

    public boolean turnOn() {
        if (!enable){
            int count = light.getChargeToTurn()+speaker.getChargeToTurn()/2;
            if ((energySource.useCharge(count))
                    &&(energySource2.useCharge(count))) {
                enable=true;
                return enable;
            }
        }
        return enable;
    }

    public void turnOff() {
        enable=false;
    }
}
