package by.zapolski.factory;

import by.zapolski.energy.EnergyEnum;
import by.zapolski.energy.EnergySourceFactory;
import by.zapolski.energyConsumer.EnergyConsumerEnum;
import by.zapolski.energyConsumer.EnergyConsumerFactory;
import by.zapolski.products.IDevice;
import by.zapolski.products.flashlight.DoubleEnergyFlashlight;
import by.zapolski.products.flashlight.SimpleFlashlight;
import by.zapolski.products.flashlight.TripleEnergyLedFlashlight;

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

    public IDevice getFlashlight(FlashlightEnum flashlight, EnergyEnum energySource,
                                 EnergyConsumerEnum energyConsumer){
        switch (flashlight){
            case SIMPLE_FLASHLIGHT:{
                return new SimpleFlashlight(energySourceFactory.getEnergySource(energySource),
                        energyConsumerFactory.getEnergyConsumer(energyConsumer));
            }
            case DOUBLE_ENERGY_FLASHLIGHT:{
                return new DoubleEnergyFlashlight(energySourceFactory.getEnergySource(energySource),
                        energySourceFactory.getEnergySource(energySource),
                        energyConsumerFactory.getEnergyConsumer(energyConsumer));
            }
            case TRIPLE_ENERGY_LED_FLASHLIGHT:{
                return new TripleEnergyLedFlashlight(energySourceFactory.getEnergySource(energySource),
                        energySourceFactory.getEnergySource(energySource),
                        energySourceFactory.getEnergySource(energySource),
                        energyConsumerFactory.getEnergyConsumer(energyConsumer));
            }
        }
        return null;
    }
}
