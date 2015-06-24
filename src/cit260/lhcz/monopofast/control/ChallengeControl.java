/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.lhcz.monopofast.control;

/**
 *
 * @author Christopher
 */
public class ChallengeControl {
    

    //Define the variables for this function
    private int handWash = 20;
    private double baconEaterSeconds =  6;
    private int numOrders1 = 15;
    private double challenge1TotalSeconds;
    public double calcChallengeOne(double baconEaterSeconds,int numOrders1){
        //Define the lower and upper limit for the seconds and number of orders for each product
    if(baconEaterSeconds < 5 || baconEaterSeconds > 15)
    {
        return -1;
    }

    if (numOrders1 < 1 || numOrders1 > 20)
    {   
        return -1;
    }
    else{
    
    //Function to figure the total seconds for Challenge 2
    challenge1TotalSeconds = baconEaterSeconds * numOrders1 + handWash;
    return challenge1TotalSeconds;

    }


    }
    
    //Define the variables for this function
    private double turnOverSeconds;
    private double mozzaSeconds;
    private double rootBeerSeconds;
    private int numOrders2;
    private double challenge2TotalSeconds;
    
   public double calcChallenge2(double turnOverSeconds,int numOrders2, double mozzaSeconds, double rootBeerSeconds)
    {
        //Define the lower and upper limit for the seconds and number of orders for each product
    if(turnOverSeconds < 5 || turnOverSeconds > 15)
    {
        return -1;
    }

    if (numOrders2 < 1 || numOrders2 > 2)
    {   
        return -1;
    }
    if(mozzaSeconds < 5 || mozzaSeconds > 15)
    {
        return -1;
    }

    if(rootBeerSeconds < 5 || rootBeerSeconds > 15)
    {
        return -1;
    }
    else {
    //Function to figure the total seconds for Challenge 2
    challenge2TotalSeconds = turnOverSeconds + mozzaSeconds + rootBeerSeconds * numOrders2;
    return challenge2TotalSeconds;
    }
    }
   
    //Define the variables for this function
    private double milkshakeSeconds;
    private int milkshakeNumOrders;
    private double mcBurgerSeconds;
    private int mcBurgerNumOrders;
    private double mcTripleSeconds;
    private int mcTripleNumOrders;
    private int numOrders3;
    private double challenge3TotalSeconds;
    
    private double calcChallenge3(double milkshakeSeconds,int milkshakeNumOrders, double mcBurgerSeconds,int mcBurgerNumOrders, double mcTripleSeconds,int mcTripleNumOrders)
    {
        //Define the lower and upper limit for the seconds and number of orders for each product
    if(milkshakeSeconds < 5 || milkshakeSeconds > 15)
    {
        return -1;
    }

    if (milkshakeNumOrders < 1 || milkshakeNumOrders > 19)
    {   
        return -1;
    }
    
    if(mcBurgerSeconds < 5 || mcBurgerSeconds > 15)
    {
        return -1;
    }
    
    if (mcBurgerNumOrders < 1 || mcBurgerNumOrders > 19)
    {   
        return -1;
    }

    if(mcTripleSeconds < 5 || mcTripleSeconds > 15)
    {
        return -1;
    }
    
    if (mcTripleNumOrders < 1 || mcTripleNumOrders > 19)
    {   
        return -1;
    }

    //Function to figure the total seconds for Challenge 2
    challenge3TotalSeconds = milkshakeSeconds+ milkshakeNumOrders * mcBurgerSeconds + mcTripleSeconds* mcBurgerNumOrders + mcTripleSeconds *mcTripleNumOrders;
    return challenge3TotalSeconds;
    }
}
