
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.RobotSE;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author peraa0837
 */
public class CountedLoops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // create new city
        City kw = new City();
        //create a robot
        RobotSE jet = new RobotSE(kw, 1, 1, Direction.EAST);
        
        //make a counter
        int  counter = 0;
        while (counter < 5){
            //move
            jet.move();
            // increase counter
            counter = counter + 1;
    }
        jet.turnAround();
        //using a for loop to count
        for(int i = 0; i < 5; i = i + 1){
            jet.move();
        }
        if(jet.frontIsClear()){
            if(jet.countThingsInBackpack()== 5){
        }
        }
        if(jet.frontIsClear() && jet.countThingsInBackpack() == 5){
    }
}
}

        
   

