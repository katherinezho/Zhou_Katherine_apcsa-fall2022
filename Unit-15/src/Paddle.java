//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int speed;

   public Paddle()
   {
	   super(10,10);
	   speed = 5;
   }


   //add the other Paddle constructors
   public Paddle(int x, int y) {
	   super(x,y);
	   speed = 5;
   }
   public Paddle(int x, int y, int width) {
	   super(x, y, width);
	   speed = 5;
   }
   public Paddle(int x, int y, int width, int height) {
	   super(x, y, width, height);
	   speed = 5;
   }
   public Paddle(int x, int y, int width, int height, int speed) {
	   super(x, y, width, height);
	   this.speed = speed;
   }

   public Paddle(int x, int y, int width, int height, Color color) {
	   super(x, y, width, height, color);
	   speed = 5;
   }
   public Paddle(int x, int y, int width, int height, Color color, int speed) {
	   super(x, y, width, height, color);
	   this.speed = speed;
   }







   public void moveUpAndDraw(Graphics window)
   {


   }

   public void moveDownAndDraw(Graphics window)
   {


   }

   //add get methods
   public int getSpeed() {
	   return speed;
   }
   
   
   //add a toString() method
   public String toString() {
	   return super.toString() + " " + getSpeed();
   }
}