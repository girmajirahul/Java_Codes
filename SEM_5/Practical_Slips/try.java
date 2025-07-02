
import java.awt.*;
import java.awt.event.*;
 class slip8_20 extends Frame
{
	TextField position;
	
	public slip8_20()
	{
		setLayout(new FlowLayout(30));
		
		position=new TextField(30);
		
		add(position);
		
		addMouseMotionListener(new MouseMotionAdapter()
		{
			public void mouseMoved(MouseEvent e)
			{
				displayposition("Mouse Moved",e.getX(),e.getY());
			}
		});
		
		addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e)
			{
				displayposition("Mouse Clicked",e.getX(),e.getY());
			}
		});
		
		setTitle("Mouse Event Example");
		setSize(400,300);
		setVisible(true);
	}
	
	public void displayposition(String event, int x, int y)
	{
		position.setText(event+" X: "+x+" Y: "+y);
	}
	
	public static void main(String[] args)
	{
		new slip8_20();
	}
}