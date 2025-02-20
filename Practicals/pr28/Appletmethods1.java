import java.applet.*;
import java.awt.*;

public class Appletmethods1 extends Applet
{
public void init()
 {
  System.out.println("initializing an applet");
 }
public void start()
 {
  System.out.println("starting an applet");
 }
public void stop()
 {
  System.out.println(" stopping an applet");
 }
public void destroy()
 {
  System.out.println("Destroying an applet");
 }
}
/*<applet code="Appletmethods1.class" width=400 height=200></applet>*/
 
 