package by.zapolski.energy;

public class EnergySourceFactory {

    private static EnergySourceFactory instance;
    private EnergySourceFactory() {}
    public static EnergySourceFactory getInstance() {
        if (instance ==null){
            return new EnergySourceFactory();
        }
        return instance;
    }

    public IEnergySource getEnergySource(EnergyEnum energyEnum){
        switch (energyEnum){
            case CHINESE_BATTERY:{
                return new ChineseBattery();
            }
            case DURACELL_BATTERY:{
                return new DuracellBattery();
            }
            case ACCUMULATOR_BATTERY:{
                return new AccumulatorBattery();
            }
        }
        return null;
    }


}
