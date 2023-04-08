package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        int doublee = cathetusLength*2;
        for (int i=1; i<=cathetusLength; i++){
            int son = i;
            for (int j=0; j<=doublee; j++)
            if (i+j>=cathetusLength && j<i+cathetusLength-1){
                System.out.print(son);
                if (son==1)
                    son+=2;
                if (j<i+cathetusLength-1 && j>=cathetusLength)
                    son++;
                else 
                    son--;
                
            }
            else
                System.out.print(' ');
            System.out.println();
        }
        

    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(8);
    }
}
