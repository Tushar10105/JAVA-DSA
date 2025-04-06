import java.util.Scanner;
public class ArrDelAtLoc{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
				System.out.print("Size: ");
				int size=scan.nextInt();
				int[] arr=new int[size];

				if (size <= 0) {
					System.out.println("Invalid size!");
					return;
			        }

				System.out.print("ELEMENTS:\n");
				for(int i=0;i<size;i++){
					arr[i]=scan.nextInt();
					}

				int[] newarr= new int[arr.length-1];
				System.out.print("What is the POSITION to DELETE: ");
				int loc=scan.nextInt();

				for(int i=0;i<loc;i++){
					newarr[i]=arr[i];
					}

				for(int i=loc;i<arr.length;i++){
					newarr[i-1]=arr[i];
				}

		System.out.print("After DELETION:\n");

			for(int i:newarr){
				System.out.print(i+" | ");
				}

		System.out.print("\n\n");
		}
	}