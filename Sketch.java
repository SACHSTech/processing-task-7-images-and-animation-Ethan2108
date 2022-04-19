import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {
	
  // declare variables
  PImage imgBackground;
  PImage imgFishy;
  PImage imgSharky;

  float x = 0;
  float y = 0;
  float xSpeed = 5;
  float ySpeed = 4;
  float speed = 5;
  double xFishy = 1;
  double yFIshy = 50;
	
  public void settings() {
    size(400, 400);
  }

  public void setup() {
    // load background
    imgBackground = loadImage("../Beach.jpeg");  
    // load fish
    imgFishy = loadImage("../fish-png"); 
    // resize fish
    imgFishy.resize(imgFishy.width/4,imgFishy.height/4);

    // load shark
    imgSharky = loadImage("../shark.png");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           .jpeg");
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  background(0, 255, 238);
    image(imgBackground, 255, 238);
  
  // define other methods down here.
}}