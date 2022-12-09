package Pic;
import java.awt.*;
import java.applet.*;
import java.util.Random;
public class Trees{

    public static void drawTrunk1 (Graphics g){
        g.drawRect(550,395, 5,53);
        Random rand = new Random();
        for(int k=1; k<15; k++) {
            int x1 = rand.nextInt(6-1) + 550;
            int y1 = rand.nextInt(44-1) + 405;
            g.drawRect(x1,y1,1,1);

        }
    }

    public static void drawTrunk2 (Graphics g) {
        g.drawRect(520,410, 3,40);
        Random rand = new Random();
        for(int k=1; k<=10; k++) {
            int x1 = rand.nextInt(4-1) + 520;
            int y1 = rand.nextInt(21-1) + 420;
            g.drawRect(x1, y1, 1, 1);
        }
        g.drawRect(520,371, 3,44);
    }

    public static void drawLeaf1 (Graphics g) {
        int f = 5;
        int h = 0;
        for(int k = 1; k<= 11; k++){
        Polygon b4 = new Polygon();
        b4.addPoint(520,420-h);
        b4.addPoint(516-f,423-h);
        b4.addPoint(515-f,422-h);
        b4.addPoint(513-f,424-h);
        b4.addPoint(510-f,421-h);
        b4.addPoint(507-f,423-h);
        b4.addPoint(505-f, 422-h);
        b4.addPoint(520,415-h);
        b4.addPoint(523,420-h);
        b4.addPoint(527+f,423-h);
        b4.addPoint(528+f,422-h);
        b4.addPoint(530+f,424-h);
        b4.addPoint(533+f,421-h);
        b4.addPoint(536+f,423-h);
        b4.addPoint(538+f, 422-h);
        b4.addPoint(523,415-h);
        g.fillPolygon(b4);
        f -=2;
        h += 4;
        }
    }

    public static void drawLeaf2 (Graphics g) {

    }



}
