package school.mjc.stage0.loops.finalTask;

public class Power {
    public void printPower(int numberToPrint, int power) {
        int powerof = 1;
            for (int i=1; i<=power; i++)
                powerof *= numberToPrint;
            System.out.println(powerof);
            }


    public static void main(String[] args) {
        new Power().printPower(-10, 4);
    }
}
