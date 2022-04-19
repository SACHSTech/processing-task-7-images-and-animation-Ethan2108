import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {
	
  // declare variables
  public PImage Background;
  public PImage Fishy;
  public PImage Sharky;

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
    
    // load images
    Background = loadImage("../Beach.jpeg");  
    // load fish
    Fishy = loadImage("../fish-png.png"); 
    // resize fish
    Fishy.resize(Fishy.width/4,Fishy.height/4);

    // load shark
    Sharky = loadImage("../shark.png);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           .jpeg");
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  background(0, 255, 238);
    image(imgBackground, 255, 238);
  
  // define other methods down here.
}}