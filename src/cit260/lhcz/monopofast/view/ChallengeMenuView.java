
 /* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.lhcz.monopofast.view;



/**
 *@author Logan
 * 
 */
public class ChallengeMenuView extends View {
    
public ChallengeMenuView(){
    
    super("\n"
                + "\n----------------------------------------"
                + "\n| Challenge Menu                            |"
                + "\n----------------------------------------"
                + "\n1 - Challenge One"
                + "\n2 - Challenge Two"
                + "\n3 - Challenge Three"
                + "\nE - Exit"
                + "\n----------------------------------------");
}
    @Override
                   public boolean doAction(Object obj){
                       String value = (String) obj; 
                       value = value.toUpperCase(); // convert to upper case
                     switch(value){
                case "1": //Challange 1
                    this.calcChallenge1();
                    break;
                                  
                case "2": //Challange 2
                    this.calcChallenge2();
                   break;
                case "4": //Challange 3
                    this.calcChallenge3();
                    break;
                 case "E": //exit game
                   return true;
                default:
                    System.out.println("\n*** Invalid Selection ***");
                    break;
                     }
    return false;
    } 
                        private void calcChallenge1(){
                        // create a new game
                               int value = 1;
                                ChallengeOneView ChallengeOne = new ChallengeOneView();
                                ChallengeOne.display();
        if (value < 0){
                            System.out.println("ERROR- Failed to load new game");
                        }
                        }
                         private void calcChallenge2(){
                        
                         int value = 1;
                                ChallengeTwoView ChallengeTwo = new ChallengeTwoView();
                                ChallengeTwo.display();
        if (value < 0){
                            System.out.println("ERROR- Failed to load new game");
                        }
                        }
                          private void calcChallenge3(){
{
                         int value = 1;
                                ChallengeThreeView ChallengeThree = new ChallengeThreeView();
                                ChallengeThree.display();
        if (value < 0){
                            System.out.println("ERROR- Failed to load new game");
                        }
                        }
                         }
}
                         



