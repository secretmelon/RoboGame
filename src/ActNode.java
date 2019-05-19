import java.util.Scanner;

public class ActNode implements RobotProgramNode {
    String action;

    ActNode(Scanner s){
        if(s.hasNext("turnL") || s.hasNext("turnR") || s.hasNext("move") || s.hasNext("takeFuel") || s.hasNext("wait")){
            action = s.next();
            if (s.hasNext(";")){
                s.next(); //clear semi colon
            }else{
                Parser.fail("no trailing semicolon",s);
            }
        } else {
            Parser.fail("action required",s);
//            System.out.println("no nomas acciones senor");

        }
    }

    @Override
    public void execute(Robot robot){
        switch(action){
            case "turnL" :
                robot.turnLeft();

            case "turnR" :
                robot.turnRight();

            case "move" :
                robot.move();

            case "takeFuel" :
                robot.takeFuel();

            case "wait" :
                robot.idleWait();

        }
    }



}