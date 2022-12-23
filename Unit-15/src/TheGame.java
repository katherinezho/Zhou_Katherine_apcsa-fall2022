//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import javax.swing.JFrame;
import java.util.Scanner;
import java.awt.Component;

public class TheGame extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public TheGame(int color)
	{
		super("PONG");
		setSize(WIDTH,HEIGHT);

		Pong game = new Pong(color);

		((Component)game).setFocusable(true);
		getContentPane().add(game);

		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		int colorCount = 0;
		
		while(colorCount == 0) {
			System.out.println("How many colors should your ball switch between? (Pick a number 1-5):: ");
			colorCount = keyboard.nextInt();
			
			if(colorCount <1 || colorCount >5) {
				System.out.println("Number out of range. Try Again.");
				colorCount = 0;
			}
			else {
				TheGame run = new TheGame(colorCount);
			}

		}
		
	}
}