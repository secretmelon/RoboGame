import java.util.ArrayList;
import java.util.List;

public class ProgNode implements RobotProgramNode {

private List<StmtNode> statements;

    ProgNode(List<StmtNode> statements){
        this.statements = statements;
    }

    @Override
    public void execute(Robot robot) {
        for(StmtNode s : statements){
            s.execute(robot);
        }
    }

}
