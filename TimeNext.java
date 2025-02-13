import java.util.Scanner;

public class TimeNext {
    long fact(int x) {
        long factorial=1;
        long start = System.nanoTime();

        if (x==0 || x==1) {
            long end = System.nanoTime();
            long time = end - start;
            System.out.println("Factorial: 1");
            System.out.println("Time COMPLEXITY: "+time+" Nano Second");
            return 1;
        } else {
            for (int i=x;i>=1;i--) {
                 factorial *= i;
            }
        }

        long end = System.nanoTime();
        long time =end-start;

        System.out.println("Factorial: " + factorial);
        System.out.println("Time COMPLEXITY: " + time + " Nano Second");

        return factorial;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("a: ");
        int a = scan.nextInt();
        scan.close();

        TimeNext obj = new TimeNext();
        obj.fact(a);
    }
}
