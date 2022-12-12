package Pic;
import java.awt.*;
import java.applet.*;
import java.util.Random;

import static java.awt.Color.white;

public class Moon{

    public static void drawMoon (Graphics g) {
        g.setColor(new Color(41, 24, 64));
        g.fillRect(0,0,1000,1000);
        g.setColor(new Color(232, 232, 216));
        g.fillOval(400, 100, 400, 400);
        g.setColor(Color.black);
        g.drawOval(400, 100, 400, 400);
        g.drawOval(400, 100, 401, 400);
        g.drawOval(400, 100, 402, 400);
        g.drawOval(400, 100, 400, 401);
        g.drawOval(400, 100, 400, 402);
        g.setColor(new Color(41, 24, 64));
        g.fillOval(350,125,350,325);
        g.setColor(new Color(41, 24, 64));
        g.fillArc(400,100,401,400, 120,104);
        g.fillArc(348,125,354,328,97,150);
    }

    public static void drawSpots (Graphics g) {
        g.setColor(Color.black);
        Random rand = new Random(1234);
        for(int k=1; k<=5; k++){
            int hw = rand.nextInt(21)+10;
            int x1 = rand.nextInt(51-hw)+700;
            int y1 = rand.nextInt(301-hw)+150;
            g.setColor(new Color(204, 204, 192));
            g.fillOval(x1,y1,hw,hw);

        }
    }

    public static void drawStars (Graphics g) {
        Random rand = new Random(1234);
        g.setColor(Color.white);
        for(int k=1; k<=500; k++){
            int x1 = rand.nextInt(1000);
            int y1 = rand.nextInt(1000);
            g.drawOval(x1,y1,2,2);
        }
    }







}
