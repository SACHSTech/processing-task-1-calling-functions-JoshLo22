import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(210, 255, 173);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
     fill(255, 204, 0); // Set fill color to yellow
  rect(100, 200, 200, 200);  // Draw a square at (100, 200) with width 200 and height 200
  
  // Draw the small rectangle inside the square
    fill(255); // Set fill color to white
  rect(150, 250, 100, 100);  // Draw a rectangle at (150, 250) with width 100 and height 100
  
  // Draw the triangle
    fill(255, 204, 0); // Set fill color to yellow
  triangle(200, 100, 100, 200, 300, 200);  // Draw a triangle with vertices at (200, 100), (100, 200), and (300, 200)
  
  // Draw the chimney (small rectangle)
    fill(255, 204, 0); // Set fill color to yellow
  rect(210, 100, 20, 30);  // Draw a rectangle at (210, 100) with width 20 and height 30
  }
  
  // define other methods down here.
}