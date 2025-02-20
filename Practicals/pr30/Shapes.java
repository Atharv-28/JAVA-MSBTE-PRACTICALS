import java.applet.*;
import java.awt.*;

public class Shapes extends Applet {

    public void paint(Graphics g) {
        g.drawOval(30, 60, 250, 100);// Cylinder
        g.drawLine(30, 100, 30, 300);
        g.drawLine(280, 100, 280, 300);
        g.drawOval(30, 230, 250, 150);
        g.drawOval(300, 60, 280, 60);// Cone
        g.drawLine(430, 280, 580, 90);
        g.drawLine(300, 90, 430, 280);
        g.drawRect(600, 100, 200, 200); // Cube
        g.drawRect(700, 200, 200, 200);
        g.drawLine(600, 100, 700, 200);
        g.drawLine(800, 100, 900, 200);
        g.drawLine(600, 300, 700, 400);
        g.drawLine(800, 300, 900, 400);
    }
}

/* <applet code="Shapes.class" width=900 height=500></applet> */