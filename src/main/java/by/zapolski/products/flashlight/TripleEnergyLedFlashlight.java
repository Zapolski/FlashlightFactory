package by.zapolski.products.flashlight;

import by.zapolski.energy.IEnergySource;
import by.zapolski.energyConsumer.IEnergyConsumer;

public class TripleEnergyLedFlashlight extends DoubleEnergyFlashlight {

    IEnergySource energySource3;

    public TripleEnergyLedFlashlight(IEnergySource energySource1,
                                     IEnergySource energySource2,
                                     IEnergySource energySource3,
                                     IEnergyConsumer lightSource) {
        super(energySource1, energySource2, lightSource);
        this.energySource3 = energySource3;
    }

    @Override
    public boolean turnOn() {
        if (!enable){
            int count = lightSource.getChargeToTurn()/3;
            if ((energySource.useCharge(count))
                    &&(energySource2.useCharge(count))
                    &&(energySource3.useCharge(count))){
                enable=true;
                return enable;
            }
        }
        return enable;
    }

}
