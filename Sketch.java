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

    size(500, 500);
  }

  public void setup() {
    
    // load images
    Background = loadImage("../Biscayne_underwater.jpg");
    Fishy = loadImage("../fish.png");
    Sharky = loadImage("../Shark.png");
  }

  public void draw() {
	  background(0, 255, 238);
    image(Background, 255, 238);
  
  // define other methods down here.
}}