package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){
        CD cd = new CD("200-500");
        DVD dvd = new DVD( "570-1600");
        FloppyDisc floppyDisc = new FloppyDisc("300-360");
        LP lp = new LP( "33.33");
        cd.spinDisc();
        dvd.spinDisc();
        floppyDisc.spinDisc();
        lp.spinDisc();

        

    }
}
