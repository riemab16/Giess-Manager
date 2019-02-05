package Main;

import BL.GiessBL;
import GUI.GiessManagerImages;
import GUI.GiessManagerInput;
import GUI.GiessManagerStatus;

public class Main {

    public static void main(String[] args) {
        GiessBL bl = new GiessBL();

        GiessManagerInput gmInput = new GiessManagerInput(bl);
        GiessManagerImages gmImages = new GiessManagerImages();
        GiessManagerStatus gmStatus = new GiessManagerStatus();

        bl.register(gmStatus);
        bl.register(gmImages);

        gmInput.setVisible(true);
        gmImages.setVisible(true);
        gmStatus.setVisible(true);
    }
}
