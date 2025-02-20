import java.awt.*;
import java.applet.*;

public class face extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.fillOval(25, 40, 150, 150);// shape of face
        g.setColor(Color.white);
        g.fillOval(57, 75, 30, 30);// left eye
        g.fillOval(110, 75, 30, 30);// right eye
        g.setColor(Color.black);
        g.fillOval(68, 85, 10, 10);// left pupil
        g.fillOval(120, 85, 10, 10);// right pupil
        Color c1= new Color(139, 128, 0);
        g.setColor(c1);
        g.fillOval(95, 115, 10, 10);// nose
        g.setColor(Color.white);
        g.fillArc(60, 125, 80, 40, 180, 180);// smile
    }
}
/* <applet code="face.class" width=300 height=300></applet> */