/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.lhcz.monopofast.view;
import java.util.Scanner;
/**
 *
 * @author Logan
 */

            
            
class challengeOneView{
double a;
int c;

public challengeOneView(double a, int c)
{
   this.a = a; this.c = c;
}

public boolean isEqualateral()
{
   if (this.a == this.b && this.b == this.c)
      return true;
   return false;
}

public static void main(String[] args) 
{
  Scanner s = new Scanner(System.in);

  //1.User inputs the sides of a triangle
  System.out.println("Please enter the sides of the triangle:");
  a = s.nextDouble();
  b = s.nextDouble();
  c = s.nextDouble();

  Triangle t = new Triangle(a, b, c);
  if (t.isEqualateral())
    System.out.println("The triangle is a equalateral triangle");
}

}