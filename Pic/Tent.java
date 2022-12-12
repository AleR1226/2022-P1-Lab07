package Pic;
import java.awt.*;
import java.applet.*;
public class Tent{

    public static void drawPost (Graphics g) {
        g.setColor(new Color(3, 0, 0));
        g.drawLine(600, 406,600,434);
        g.drawLine(599, 406,599,435);

    }
    public static void drawFlap (Graphics g) {
        Polygon fl1 = new Polygon();
        fl1.addPoint(600,405);
        fl1.addPoint(614,427);
        fl1.addPoint(625,420);
        fl1.addPoint(614,403);
        g.setColor(new Color(97, 10, 10));
        g.fillPolygon(fl1);
        g.setColor(Color.black);
        g.drawPolygon(fl1);
        Polygon fl2 = new Polygon();
        fl2.addPoint(599,404);
        fl2.addPoint(587,440);
        fl2.addPoint(599,435);
        fl2.addPoint(599,406);
        g.setColor(new Color(51, 5, 5));
        g.fillPolygon(fl2);
        g.setColor(Color.black);
        g.drawPolygon(fl2);
        g.setColor(new Color(51, 5, 5));
        Polygon bs = new Polygon();
        bs.addPoint(600, 406);
        bs.addPoint(600, 434);
        bs.addPoint(614, 427);
        g.fillPolygon(bs);



    }




}
