import java.util.Scanner;
public class LenearSearch{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("Size: ");
		int size=scan.nextInt();
		int[] arr=new int[size];

		System.out.print("\t\t\t\tITS BETTER TO MAKE THE ARRAY UNSORTED\n");
		System.out.print("Elements:\n");
		for(int i=0;i<arr.length;i++){
			arr[i]=scan.nextInt();
			}
			System.out.print("\nELEMENT to SEARCH: ");
			int Target=scan.nextInt();
			boolean found=false;

			for(int i=0;i<arr.length;i++){
				if(arr[i]==Target){
					System.out.print("\nTarget Found at INDEX: "+i+"\n"+"OR\nat the SERIAL NUMBER: "+(i+1)+"\n\n");
					found=true;
					break;
					}
				}

			if(!found){
				System.out.print("\nTARGET NOT FOUND\nNOT PRESENT IN THE ARRAY\n\n");
				}

		}
	}