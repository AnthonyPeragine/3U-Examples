
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author peraa0837
 */
public class Conditions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Create a city
        City kw = new City();
        //Create a robot
        Robot jet = new Robot(kw, 1, 1, Direction.EAST);
        
        //Create a wall
        new Wall(kw, 1, 5, Direction.EAST);
        
        //Infinite loop
        while(jet.countThingsInBackpack() < 5){
            jet.move();
            //did jet hit a wall?
            if(!jet.frontIsClear()){
                
            }
        }
        jet.turnLeft();
        jet.canPickThing();
    }
    
}
