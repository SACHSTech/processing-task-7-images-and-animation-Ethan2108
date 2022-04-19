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

    // resize images
    Fishy.resize(100,100);
    Sharky.resize(200,200);

  }

  public void draw() {

    // draw images and background
    image(Background, 0, 0);
    image(Fishy, x, y);

    // speed of fish 
    x += xSpeed;
    y += ySpeed;

    // collisison detection for fish 
    if (x < 0 || (x + 100) > width) {
      xSpeed *= -1;
    }

    if (y < 0  || (y + 100) > height) {
      ySpeed *= -1;
    }

    // non-linear path for Fish
    float FishyX = speed;
    float FishyY = (float)(0.0013 * (Math.pow(FishyX - width/2, 2))) + 100;

    if ((FishyX + 100) > width) {

      FishyY = 0;
    
    }
  
  // draw shark
  image(Sharky, 0, 0);

  }
}