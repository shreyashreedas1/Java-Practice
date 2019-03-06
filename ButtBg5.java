
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code="ButtBg5.class"  width=500 height=500>
</applet>
*/
public class ButtBg5 extends Applet implements ActionListener
	{
	Button b1;
	Button b2;
	Button b3;

public void init()
	{
	b1=new Button("Red Button");
	b2=new Button("Blue Button");
	b3=new Button("Green Button");

	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);

	add(b1);
	add(b2);
	add(b3);
}
public void actionPerformed(ActionEvent e)
	{
	if(e.getSource()==b1)
	{
	setBackground(Color.red);
	}
	else if(e.getSource()==b2)
	{
	setBackground(Color.blue);
	}
	else if(e.getSource()==b3)
	{
	
	setBackground(Color.green);
	}
}
public void paint(Graphics g)
	{
	showStatus("Shreyashree");
}
}