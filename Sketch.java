import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {
	
  PImage imgFishy;
  PImage imgSharky;
  PImage imgBackground;
  //
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    imgFishy = loadImage("fish-png"); // load the image into the program
    //resize fish
    imgFishy.resize(imgFishy.width/4,imgFishy.height/4);

    // load shark
    imgSharky = loadImage("shark.png");

    imgBackground = loadImage("Beach.jpeg")                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              .jpeg");
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  background(0, 255, 238);
    image(imgBackground, 255, 238);
  
  // define other methods down here.
}}