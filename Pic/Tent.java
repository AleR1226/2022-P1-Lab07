package Pic;
import java.awt.*;
import java.applet.*;
public class Tent{

    public static void drawPost (Graphics g) {
        g.drawLine(600,405,600,434);
        g.drawLine(599,405,599,435);
        g.drawLine(601,405,601,433);
    }
    public static void drawFlap (Graphics g) {
        Polygon fl1 = new Polygon();
        fl1.addPoint(600,405);
        fl1.addPoint(614,427);
        fl1.addPoint(625,420);
        fl1.addPoint(614,403);
        g.drawPolygon(fl1);
        g.drawLine(599,404,587,440);



    }




}
