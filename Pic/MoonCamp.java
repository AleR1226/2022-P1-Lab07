package Pic;

import java.awt.*;
import java.applet.*;


public class MoonCamp extends Applet {

    public void paint(Graphics g) {
        Moon.drawMoon(g);
        Moon.drawSpots(g);
        Moon.drawStars(g);

        Tent.drawPost(g);
        Tent.drawFlap(g);

        Trees.drawTrunk1(g);
        Trees.drawTrunk2(g);
        Trees.drawLeaf1(g);
        Trees.drawLeaf2(g);




    }
}