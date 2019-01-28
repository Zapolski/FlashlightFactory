package by.zapolski.energyConsumer;

public class EnergyConsumerFactory {

    private static EnergyConsumerFactory instance;
    public EnergyConsumerFactory() {}
    public static EnergyConsumerFactory getInstance(){
        if (instance==null){
            return new EnergyConsumerFactory();
        }
        return instance;
    }


    public IEnergyConsumer getEnergyConsumer(EnergyConsumerEnum energyConsumerEnum){
        switch (energyConsumerEnum){
            case LIGHT_BULB:{
                return new LightBulb();
            }
            case SPEAKER:{
                return new Speacker();
            }
            case LIGHT_LED:{
                return new LightLED();
            }
        }
        return null;
    }
}
