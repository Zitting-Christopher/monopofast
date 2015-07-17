/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.lhcz.monopofast.model;
import exception.GameControlException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.EnumSet;
/**
 *
 * @author Christopher
 */
public enum SubLevel implements Serializable {
    //Venti's sublevel qualification and record breaker specifics
    Qual1(0,"Venti's Drink Qualification",10.0,5.0),
    Rcrd1(1,"Venti's Drink Record Breaker",5.0,2.0),
    Qual2(2,"Venti's Fried Food Qualification",10.0,5.0),
    Rcrd2(3,"Venti's Fried Food Record Breaker",5.0,2.0),
    Qual3(4,"Venti's Milkshake Qualification",10.0,5.0),
    Rcrd3(5,"Venti's Milkshake Record Breaker",5.0,2.0),
    Qual4(6,"Venti's Sr. Bacon Cheeseburger Qualification",10.0,5.0),
    Rcrd4(7,"Venti's Sr. Bacon Cheeseburger Record Breaker",5.0,2.0),
    Qual5(8,"Venti's Son of a Bacon Eater Qualification",10.0,5.0),
    Rcrd5(9,"Venti's Son of a Bacon Eater Record Breaker",5.0,2.0),
    
    //Ardy's sublevel qualification and record breaker specifics
    Qual6(10,"Ardy's Drink Qualification",10.0,5.0),
    Rcrd6(11,"Ardy's Drink Record Breaker",5.0,2.0),
    Qual7(12,"Ardy's Baked Good Qualification",10.0,5.0),
    Rcrd7(13,"Ardy's Baked Good Record Breaker",5.0,2.0),
    Qual8(14,"Ardy's Fried Food Qualification",10.0,5.0),
    Rcrd8(15,"Ardy's Fried Food Record Breaker",5.0,2.0),
    Qual9(16,"Ardy's Spicy Roast Beef Qualification",10.0,5.0),
    Rcrd9(17,"Ardy's Spicy Roast Beef Record Breaker",5.0,2.0),
    Qual10(18,"Ardy's Turkey, Ranch and Bacon Qualification",10.0,5.0),
    Rcrd10(19,"Ardy's Turkey, Ranch and Bacon Record Breaker",5.0,2.0),
    
    //Jack and the Fox sublevel qualification and record breaker specifics
    Qual11(20,"Jack and the Fox Drink Qualification",10.0,5.0),
    Rcrd11(21,"Jack and the Fox Drink Record Breaker",5.0,2.0),
    Qual12(22,"Jack and the Fox Milkshake Qualification",10.0,5.0),
    Rcrd12(23,"Jack and the Fox Milkshake Record Breaker",5.0,2.0),
    Qual13(24,"Jack and the Fox Fried Food Qualification",10.0,5.0),
    Rcrd13(25,"Jack and the Fox Fried Food Record Breaker",5.0,2.0),
    Qual14(26,"Jack and the Fox Jack's Flamin Chicken Qualification",10.0,5.0),
    Rcrd14(27,"Jack and the Fox Jack's Flamin Chicken Record Breaker",5.0,2.0),
    Qual15(28,"Jack and the Fox Loaded Breakfast Qualification",10.0,5.0),
    Rcrd15(29,"Jack and the Fox Loaded Breakfast Record Breaker",5.0,2.0),
    
    //Queen Burger sublevel qualification and record breaker specifics
    Qual16(30,"Queen Burger Drink Qualification",10.0,5.0),
    Rcrd16(31,"Queen Burger Drink Record Breaker",5.0,2.0),
    Qual17(32,"Queen Burger Fried Food Qualification",10.0,5.0),
    Rcrd17(33,"Queen Burger Fried Food Record Breaker",5.0,2.0),
    Qual18(34,"Queen Burger Milkshake Qualification",10.0,5.0),
    Rcrd18(35,"Queen Burger Milkshake Record Breaker",5.0,2.0),
    Qual19(36,"Queen Burger Double Dropper Qualification",10.0,5.0),
    Rcrd19(37,"Queen Burger Double Dropper Record Breaker",5.0,2.0),
    Qual20(38,"Queen Burger Big Queen Qualification",10.0,5.0),
    Rcrd20(39,"Queen Burger Big Queen Record Breaker",5.0,2.0),
    
    //McDumbledore's sublevel qualification and record breaker specifics
    Qual21(40,"McDumbledore's Drink Qualification",10.0,5.0),
    Rcrd21(41,"McDumbledore's Drink Record Breaker",5.0,2.0),
    Qual22(42,"McDumbledore's Milkshake Qualification",10.0,5.0),
    Rcrd22(43,"McDumbledore's Milkshake Record Breaker",5.0,2.0),
    Qual23(44,"McDumbledore's Fried Food Qualification",10.0,5.0),
    Rcrd23(45,"McDumbledore's Fried Food Record Breaker",5.0,2.0),
    Qual24(46,"McDumbledore's Plain Double McBurger Qualification",10.0,5.0),
    Rcrd24(47,"McDumbledore's Plain Double McBurger Record Breaker",5.0,2.0),
    Qual25(48,"McDumbledore's McTriple Qualification",10.0,5.0),
    Rcrd25(49,"McDumbledore's McTriple Eater Record Breaker",5.0,2.0);

    public static void saveSubleReport() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    //Let's define the variables we'll be using with the enum
    private final int subLevelId;
    private final String sLDesc;
    private final double maxTime;
    private final double recordTime;
    private Map map;

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }
    
    private Level level;

    public int getSubLevelId() {
        return subLevelId;
    }
    
    public String getSLDesc() {
        return sLDesc;
    }

    public double getRecordTime() {
        return recordTime;
    }


    public double getMaxTime() {
        return maxTime;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }
    
    

    SubLevel(int subLevelId,String sLDesc,double maxTime,double recordTime) {
        this.subLevelId = subLevelId;
        this.sLDesc = sLDesc;
        this.maxTime = maxTime;
        this.recordTime = recordTime;
    }
    
   
           public static void saveSubleReport(EnumSet<SubLevel> subList, String fileLoc) throws GameControlException, IOException {
            PrintWriter out = null;
                fileLoc = "SLReport.txt";
        try{
                out = new PrintWriter(fileLoc);
                out.println("\n \n              SubLevel Report                ");
                out.printf("%n%10s%10s","SubLevel ID","SubLevel Description");
                out.printf("%n%10s%10s","-------------","------------------");
                for(SubLevel Suble : EnumSet.allOf(SubLevel.class))
                {
                out.printf("%n%10s%10s",Suble.getSubLevelId(),Suble.getSLDesc());
                }
//                
                out.flush();
                
//              
        }
        
        catch(Exception ex){
            throw new GameControlException(ex.getMessage());
    
        }
    }
}
