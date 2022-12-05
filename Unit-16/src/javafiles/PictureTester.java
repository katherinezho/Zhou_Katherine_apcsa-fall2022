package javafiles;
/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("src/images/beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("src/images/caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("src/images/temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("src/images/640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("src/images/swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  //MY METHODS STARTING HERE
  public static void testKeepOnlyBlue()
  {
    Picture beach = new Picture("src/images/beach.jpg");
    beach.explore();
    beach.keepOnlyBlue();
    beach.explore();
  }
  public static void testKeepOnlyRed()
  {
    Picture beach = new Picture("src/images/beach.jpg");
    beach.explore();
    beach.keepOnlyRed();
    beach.explore();
  }
  public static void testKeepOnlyGreen()
  {
    Picture beach = new Picture("src/images/beach.jpg");
    beach.explore();
    beach.keepOnlyGreen();
    beach.explore();
  }
  public static void testNegate()
  {
    Picture beach = new Picture("src/images/beach.jpg");
    beach.explore();
    beach.negate();
    beach.explore();
  }
  public static void testGrayscale()
  {
    Picture beach = new Picture("src/images/beach.jpg");
    beach.explore();
    beach.grayscale();
    beach.explore();
  }
  public static void testFixUnderwater()
  {
    Picture water = new Picture("src/images/water.jpg");
    water.explore();
    water.fixUnderwater();
    water.explore();
  }
  public static void testMirrorVerticalRightToLeft()
  {
    Picture water = new Picture("src/images/caterpillar.jpg");
    water.explore();
    water.mirrorVerticalRightToLeft();
    water.explore();
  }
  public static void testMirrorHorizontal()
  {
    Picture water = new Picture("src/images/caterpillar.jpg");
    water.explore();
    water.mirrorHorizontal();
    water.explore();
  }
  public static void testMirrorHorizontalBotToTop()
  {
    Picture water = new Picture("src/images/blueMotorcycle.jpg");
    water.explore();
    water.mirrorHorizontalBotToTop();
    water.explore();
  }
  public static void testMirrorDiagonal()
  {
    Picture water = new Picture("src/images/caterpillar.jpg");
    water.explore();
    water.mirrorDiagonal();
    water.explore();
  }
  public static void testMirrorArms()
  {
    Picture water = new Picture("src/images/snowman.jpg");
    water.explore();
    water.mirrorArms();
    water.explore();
  }
  public static void testMirrorGull()
  {
    Picture water = new Picture("src/images/seagull.jpg");
    water.explore();
    water.mirrorGull();
    water.explore();
  }
  public static void testCopy()
  {
    Picture gull = new Picture("src/images/seagull.jpg");
    gull.explore();
    gull.copy(gull, 200, 230, 200, 230);
    gull.explore();
  }
  public static void testEdgeDetection2()
  {
    Picture swan = new Picture("src/images/beach.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  public static void testMyCollage()
  {
    Picture canvas = new Picture("src/images/640x480.jpg");
    canvas.myCollage();
    canvas.explore();
  }
	
//ENCODE
public static void encoding()
{
	Picture basePic = new Picture("src/images/bluemotorcycle.jpg");
	basePic.explore();
	Picture encodePic = new Picture("src/images/apple_icon.jpg");
	basePic.encode(encodePic);
	basePic.explore();
	basePic.decode();
	basePic.explore();
}
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
	//testMirrorVertical();
    //testMirrorVerticalRightToLeft();
	//testMirrorHorizontal();
	//testMirrorHorizontalBotToTop();
    //testMirrorDiagonal();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
	 //testMyCollage();
   // testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
	//testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
	  encoding();
  }
}
