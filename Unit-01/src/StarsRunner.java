//� A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StarsRunner
{
   public static void main(String args[])
   {
      //instantiate a StarsAndStripes object
      StarsAndStripes drawing = new StarsAndStripes();
      
      //call the methods needed to make the patterns on the word document
      drawing.printTwentyDashes();
      drawing.printTwentyStars();
      drawing.printTwentyDashes();
      drawing.printTwentyStars();
      drawing.printTwentyDashes();
      drawing.printTwentyStars();
      drawing.printTwentyDashes();
      
      drawing.printTwoBlankLines();
      drawing.printTwentyDashes();
      drawing.printTwentyStars();
      drawing.printTwentyDashes();
      drawing.printTwentyStars();
      drawing.printTwentyDashes();
      drawing.printTwentyStars();
      
      drawing.printTwentyDashes();
      drawing.printTwentyDashes();
      drawing.printTwentyStars();
      drawing.printTwentyDashes();
      drawing.printTwentyStars();
      drawing.printTwentyDashes();
      drawing.printTwentyStars();
      drawing.printTwentyDashes();
     
      System.out.println("my own drawing:");
      drawing.printASmallBox();
      drawing.printABigBox();
      drawing.printTwentyStars();
      drawing.printTwentyDashes();
      drawing.printTwoBlankLines();
      drawing.printASmallBox();
      drawing.printTwentyDashes();
      drawing.printTwentyStars();
   }
}