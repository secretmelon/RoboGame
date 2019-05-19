import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgNode implements RobotProgramNode {

private List<RobotProgramNode> statements = new ArrayList<>();

    ProgNode(Scanner s){
        if(!s.hasNext()){
            Parser.fail("Nothing to read", s);
        }
        while(s.hasNext()){
//            String token = s.next();
            if(s.hasNext("loop")){
                //LoopNode loop = new LoopNode(s);
                statements.add(new LoopNode(s));
            }
            else {
                statements.add(new ActNode(s));
            }
        }
    }

    @Override
    public void execute(Robot robot) {
        for(RobotProgramNode s : statements){
            s.execute(robot);
        }
    }

}
