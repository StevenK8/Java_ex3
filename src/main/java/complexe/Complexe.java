package complexe;


public final class Complexe {
    private double r,i;

    private Complexe(double pR, double pI) {
        r = pR;
        i = pI;
    }

    public static void main(String[] args) {
        Complexe c = new Complexe(1.3, 2.33);
    }
}
