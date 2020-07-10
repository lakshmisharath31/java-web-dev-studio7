package org.launchcode.studio7;

public class DVD extends BaseDisc implements IOpticalDisc {
    String rpm;

    public DVD(String rpm) {
        super(rpm);
        this.rpm=rpm;


    }

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of "+this.rpm+" rpm.");


    }

    

}
