import java.util.Scanner;
public class ArrInsrtAtBeg{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("Size: ");
		int size=scan.nextInt();
		int[] arr=new int[size+1];

		if (size <= 0) {
			System.out.println("Invalid size!");
			return;
	        }

		System.out.print("ELEMENTS:\n");
		for(int i=1;i<=size;i++){
			arr[i]=scan.nextInt();
			}

		System.out.print("NEW ELEMENT: ");
		int element=scan.nextInt();
		arr[0]=element;



		System.out.print("After INSERTION at the BEGNING:\n");

			for(int i:arr){
				System.out.print(i+" | ");
				}

		System.out.print("\n\n");
		}
	}