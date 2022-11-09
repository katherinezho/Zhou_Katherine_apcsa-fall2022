//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block()
	{


	}

	//add other Block constructors - x , y , width, height, color
	public Block(int x, int y) {
		this(x, y, 10, 10, Color.black);
	}
	 public Block(int x, int y, int width) {
		 this(x, y, width, 10, Color.black);
	 }
	public Block(int x, int y, int width, int height) {
		this(x, y, width, height, Color.black);
	   }

	public Block(int x, int y, int width, int height, Color color) {
		setX(x);
		setY(y);
		setWidth(width);
		setHeight(height);
		setColor(color);
	   }
	   
	
	
	
   //add the other set methods
   

   public void setColor(Color col)
   {
	   color = col;
   }

   public void draw(Graphics window)
   {
   
      window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }
  

   public void draw(Graphics window, Color col)
   {
	   window.setColor(col);
	   window.fillRect(getX(), getY(), getWidth(), getHeight());


   }
   
   public boolean equals(Object obj) {
		if(this.getClass() == obj.getClass() && getX() == ((Block) obj).getX() && getY() == ((Block) obj).getY() && getWidth() == ((Block) obj).getWidth() && getHeight() == ((Block) obj).getHeight() && getColor() == ((Block) obj).getColor())
				return true;
		return false;
	}

	
	public void setPos(int x, int y) {
		xPos = x;
		yPos = y;
		
	}

	public void setX(int x) {
		xPos = x;
		
	}

	
	public void setY(int y) {
		yPos = y;
		
	}
	public void setWidth(int w) {
		width = w;
	}
	public void setHeight(int h) {
		height = h;
	}

	
	public int getX() {
		
		return xPos;
	}

	
	public int getY() {
		return yPos;
	}   
	
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
		
	}
	public Color getColor() {
		return color;
	}
	

  

   //add a toString() method  - x , y , width, height, color
	public String toString() {
		return "" + getX() + " "  + getY() + " " + getWidth() + " " + getHeight() + " " + getColor();
	
	}
}