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
   this.a; this.c = c;
}



public static void main(String[] args) 
{
  Scanner s = new Scanner(System.in);

  //1.User inputs the sides of a triangle
  System.out.println("Please enter the  number of seconds to make a Son of a Bacon Eater Sandwich:");
  a = s.nextDouble();
  b = s.nextDouble();
  c = s.nextDouble();

  challengeOneView = new challengeOneView(a, c);
  if (t.isEqualateral())
    System.out.println("hhh");
}

}