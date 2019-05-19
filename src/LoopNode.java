import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LoopNode implements RobotProgramNode{
    List<RobotProgramNode> block = new ArrayList<>();

    public LoopNode(Scanner s) {
        //Parser.require(Parser.OPENBRACE, "needs open brace", s);
        while (!s.hasNext("}")) {
//            String token = s.next();
            block.add(new StmtNode(s));
        }
    }

    @Override
    public void execute(Robot robot) {
       for(RobotProgramNode n : block){
           n.execute(robot);
       }
    }
}
