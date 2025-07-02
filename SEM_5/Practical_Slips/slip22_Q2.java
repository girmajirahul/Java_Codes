import java.awt.*;
import java.awt.event.*;

public class slip22_Q2 extends Frame
{
	Label event;
	
	public slip22_Q2()
	{
		setLayout(new FlowLayout());
		event=new Label();
		add(event);
		
		addMouseMotionListener(new MouseMotionAdapter()
		{
			public void mouseMoved(MouseEvent e)
			{
				event.setText("MOUSE MOVED");
				event.setForeground(Color.RED);
			}
		});
		
		addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e)
			{
				event.setText("MOUSE CLICKED");
				event.setForeground(Color.RED);
			}
			
			public void mousePressed(MouseEvent e)
			{
				event.setText("MOUSE PRESSED");
				event.setForeground(Color.RED);
			}
			
			public void mouseReleased(MouseEvent e)
			{
				event.setText("MOUSE RELEASED");
				event.setForeground(Color.RED);
			}
			
			public void mouseExited(MouseEvent e)
			{
				event.setText("MOUSE EXITED");
				event.setForeground(Color.RED);
			}
		});
		
		setTitle("Mouse Events");
		setSize(400,400);
		setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new slip22_Q2();
	}
}
