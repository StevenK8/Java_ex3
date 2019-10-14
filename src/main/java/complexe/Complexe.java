package complexe;


public final class Complexe {
    private final double r,i;

    public Complexe(double pR, double pI) {
        r = pR;
        i = pI;
    }

    public static void main(String[] args) {
        Complexe c = new Complexe(1.3, -2.33);
        System.out.println(c.toString());
        Complexe cCopy = c.cloneComplexe();
        System.out.println(c.multiply(cCopy).toString());
    }

    public double getR(){
        return r;
    }

    public double getI(){
        return i;
    }

    public double module(){
        return Math.sqrt(r*r + i*i);
    }

    public double argument(){
        return Math.acos(r / module());
    }

    public Complexe add (Complexe c){
        return new Complexe(r+c.r, i+c.i);
    }

    public Complexe multiply (Complexe c){
        return new Complexe(r*c.r - i*c.i, r*c.i + i*c.r);
    }

    public Complexe cloneComplexe(){
        return new Complexe(r, i);
    }

    public boolean equals(Complexe c){
        return (r == c.r) && (i == c.i);
    }

    public String toString(){
        String textI, textR;
        if(i>0)
            textI = "+" + i + "i";
        else if(i<0)
            textI = i + "i";
        else{
            if (r==0)
                return "0";
            textI = "";
        }
        if(r==0)
            textR = "";
        else
            textR = r + "";

        return textR + textI;
    }
}
