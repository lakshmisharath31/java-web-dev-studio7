package org.launchcode.studio7;

public class FloppyDisc extends BaseDisc implements IOpticalDisc {
    String rpm;

    public FloppyDisc(String rpm) {
        super(rpm);
        this.rpm = rpm;


    }

    @Override
    public void spinDisc() {
        System.out.println(" A FloppyDisc spins at a rate of " + this.rpm + " rpm.");
    }
}
