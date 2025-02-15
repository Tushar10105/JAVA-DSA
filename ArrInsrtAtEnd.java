import java.util.Scanner;
public class ArrInsrtAtEnd{
public static void main(String args[]){
	Scanner scan=new Scanner(System.in);
	System.out.print("Size: ");
	int size=scan.nextInt();
	int[] arr=new int[size];
	if (size <= 0) {
		System.out.println("Invalid size! Must be greater than 0.");
		return;
	        }

	System.out.print("ELEMETS:\n");
	for(int i=0;i<size;i++){
		arr[i]=scan.nextInt();
		}

		int[] newarr=new int[arr.length+1];
		System.out.print("NEW Element: ");
		int element=scan.nextInt();
		newarr[newarr.length-1]=element;

		for(int i=0;i<arr.length;i++){
			newarr[i]=arr[i];
			}

		System.out.print("After INSERTION at the END:\n");

		for(int i:newarr){
			System.out.print(i+" | ");
			}
		System.out.print("\n");
	}
}
