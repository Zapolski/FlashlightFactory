package by.zapolski;


import by.zapolski.energy.EnergyEnum;
import by.zapolski.energyConsumer.EnergyConsumerEnum;
import by.zapolski.factory.FlashlightEnum;
import by.zapolski.factory.FlashlightFactory;
import by.zapolski.products.IDevice;
import org.junit.Assert;
import org.junit.Test;

public class FlashlightFactoryTests {

    FlashlightFactory flashlightFactory = FlashlightFactory.getInstance();

    @Test
    public void SimpleFlashlightWithChineseBatteryTest(){

        IDevice flashLight = flashlightFactory.getFlashlight(FlashlightEnum.SIMPLE_FLASHLIGHT,
                EnergyEnum.CHINESE_BATTERY, EnergyConsumerEnum.LIGHT_BULB);

        for (int i = 0; i < 5; i++) {
            Assert.assertTrue(flashLight.turnOn());
            flashLight.turnOff();
        }

        Assert.assertFalse(flashLight.turnOn());
        flashLight.turnOff();
        Assert.assertFalse(flashLight.turnOn());
        flashLight.turnOff();
    }

    @Test
    public void SimpleFlashlightWithDuracellBatteryTest(){

        IDevice flashLight = flashlightFactory.getFlashlight(FlashlightEnum.SIMPLE_FLASHLIGHT,
                EnergyEnum.DURACELL_BATTERY, EnergyConsumerEnum.LIGHT_BULB);

        for (int i = 0; i < 50; i++) {
            Assert.assertTrue(flashLight.turnOn());
            flashLight.turnOff();
        }

        Assert.assertFalse(flashLight.turnOn());
        flashLight.turnOff();
        Assert.assertFalse(flashLight.turnOn());
        flashLight.turnOff();
    }

    @Test
    public void SimpleFlashlightWithAccumulatorBatteryTest(){

        IDevice flashLight = flashlightFactory.getFlashlight(FlashlightEnum.SIMPLE_FLASHLIGHT,
                EnergyEnum.ACCUMULATOR_BATTERY, EnergyConsumerEnum.LIGHT_BULB);

        for (int i = 0; i < 70; i++) {
            Assert.assertTrue(flashLight.turnOn());
            flashLight.turnOff();
        }

        Assert.assertFalse(flashLight.turnOn());
        flashLight.turnOff();
        Assert.assertFalse(flashLight.turnOn());
        flashLight.turnOff();
    }

    @Test
    public void DoubleEnergyFlashlightWithChineseBatteryTest(){

        IDevice flashLight = flashlightFactory.getFlashlight(FlashlightEnum.DOUBLE_ENERGY_FLASHLIGHT,
                EnergyEnum.CHINESE_BATTERY, EnergyConsumerEnum.LIGHT_BULB);

        for (int i = 0; i < 10; i++) {
            Assert.assertTrue(flashLight.turnOn());
            flashLight.turnOff();
        }

        Assert.assertFalse(flashLight.turnOn());
        flashLight.turnOff();
        Assert.assertFalse(flashLight.turnOn());
        flashLight.turnOff();
    }

    @Test
    public void TripleEnergyLedFlashlightWithChineseBatteryTest(){

        IDevice flashLight = flashlightFactory.getFlashlight(FlashlightEnum.TRIPLE_ENERGY_LED_FLASHLIGHT,
                EnergyEnum.CHINESE_BATTERY, EnergyConsumerEnum.LIGHT_LED);

        for (int i = 0; i < 50; i++) {
            Assert.assertTrue(flashLight.turnOn());
            flashLight.turnOff();
        }

        Assert.assertFalse(flashLight.turnOn());
        flashLight.turnOff();
        Assert.assertFalse(flashLight.turnOn());
        flashLight.turnOff();
    }

}
