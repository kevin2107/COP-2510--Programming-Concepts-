//"I pledge my Honor that I have not cheated, and will not cheat, on this assignment" Kevin Ramnauth

import java.text.DecimalFormat;

public class Sphere
{
  private DecimalFormat fmt = new DecimalFormat("0.###");
  //instance data
  private double radius;

  //Constructors - Accepts Paramaters
  public Sphere (double r)
  {
      radius = r;
  }
  //Constructor - does not accept paramaters
  public Sphere ()
  {
      radius = 0.0;
  }

  //Mutators
  public void setRadius(double radiusUp)//(double r) //teacher answer
  {
      radius = radiusUp;
      //radius = r; //Teacher Answer
  }

  //Return Method
  public double solveArea()
  {
      return 4 * Math.PI * Math.pow(radius, 2);
  }

  public double solveVolume()
  {
      return (4.0/3) * Math.PI * Math.pow(radius, 3);
  }

  public String toString()
  {
      return "Sphere radius: " + radius + " volume: " + fmt.format(solveVolume()) + " area: " + fmt.format(solveArea());
  }
}
