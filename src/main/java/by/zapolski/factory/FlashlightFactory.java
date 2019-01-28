package by.zapolski.factory;

import by.zapolski.energy.EnergyEnum;
import by.zapolski.energy.EnergySourceFactory;
import by.zapolski.flashlight.DoubleEnergyFlashlight;
import by.zapolski.flashlight.Flashlight;
import by.zapolski.flashlight.SimpleFlashlight;
import by.zapolski.energyConsumer.EnergyConsumerEnum;
import by.zapolski.energyConsumer.EnergyConsumerFactory;

public class FlashlightFactory {

    private static FlashlightFactory flashlightFactory;
    private FlashlightFactory() {}
    public static FlashlightFactory getInstance() {
        if (flashlightFactory==null){
            return new FlashlightFactory();
        }
        return flashlightFactory;
    }

    private EnergySourceFactory energySourceFactory = EnergySourceFactory.getInstance();
    private EnergyConsumerFactory energyConsumerFactory = EnergyConsumerFactory.getInstance();

    public Flashlight getFlashlight(FlashlightEnum flashlight, EnergyEnum energySource,
                                    EnergyConsumerEnum lightSource){
        switch (flashlight){
            case SIMPLE_FLASHLIGHT:{
                return new SimpleFlashlight(energySourceFactory.getEnergySource(energySource),
                        energyConsumerFactory.getLightSource(lightSource));
            }
            case DOUBLE_ENERGY_FLASHLIGHT:{
                return new DoubleEnergyFlashlight(energySourceFactory.getEnergySource(energySource),
                        energySourceFactory.getEnergySource(energySource),
                        energyConsumerFactory.getLightSource(lightSource));
            }
        }
        return null;
    }
}
