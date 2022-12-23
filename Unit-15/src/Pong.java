//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.lang.Math. *;
import java.util.ArrayList;

public class Pong extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private Paddle leftPaddle;
	private Paddle rightPaddle;
	private boolean[] keys;
	private BufferedImage back;
	private int leftScore = 0;
	private int rightScore = 0;
	private Graphics graphString;
	private int colorCount;
	private ArrayList<Color> colorList;
	private ArrayList<Color> currentColors;
	private int colorIndex;


	public Pong(int color)
	{
		//set up all variables related to the game
		colorIndex = 0;
		colorCount = color;
		colorList = new ArrayList<Color>();
		//add colors to baseList
		currentColors = new ArrayList<Color>();
		currentColors.add(Color.MAGENTA);
		currentColors.add(Color.BLUE);
		currentColors.add(Color.ORANGE);
		currentColors.add(Color.PINK);
		currentColors.add(Color.YELLOW);
		
		//set up new list
		for(int i = 0; i < colorCount; i++) {
			colorList.add(currentColors.get(i));
		}
		
		ball = new Ball();
		ball.setXSpeed(2);
		
		leftPaddle = new Paddle(15, 10, 10, 60, Color.green);
		rightPaddle = new Paddle(765, 10, 10, 60, Color.red);
		
		leftPaddle.setSpeed(2);
		rightPaddle.setSpeed(2);

		keys = new boolean[4];

    
    	setBackground(Color.WHITE);
		setVisible(true);
		
		new Thread(this).start();
		addKeyListener(this);		//starts the key thread to log key strokes
		
	

	}
	
   public void update(Graphics window){
	   paint(window);
   }

   public void paint(Graphics window)
   {
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();
	//	graphToBack.drawRect(0, 0, 790, 560);
		graphToBack.setColor(Color.red);;
		graphToBack.fillRect(380, 500, 100, 20);
		
		graphString = back.createGraphics();
		graphString.setColor(Color.white);
		graphString.drawString("Left: " + leftScore + " Right: " + rightScore, 390, 515);
		
	


		ball.moveAndDraw(graphToBack);
		leftPaddle.draw(graphToBack);
		rightPaddle.draw(graphToBack);


		//see if ball hits left wall or right wall
		if(!(ball.getX()>=10))
		{
			
			rightScore++;
			graphToBack.fillRect(380, 500, 100, 20);
			graphString.drawString("Left: " + leftScore + " Right: " + rightScore, 390, 515);
			
			ball.draw(graphToBack, getBackground());
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				
			};
			ball.setPos(170, 260);
			ball.setXSpeed(2);
			ball.setYSpeed(-2);
			
			
		}
		if(!(ball.getX()<=770))
		{
			leftScore++;
			graphToBack.fillRect(380, 500, 100, 20);
			graphString.drawString("Left: " + leftScore + " Right: " + rightScore, 390, 515);
			
			ball.draw(graphToBack, getBackground());
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				
			};
			ball.setPos(170, 260);
			ball.setXSpeed(2);
			ball.setYSpeed(-2);
			
			
		}

		
		//see if the ball hits the top or bottom wall 
		if(ball.getY() + ball.getHeight() >= 550)
			ball.setYSpeed(ball.getYSpeed() * -1);
		if(ball.getY() - ball.getHeight() <= 15)
			ball.setYSpeed(ball.getYSpeed() * -1);
		
		



		//see if the ball hits the left paddle
		if(ball.getX() <= (leftPaddle.getX() + leftPaddle.getWidth()) && (ball.getY()>= leftPaddle.getY() && ball.getY()<= (leftPaddle.getY() + leftPaddle.getHeight()) || ball.getY() - ball.getHeight() >=leftPaddle.getY() && (ball.getY() + ball.getHeight() < (leftPaddle.getY()+leftPaddle.getHeight()))  ))
		{
			
				ball.setXSpeed(Math.abs(ball.getXSpeed()));
				if(colorIndex < colorList.size()) {
					ball.color(colorList.get(colorIndex));
					colorIndex++;
				}
				else {
					ball.color(colorList.get(0));
					colorIndex = 1;
				}
		}
		
		
		
		//see if the ball hits the right paddle
		if(ball.getX() >= (rightPaddle.getX() - rightPaddle.getWidth()) && (ball.getY()>= rightPaddle.getY() && ball.getY()<= (rightPaddle.getY() + rightPaddle.getHeight()) || ball.getY() - ball.getHeight() >=rightPaddle.getY() && (ball.getY() + ball.getHeight() < (rightPaddle.getY()+rightPaddle.getHeight()))  ))
		{
			
				ball.setXSpeed(-(Math.abs(ball.getXSpeed())));
				if(colorIndex < colorList.size()) {
					ball.color(colorList.get(colorIndex));
					colorIndex++;
				}
				else {
					ball.color(colorList.get(0));
					colorIndex = 1;
				}
		}
		
		
		


		//see if the paddles need to be moved
		if(keys[0] == true) {
			if(leftPaddle.getY()+ leftPaddle.getHeight() >=60) {
				leftPaddle.moveUpAndDraw(graphToBack);
			}
		}
		if(keys[1] == true) {
			if(leftPaddle.getY() <=550) {
				leftPaddle.moveDownAndDraw(graphToBack);
			}
		}
		if(keys[2] == true) {
			if(rightPaddle.getY()+ rightPaddle.getHeight() >= 60) {
				rightPaddle.moveUpAndDraw(graphToBack);
			}
		}
		if(keys[3] == true) {
			if(rightPaddle.getY() <=550) {
				rightPaddle.moveDownAndDraw(graphToBack);
			}
		}
	/*	if(keys[4] == true) {
			//if(leftPaddle.getX() >= 10) {
				leftPaddle.moveLeftAndDraw(graphToBack);
			//}
		}
		if(keys[5] == true) {
			//if(leftPaddle.getX() <=770) {
				leftPaddle.moveRightAndDraw(graphToBack);
			//}
		}
		if(keys[6] == true) {
			//if(rightPaddle.getX() >= 10) {
				rightPaddle.moveLeftAndDraw(graphToBack);
			//}
		}
		if(keys[7] == true) {
			//if(rightPaddle.getX() <=770) {
				rightPaddle.moveRightAndDraw(graphToBack);
			//}
		}

*/
		if( (ball.getX()>=10)  &&  (ball.getX()<= 770))
		   twoDGraph.drawImage(back, null, 0, 0);
	}

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'Z' : keys[1]=true; break;
			case 'I' : keys[2]=true; break;
			case 'M' : keys[3]=true; break;
			case 'A' : keys[4]=true; break;
			case 'S' : keys[5]=true; break;
			case 'J' : keys[6]=true; break;
			case 'K' : keys[7]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=false; break;
			case 'Z' : keys[1]=false; break;
			case 'I' : keys[2]=false; break;
			case 'M' : keys[3]=false; break;
			case 'A' : keys[4]=false; break;
			case 'S' : keys[5]=false; break;
			case 'J' : keys[6]=false; break;
			case 'K' : keys[7]=false; break;
		}
	}

	public void keyTyped(KeyEvent e){}
	
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(8);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}
   
   
   
   
   
}