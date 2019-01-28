package by.zapolski.flashlight;

import by.zapolski.energy.IEnergySource;

public interface Flashlight {
    boolean turnOn();
    void turnOff();
    IEnergySource getEnergySource();
    void setEnergySource(IEnergySource energySource);
}
