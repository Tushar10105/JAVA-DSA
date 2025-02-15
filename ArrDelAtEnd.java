import java.util.Scanner;
public class ArrDelAtEnd{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("Size: ");
		int size=scan.nextInt();

		if (size <= 0) {
			System.out.println("Invalid size!");
			return;
	        }

		int[] arr= new int[size];
		System.out.print("ELEMENTS:\n");
		for(int i=0;i<arr.length;i++){
			arr[i]=scan.nextInt();
			}

			int[] newarr=new int[arr.length];

			for(int i:newarr){
				newarr[i]=arr.length-1;
				}
				System.out.print("After DELETION:\n");
				for(int i=0;i<newarr.length;i++){
					System.out.print(i+" | ");
					}
			//System.out.print(newarr.length-1+"\n");
		}
	}