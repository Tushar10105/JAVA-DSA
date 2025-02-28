import java.util.Scanner;

public class ArrDelAtEnd {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Size: ");
        int size=scan.nextInt();

        if (size<=0) {
            System.out.println("Invalid size!");
            return;
        }

        int[] arr=new int[size];
        System.out.print("ELEMENTS:\n");
        for (int i=0;i<size;i++) {
            arr[i]=scan.nextInt();
        }

        arr[size-1]=0;

        System.out.print("After DELETION:\n");
        for(int i=0;i<size-1;i++){
            System.out.print(arr[i]+" | ");
        }
        System.out.println();
    }
}
