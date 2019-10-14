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
        history += "["+ nbOp + "] " + op1 + " " + operation + " " + op2 + " = " + c.toString() + "\n";
        nbOp++;
    }

    public void addMessage(String message){
        history += message +"\n";
    }

    public String showHistory(){
        return history;
    }

    public Complexe add(Complexe c, Complexe c2){
        Complexe sum = c.add(c2);
        addOperation(c.toString(), c2.toString(), "+", sum);
        return sum;
    }

    public Complexe multiply(Complexe c, Complexe c2){
        Complexe mult = c.multiply(c2);
        addOperation(c.toString(), c2.toString(), "*", mult);
        return mult;
    }

    public static void main(String[] args) {
        Complexe c1 = new Complexe(1,4.3);
        Complexe c2 = new Complexe(3.8,2);

        ComplexeMemoire cm = new ComplexeMemoire();
        cm.addMessage("<-- start -->");

        Complexe c3 = cm.multiply(c1,c2);
        c3 = cm.add(c3,c2);

        cm.addMessage("<-- end -->");
        System.out.println(cm.showHistory());
    }
}