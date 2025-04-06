import java.util.Scanner;
public class ArrInsrtAtEnd{
public static void main(String args[]){
	Scanner scan=new Scanner(System.in);
	System.out.print("Size: ");
	int size=scan.nextInt();
	int[] arr=new int[size+1];

	if (size <= 0) {
		System.out.println("Invalid size! Must be greater than 0.");
		return;
	        }

	System.out.print("ELEMETS:\n");
	for(int i=0;i<size;i++){
		arr[i]=scan.nextInt();
		}

		System.out.print("NEW Element: ");
		int element=scan.nextInt();
		arr[arr.length-1]=element;

		System.out.print("After INSERTION at the END:\n");

		for(int i:arr){
			System.out.print(i+" | ");
			}
		System.out.println();
	}
}
