//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

public class Ammo extends MovingThing
{
	private int speed;

	public Ammo()
	{
		this(0,0,0);
	}

	public Ammo(int x, int y)
	{
		//add code
		this(x,y,0);

	}

	public Ammo(int x, int y, int s)
	{
		//add code
		super(x,y);
		setSpeed(s);
		setWidth(5);
		setHeight(5);

	}

	public void setSpeed(int s)
	{
	   //add code
		this.speed = s;
	}

	public int getSpeed()
	{
	   return this.speed;
	}

	public void draw( Graphics window )
	{
		//add code to draw the ammo
		window.setColor(Color.yellow);
		window.fillRect(getX(), getY(), getWidth(), getHeight());
	}
	
	
	public void move( String direction )
	{
		//add code to draw the ammo
		if(direction.equals("UP")) {
			setY(getY() - getSpeed());
		}
		if(direction.equals("DOWN")) {
			setY(getY() + getSpeed());
		}
		if(direction.equals("LEFT")) {
			setX(getX() - getSpeed());
		}
		if(direction.equals("RIGHT")) {
			setX(getX() + getSpeed());
		}
	}

	public String toString()
	{
		return "";
	}
}
