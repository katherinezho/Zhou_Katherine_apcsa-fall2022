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


	public Pong()
	{
		//set up all variables related to the game


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
			ball.setXSpeed(1);
			ball.setYSpeed(-1);
			
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
			ball.setXSpeed(1);
			ball.setYSpeed(-1);
			
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
		}
		
		
		
		//see if the ball hits the right paddle
		if(ball.getX() >= (rightPaddle.getX() - rightPaddle.getWidth()) && (ball.getY()>= rightPaddle.getY() && ball.getY()<= (rightPaddle.getY() + rightPaddle.getHeight()) || ball.getY() - ball.getHeight() >=rightPaddle.getY() && (ball.getY() + ball.getHeight() < (rightPaddle.getY()+rightPaddle.getHeight()))  ))
		{
			
				ball.setXSpeed(-(Math.abs(ball.getXSpeed())));
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