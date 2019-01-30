package Main;

import BL.GießBL;
import GUI.GießManagerImages;
import GUI.GießManagerInput;
import GUI.GießManagerStatus;

public class Main {

    public static void main(String[] args) {
        GießBL bl = new GießBL();

        GießManagerInput gmInput = new GießManagerInput();
        GießManagerImages gmImages = new GießManagerImages();
        GießManagerStatus gmStatus = new GießManagerStatus();

        bl.register(gmStatus);
        bl.register(gmImages);

        gmInput.setVisible(true);
        gmImages.setVisible(true);
        gmStatus.setVisible(true);
    }
}
