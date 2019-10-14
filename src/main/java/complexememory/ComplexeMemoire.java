package complexememory;

import complexe.Complexe;

public final class ComplexeMemoire {
    private String history;
    private static int nbOp;

    public ComplexeMemoire(String pHist){
        history = pHist;
        nbOp = 0;
    }

    public ComplexeMemoire(){
        history = "";
        nbOp = 0;
    }

    public ComplexeMemoire copieMemoire(){
        return new ComplexeMemoire(history);
    }

    public void addOperation(String op1, String op2, String operation, Complexe c){
        history += "["+ nbOp + "]" + op1 + operation + op2 + "=" + c.toString() + "\n";
        nbOp++;
    }

    public void addMessage(String message){
        history += message +"\n";
    }

    public String showHistory(){
        return history;
    }
}