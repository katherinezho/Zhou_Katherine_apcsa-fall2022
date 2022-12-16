//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde
{
	private List<Alien> aliens;

	public AlienHorde(int size)
	{
		aliens = new ArrayList<Alien>();
		for(int i = 0; i < size; i++) {
			aliens.add(new Alien());
		}
	}

	public void add(Alien al)
	{
		
		aliens.add(al);
		/*Alien beforeHit = null;
		if(aliens.size() > 0)
		{
			beforeHit = aliens.get(aliens.size() - 3);
		}
		al = new Alien(beforeHit.getX() + beforeHit.getWidth() + 10, beforeHit.getY());
		aliens.add(al);
		*/
	}

	public void drawEmAll( Graphics window )
	{
		for(int i = 0; i < aliens.size(); i++) {
			aliens.get(i).draw(window);
		}
	}

	public void moveEmAll()
	{
		for(int i = 0; i < aliens.size(); i++) {
			
			Alien temp = aliens.get(i);
			if(i == 0 || aliens.get(i-1).getY() != temp.getY()
					|| temp.getX() + aliens.get(i-1).getWidth() + 50 < aliens.get(i-1).getX()
					|| temp.getX() > aliens.get(i-1).getX() + aliens.get(i-1).getWidth() + 50)
			{
				if(temp.getSpeed() > 0 && temp.getX() >= 800 - temp.getSpeed() - temp.getWidth()
						|| temp.getSpeed() < 0 && temp.getX() <= -temp.getSpeed())
				{
					temp.setSpeed(-temp.getSpeed());
					temp.setY(temp.getX() + temp.getSpeed());
				}
				else
					temp.setX(temp.getX() + temp.getSpeed());
			}
		}
	}

	public void removeDeadOnes(List<Ammo> shots)
	{
		for(int i = 0; i < shots.size(); i++) {
			Ammo temp = shots.get(i);
			
			for(int x = 0; x < aliens.size(); x++) {
				Alien tempAlien = aliens.get(x);
				
				if(temp.getX() < (tempAlien.getX() + tempAlien.getWidth() + Math.abs(temp.getSpeed()))
						&& temp.getX() >= (tempAlien.getX() - temp.getWidth() - Math.abs(temp.getSpeed()))
						&& temp.getX() <= tempAlien.getX() + tempAlien.getWidth()
						&& temp.getY() < (tempAlien.getY() + tempAlien.getHeight())
						&& (temp.getY() + temp.getHeight()) > tempAlien.getY())
				{
					aliens.remove(x);
					shots.remove(i);
					
					x--;
					i--;
					
				}
			}
		}
	}
	
	public void stopHorde() {
		for(Alien x : aliens) {
			x.setSpeed(0);
		}
	}
	public List<Alien> getList(){
		return aliens;
	}

	public String toString()
	{
		return "";
	}
}
