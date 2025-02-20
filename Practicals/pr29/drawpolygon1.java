import java.awt.*;
import java.applet.*;
public class drawpolygon1 extends Applet
{
int xcoords[]={90,45,100,200,190,90};
int ycoords[]={200,0,90,80,30,200};
int xfillcoords[]={450,600,700,550,450,450};
public void paint(Graphics g)
{
g.drawPolygon(xcoords,ycoords,6);
g.fillPolygon(xfillcoords,ycoords,6);
}
}
/*<applet code="drawpolygon1.class" width=900 height=900></applet>*/