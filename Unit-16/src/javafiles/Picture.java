package javafiles;
import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  /** Method to set the blue to 0 */
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }
  
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 27; row < 97; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++)
      {
        
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row]                       
                         [mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
  }
  
  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic, int startRow, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
         fromRow < fromPixels.length &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }

  /** Method to create a collage of several pictures */
  public void createCollage()
  {
    Picture flower1 = new Picture("src/images/flower1.jpg");
    Picture flower2 = new Picture("src/images/flower2.jpg");
    this.copy(flower1,0,0);
    this.copy(flower2,100,0);
    this.copy(flower1,200,0);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue,300,0);
    this.copy(flower1,400,0);
    this.copy(flower2,500,0);
    this.mirrorVertical();
    this.write("src/images/collage.jpg");
  }
  
  
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > 
            edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
  }
  
  
  public void keepOnlyBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setRed(0);
        pixelObj.setGreen(0);
      }
    }
  }
  public void keepOnlyRed()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
        pixelObj.setGreen(0);
      }
    }
  }
  public void keepOnlyGreen()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setRed(0);
        pixelObj.setBlue(0);
      }
    }
  }
  public void negate() {
    Pixel[][] pixels = this.getPixels2D();
    int red;
    int green;
    int blue;
    for(Pixel[] rowArray : pixels) {
      for(Pixel pixelObj : rowArray) {
        red = 255 - pixelObj.getRed();
        green = 255 - pixelObj.getGreen();
        blue = 255 - pixelObj.getBlue();
        pixelObj.setGreen(green);
        pixelObj.setRed(red);
        pixelObj.setBlue(blue);
      }
    }
  }
  public void grayscale() {
    Pixel[][] pixels = this.getPixels2D();
    for(Pixel[] rowArray : pixels) {
      for(Pixel pixelObj : rowArray) {
        int color = pixelObj.getGreen() + pixelObj.getRed() + pixelObj.getBlue();
        color = color/ 3;
        pixelObj.setGreen(color);
        pixelObj.setRed(color);
        pixelObj.setBlue(color);
      }
    }
  }
  public void fixUnderwater() {
    Pixel[][] pixels = this.getPixels2D();
    for(Pixel[] rowArray : pixels) {
      for(Pixel pixelObj : rowArray) {
      pixelObj.setRed(pixelObj.getRed()*5);
      }
    }   
  }
  public void mirrorVerticalRightToLeft() {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++){
      for (int col = 0; col < width / 2; col++) {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        leftPixel.setColor(rightPixel.getColor());
      }
     }
  }
  public void mirrorHorizontal(){
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels.length;
    for (int col = 0; col < pixels[0].length; col++){
      for (int row = 0; row < width / 2; row++){
        leftPixel = pixels[row][col];
        rightPixel = pixels[width - 1 - row][col];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
  }
  public void mirrorHorizontalBotToTop(){
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels.length;
    for (int col = 0; col < pixels[0].length; col++){
      for (int row = 0; row < width / 2; row++){
        leftPixel = pixels[row][col];
        rightPixel = pixels[width - 1 - row][col];
        leftPixel.setColor(rightPixel.getColor());
      }
    }
  }
  public void mirrorDiagonal() {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int height = pixels.length;
    for(int r = 1; r < height; r++) {
      for(int c = 0; c < r; c++) {
        leftPixel = pixels[r][c];
        rightPixel = pixels[c][r];
         rightPixel.setColor(leftPixel.getColor());
      }
     }
  }
  public void mirrorArms() {
    int mirrorLine = 190;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    // loop through the rows
    for (int row = 155; row < mirrorLine; row++){
      // loop from 13 to just before the mirror point
      for (int col = 100; col < 170; col++){
        leftPixel = pixels[row][col];
        rightPixel = pixels[mirrorLine - row + mirrorLine][col];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
    for (int row = 155; row < mirrorLine; row++){
      // loop from 13 to just before the mirror point
      for (int col = 240; col < 300; col++){
        leftPixel = pixels[row][col];
        rightPixel = pixels[mirrorLine - row + mirrorLine][col];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
  }
  public void mirrorGull(){
    int mirrorLine = 360;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    // loop through the rows
    for (int row = 235; row < 330; row++) {
      // loop just before the mirror line
      for (int col = 220; col < mirrorLine; col++) {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][mirrorLine - col + mirrorLine];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
  }
  public void mirrorRectangle(int x1, int y1, int x2, int y2, boolean vertical) {
    int mirrorPoint = x2;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
      if(vertical) {
        for(int r = x1; r < x2; r++) {
           for(int c = y1; c < y2; c++) {
              leftPixel = pixels[r][c];
              rightPixel = pixels[mirrorPoint - r + mirrorPoint][c];
              rightPixel.setColor(leftPixel.getColor());
            }
        }
       } else {
         for(int r = x1; r < x2; r++) {
            for(int c = y1; c < y2; c++) {
                leftPixel = pixels[r][c];
                rightPixel = pixels[r][mirrorPoint - c + mirrorPoint];
                rightPixel.setColor(leftPixel.getColor());
            }
          }
       }
  }
  public void copy(Picture fromPic, int sr, int er, int sc, int ec) {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for(int fromRow = 0, toRow = sr; fromRow < er && toRow < toPixels.length; fromRow++, toRow++) {
      for (int fromCol = 0, toCol = sc;fromCol < ec && toCol < toPixels[0].length;fromCol++, toCol++) {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }
  }
  public void myCollage() {
    Picture pic1 = new Picture("src/images/butterfly1.jpg");
    Picture pic2 = new Picture("src/images/robot.jpg");
    Picture pic3 = new Picture("src/images/water.jpg");
    this.copy(pic1, 0, 100, 0, 200);
    this.copy(pic2, 100, 0);
    this.copy(pic3, 200, 0);
    this.mirrorVertical();
    this.write("src/images/collage.jpg");
}
  
  public void edgeDetection2(double distance){
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    double int1;
    double int2;
    for(int r = 0; r < pixels.length; r++) {
      for(int c = 0; c < pixels[0].length-1;c++) {
        leftPixel = pixels[r][c];
        rightPixel = pixels[r][c+1];
        int1 = leftPixel.getRed() + leftPixel.getGreen() + leftPixel.getBlue();
        int2 = rightPixel.getRed() + rightPixel.getGreen() + rightPixel.getBlue();
        if(Math.abs(int1 - int2) > distance){
          leftPixel.setColor(Color.BLACK);
        } else {
         leftPixel.setColor(Color.WHITE);
        }
      }
    }
    for(int r = 0; r < pixels.length-1; r++) {
      for(int c = 0; c < pixels[0].length;c++) {
        leftPixel = pixels[r][c];
        rightPixel = pixels[r+1][c];
        int1 = leftPixel.getRed() + leftPixel.getGreen() + leftPixel.getBlue();
        int2 = rightPixel.getRed() + rightPixel.getGreen() + rightPixel.getBlue();
        if(Math.abs(int1 - int2) > distance){
          leftPixel.setColor(Color.BLACK);
        }
      }
    }
  }
  //ENCODE DECODE STUFFFFF
  public void encode(Picture messagePict){
    Pixel[][] messagePixels = messagePict.getPixels2D();
    Pixel[][] currPixels = this.getPixels2D();
    Pixel currPixel = null;
    Pixel messagePixel = null;
    int currentRed;
    int currentBlue;
    int currentGreen;
    int count = 0;
    for (int row = 0; row < this.getHeight(); row++){
      for (int col = 0; col < this.getWidth(); col++){
        currPixel = currPixels[row][col];
        currentRed = currPixel.getRed();
        currentGreen = currPixel.getGreen();
        currentBlue = currPixel.getBlue();

        if(count%2 == 0) {
        	if(currentRed < 245)
        		currentRed = currentRed + (3 - currentRed%3);
        	else
        		currentRed = currentRed - (currentRed%3);
        	
        	if(currentGreen < 245)
        		currentGreen = currentGreen + (5 - currentGreen%5);
        	else
            	currentGreen = currentGreen - (currentGreen%5);
        	if(currentBlue < 245)
        		currentBlue = currentBlue + (7 - currentBlue%7);
        	else
        		currentBlue = currentBlue - (currentBlue%7);
        }
        if(count%2 == 1) {
        	if(currentRed>10)
        		currentRed = currentRed - (currentRed%3);
        	else
        		currentRed = currentRed + (3 - currentRed%3);
        	
        	if(currentGreen > 10)
        		currentGreen = currentGreen - (currentGreen%5);
        	else
        		currentGreen = currentGreen + (5 - currentGreen%5);
        	if(currentBlue > 10)
        		currentBlue = currentBlue - (currentBlue%7);
        	else
        		currentBlue = currentBlue + (7 - currentBlue%7);
        }
        currPixel.setRed(currentRed);
        currPixel.setGreen(currentGreen);
        currPixel.setBlue(currentBlue);
        
        count++;
       }
    }
    int sr = (int)(Math.random() * (this.getHeight() - messagePict.getHeight()));
    int sc = (int)(Math.random() * (this.getWidth() - messagePict.getWidth()));
    
    for (int row = 0; row < messagePict.getHeight(); row++) {
    	for (int col = 0; col < messagePict.getWidth(); col++){
    		currPixel = currPixels[sr+row][sc+col];
    		messagePixel = messagePixels[row][col];
    		
    		currentRed = currPixel.getRed();
    		currentGreen = currPixel.getGreen();
    		currentBlue = currPixel.getBlue();
    		
    		if(messagePixel.getRed() < 125 && messagePixel.getGreen() < 125 && messagePixel.getBlue() < 125) {
    			currentRed = currentRed + (int)(Math.random() * 2)  + (1);
    			messagePixel.setRed(currentRed);
    			messagePixel.setGreen(currentGreen);
    			messagePixel.setBlue(currentBlue);

    		}
    		else if(messagePixel.getRed() >=125 && messagePixel.getGreen() >=125 && messagePixel.getBlue() >=125) {
    				currentBlue = currentBlue - (int)(Math.random() * 6)  - (1);
    			messagePixel.setRed(currentRed);
    			messagePixel.setGreen(currentGreen);
    			messagePixel.setBlue(currentBlue);
    		}
    	}
    }
    
    this.copy(messagePict, sr, sc);
  }
  
  /**
  * Method to decode a message hidden in the
  * red value of the current picture
  * @return the picture with the hidden message
  */
  public void decode(){
    Pixel[][] pixels = this.getPixels2D();
   
    Pixel currPixel = null;
    for (int row = 0; row < this.getHeight(); row++){
      for (int col = 0; col < this.getWidth(); col++){
        currPixel = pixels[row][col];
        if (currPixel.getRed() % 3 != 0 && currPixel.getGreen()%5 == 0 && currPixel.getBlue()%7 == 0){
          currPixel.setColor(Color.BLACK);
        }
       /* if (currPixel.getRed() % 3 == 0 && currPixel.getGreen()%5 == 0 && currPixel.getBlue()%7 != 0){
            currPixel.setColor(Color.WHITE);
          }
       */
      }
    }
  }
  
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  public static void main(String[] args) 
  {
    Picture beach = new Picture("src/images/beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
 
  
} // this } is the end of class Picture, put all new methods before this
