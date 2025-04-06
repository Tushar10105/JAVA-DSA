import java.util.Scanner;
public class Array_inpt{
	public static void main(String args[]){
		int[] arr;
		Scanner scan=new Scanner(System.in);
		System.out.print("What is the size:\n");
		int size=scan.nextInt();
		arr=new int[size];
		System.out.print("Input "+size+" elements:\n");

		for(int i=0;i<size;i++){
			arr[i]=scan.nextInt();
			}
		System.out.print("The inputed array is:\n");
		for(int i:arr){
			System.out.print("\t"+i+"\t\n");
			}
			System.out.print("\n\n");
		}
	}