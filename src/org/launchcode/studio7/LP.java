package org.launchcode.studio7;

public class LP extends BaseDisc implements IOpticalDisc {
    String rpm;

    public LP(String rpm) {
        super(rpm);
        this.rpm = rpm;


    }

    @Override
    public void spinDisc() {
        System.out.println(" A LP spins at a rate of " + this.rpm + " rpm.");

    }
}