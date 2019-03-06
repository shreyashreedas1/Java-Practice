

/*Program to write applets to draw the various shapes:
(a) Cylinder	(b) Cube	(c) Square inside a circle
(e) Circle inside a squar	(e) Poygon	*/
import java.awt.*;
import java.applet.*;
/* <applet code="MyApp" width=200 height=60>
 </applet>
*/
public class Shapes extends Applet
{
public void paint(Graphics g)
{
/*Cylinder*/
g.drawString("(a).Cylinder",10,110);
g.drawOval(10,10,50,10);
g.drawOval(10,80,50,10);
g.drawLine(10,15,10,85);
g.drawLine(60,15,60,85);
/*Cube*/
g.drawString("(b).Cube",95,110);
g.drawRect(80,10,50,50);
g.drawRect(95,25,50,50);
g.drawLine(80,10,95,25);
g.drawLine(130,10,145,25);
g.drawLine(80,60,95,75);
g.drawLine(130,60,145,75);
/*Squar Inside A Circle*/
g.drawString("(c).Squar Inside A Circle",150,110);
g.drawOval(180,10,80,80);
g.drawRect(192,22,55,55);
/*Circle Inside a Squar*/
g.drawString("(d).Circle Inside a Squar",290,110);
g.drawRect(290,10,80,80);
g.drawOval(290,10,80,80);
/*Polygon*/
g.drawString("(e).Polygon",90,250);
int a[]={200,400,200,400};
int b[]={200,500,500,200};
g.drawPolygon(a,b,4);

}
} 