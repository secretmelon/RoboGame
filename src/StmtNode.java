public class StmtNode implements RobotProgramNode{
    String statement;

    public StmtNode(String s) {
        this.statement = s;
    }

    @Override
    public void execute(Robot robot) {
        if(statement.equals("loop")){
            LoopNode loop = new LoopNode(statement);
        }

    }
}
