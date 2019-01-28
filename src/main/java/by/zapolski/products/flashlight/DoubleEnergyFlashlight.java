package by.zapolski.products.flashlight;

import by.zapolski.energy.IEnergySource;
import by.zapolski.energyConsumer.IEnergyConsumer;

public class DoubleEnergyFlashlight extends SimpleFlashlight{

    protected IEnergySource energySource2;

    public DoubleEnergyFlashlight(IEnergySource energySource1, IEnergySource energySource2, IEnergyConsumer lightSource) {
        super(energySource1, lightSource);
        this.energySource2=energySource2;
    }

    @Override
    public boolean turnOn() {
        if (!enable){
            if ((energySource.useCharge(lightSource.getChargeToTurn()/2))
                    &&(energySource2.useCharge(lightSource.getChargeToTurn()/2))){
                enable = true;
                return enable;
            }

        }
        return enable;
    }
}
