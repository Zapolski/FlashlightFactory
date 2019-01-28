package by.zapolski;

import by.zapolski.energy.AccumulatorBattery;
import org.junit.Assert;
import org.junit.Test;

public class AccumulatorBatteryTests {

    AccumulatorBattery accumulatorBattery = new AccumulatorBattery();

    @Test
    public void AccumulatorBatteryRechargeTest(){
        accumulatorBattery.useCharge(AccumulatorBattery.CAPACITY);
        Assert.assertEquals(0,accumulatorBattery.getCharge());
        accumulatorBattery.recharge();
        Assert.assertEquals(AccumulatorBattery.CAPACITY,accumulatorBattery.getCharge());
    }
}
