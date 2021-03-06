import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class prog extends Applet implements MouseMotionListener,MouseListener
{
	int startx, starty, x, y, height, width;

	public void init()
	{
		addMouseListener(this);
		addMouseMotionListener(this);
	}

	@Override
	public void mouseDragged(MouseEvent e) {

		x=startx;
		y=starty;
		height=e.getX()-startx;
		width=e.getY()-starty;

		if(height<0)
		{
			x=e.getX();
			height=Math.abs(height);
		}
		if(width<0)
		{
			y=e.getY();
			width=Math.abs(width);
		}
		repaint();

	}

	@Override
	public void mouseReleased(MouseEvent e) 
	{
		startx=e.getX();
		starty=e.getY();
		showStatus("mouse pressed");

	}

	public void paint(Graphics g)
	{	
		g.drawRect(x,y,height,width);
	}
	@Override
	public void mouseMoved(MouseEvent e) {}
	@Override
	public void mouseClicked(MouseEvent e) {}
	@Override
	public void mouseEntered(MouseEvent e) {}
	@Override
	public void mouseExited(MouseEvent e) {}
	@Override
	public void mousePressed(MouseEvent e) {}

}
