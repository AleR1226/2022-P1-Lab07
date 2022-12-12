package Pic;
import java.awt.*;
import java.applet.*;
import java.util.Random;
public class Trees{

    public static void drawTrunk1 (Graphics g){
        g.setColor(new Color(77, 63, 26));
        g.fillRect(550,395, 5,53);
        g.setColor(new Color(36, 29, 12));
        Random rand = new Random(1234565);
        for(int k=1; k<15; k++) {
            int x1 = rand.nextInt(6-2) + 550;
            int y1 = rand.nextInt(44-2) + 405;
            g.drawRect(x1,y1,1,1);

        }
        g.setColor(new Color(36, 112, 58));
        g.fillRect(550,360, 5,44);
    }

    public static void drawTrunk2 (Graphics g) {
        g.setColor(new Color(77, 63, 26));
        g.fillRect(520,410, 3,40);
        g.setColor(new Color(36, 29, 12));
        Random rand = new Random(1234565);
        for(int k=1; k<=10; k++) {
            int x1 = rand.nextInt(4-2) + 520;
            int y1 = rand.nextInt(21-2) + 420;
            g.drawRect(x1, y1, 1, 1);
        }
        g.setColor(new Color(26, 77, 39));
        g.fillRect(520,381, 3,44);
    }

    public static void drawLeaf2 (Graphics g) {
        g.setColor(new Color(26, 77, 39));
        int f = 5;
        int h = 0;
        for(int k = 1; k<= 10; k++){
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

    public static void drawLeaf1 (Graphics g) {
        g.setColor(new Color(36, 112, 58));
        int f=7;
        int h=0;
        for(int k = 1; k<= 12; k++) {
            Polygon l1 = new Polygon();
            l1.addPoint(550, 405 - h);
            l1.addPoint(546 - f, 408 - h);
            l1.addPoint(545 - f, 407 - h);
            l1.addPoint(543 - f, 409 - h);
            l1.addPoint(540 - f, 406 - h);
            l1.addPoint(537 - f, 408 - h);
            l1.addPoint(535 - f, 407 - h);
            l1.addPoint(550, 400 - h);
            l1.addPoint(555, 405 - h);
            l1.addPoint(559 + f, 408 - h);
            l1.addPoint(560 + f, 407 - h);
            l1.addPoint(562 + f, 409 - h);
            l1.addPoint(565 + f, 406 - h);
            l1.addPoint(568 + f, 408 - h);
            l1.addPoint(570 + f, 407 - h);
            l1.addPoint(555, 400 - h);
            g.fillPolygon(l1);
            f -=2;
            h += 4;
        }
    }



}
