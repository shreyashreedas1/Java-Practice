import java.awt.*;
import java.applet.Applet;
/*<applet code="AppCycle.class" width=200 height=200>
</applet>*/
public class AppCycle extends Applet{
	String msg="";
	public void init()
		{
			System.out.println("Init Method"); 
		}
	public void start()
		{
			System.out.println("Start Method");
		}
	public void stop()
		{
			System.out.println("Stop Method");
		}
	public void destroy()
		{
			System.out.println("Destroy Method");
		}

	public  void paint(Graphics g)
		{
		msg="Example of Applet Life Cycle";
		g.drawString(msg,30,30);
		System.out.println(msg);
}
}
