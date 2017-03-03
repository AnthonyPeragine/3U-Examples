
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author peraa0837
 */
public class Conditions2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Creates a city
        City kw = new City();
        //creates a robot
        Robot jet = new Robot(kw, 4, 1, Direction.EAST);
        //places a lot of things
        new Thing(kw, 4, 2);
        new Thing(kw, 4, 3);
        new Thing(kw, 4, 3);
        new Thing(kw, 3, 3);
        new Thing(kw, 2, 3);
        new Thing(kw, 2, 3);
        new Thing(kw, 2, 3);
        new Thing(kw, 2, 3);
        //turn on the thing counter
        kw.showThingCounts(true);
        
        //step onto first part of the path
        jet.move();
        
        //loop
        while(true){
        //if there are things, pick them all up
            while(jet.canPickThing()){
                jet.pickThing();
            }
        //if holding 1 thing, move
            if(jet.countThingsInBackpack() == 1){
                jet.putThing();
                jet.move();
            }else if(jet.countThingsInBackpack() == 2){
                jet.putThing();
                jet.putThing();
                jet.turnLeft();
                jet.move();
            }else if(jet.countThingsInBackpack() == 2){
                jet.putThing();
                jet.putThing();
                jet.putThing();
                jet.turnLeft();
                jet.turnLeft();
                jet.turnLeft();
                jet.move();
            }else{
                //found 4 things
                break;
            }
        //if holding 2 things, turn left
        //if holding 3 things, turn right
        //if holding 4 thigns, stop
        
        
        
        
        }
    }
}
    

