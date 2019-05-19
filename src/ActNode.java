public class ActNode extends StmtNode implements RobotProgramNode {
    String action;

    ActNode(String s){
        super(s);
    }

    @Override
    public void execute(Robot robot){
        switch(action){
            case "turnL;" :
                robot.turnLeft();
                break;
            case "turnR;" :
                robot.turnRight();
                break;
            case "move;" :
                robot.move();
                break;
            case "takeFuel;" :
                robot.takeFuel();
                break;
            case "wait;" :
                robot.idleWait();
                break;
        }
    }



}