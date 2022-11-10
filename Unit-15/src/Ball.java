//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200, 200);
		xSpeed = 3;
		ySpeed = 1;
	}

	//add the other Ball constructors
	public Ball(int x, int y){
		super(x, y);
		xSpeed = 3;
		ySpeed = 1;
	}
	public Ball(int x, int y, int height, int width){
		this(x, y, height, width);
		xSpeed = 3;
		ySpeed = 1;
	}
	public Ball(int x, int y, int height, int width, Color color){
		this(x, y, height, width, color);
		xSpeed = 3;
		ySpeed = 1;
	}
	public Ball(int x, int y, int height, int width, Color color, int xSpeed, int ySpeed){
		super(x, y, height, width, color);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	   
   //add the set methods
   public void setXSpeed(int x){
   	xSpeed = x;
   }
   public void setYSpeed(int y){
   	ySpeed = y;
   }
   

   public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location
	   super.draw(window, Color.white);


      setX(getX()+xSpeed);
      setY(getY() + ySpeed);
		//setY

		//draw the ball at its new location
      super.draw(window);
   }
   
	public boolean equals(Object obj)
	{
		if(super.equals(obj) && getXSpeed() == ((Ball) obj).getXSpeed() && getYSpeed() == ((Ball) obj).getYSpeed())
			return true;
		return false;
	}   

   //add the get methods
    public int getXSpeed(){
   	return xSpeed;
   }
   public int getYSpeed(){
   	return ySpeed;
   }

   //add a toString() method
   public String toString(){
   	return super.toString() + " " + getXSpeed() + " " + getYSpeed();
   }
}
