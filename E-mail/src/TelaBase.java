import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Dimension;

public class TelaBase extends Frame
{
	TelaBase()
	{
		Dimension D01 = new Dimension (300,300);
		
		this.setSize(D01);
		this.setTitle("TelaBase");
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e) 
			{
				dispose();
			}
		});
	}
}
