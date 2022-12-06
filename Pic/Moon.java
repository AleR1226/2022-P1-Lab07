package Pic;
import java.awt.*;
import java.applet.*;
import java.util.Random;

import static java.awt.Color.white;

public class Moon{

    public static void drawMoon (Graphics g) {
        g.drawOval(400, 100, 400, 400);
        g.drawOval(400, 100, 401, 400);
        g.drawOval(400, 100, 402, 400);
        g.drawOval(400, 100, 400, 401);
        g.drawOval(400, 100, 400, 402);
        g.drawOval(350,125,350,325);
        g.setColor(Color.white);
        g.fillArc(400,100,401,400, 120,104);
        g.fillArc(348,125,354,328,97,150);
    }

    public static void drawSpots (Graphics g) {
        g.setColor(Color.black);
        Random rand = new Random();
        for(int k=1; k<=5; k++){
            int hw = rand.nextInt(21)+10;
            int x1 = rand.nextInt(51-hw)+700;
            int y1 = rand.nextInt(301-hw)+150;
            g.drawOval(x1,y1,hw,hw);

        }
    }

    public static void drawStars (Graphics g) {
        Random rand = new Random();
        for(int k=1; k<=15; k++){
            int x1 = rand.nextInt(230)+400;
            int y1 = rand.nextInt(251)+150;
            g.drawOval(x1,y1,1,1);
        }
    }







}
