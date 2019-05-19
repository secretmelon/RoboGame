import java.util.Scanner;

public class StmtNode implements RobotProgramNode{
    RobotProgramNode statement;

    public StmtNode(Scanner s) {
       if(s.hasNext("loop")) {
           Parser.require(Parser.OPENBRACE, "u need an open brace", s);
           statement = new LoopNode(s);
       }
       else{
           statement = new ActNode(s);
       }

    }

    @Override
    public void execute(Robot robot) {
        statement.execute(robot);
    }
}
