import java.util.Scanner;
public class ArrDelAtBeg{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("Size: ");
		int size=scan.nextInt();
		if (size <= 0) {
			 System.out.println("Invalid size! Must be greater than 0.");
			 return;
	        }

		int[] arr= new int[size];
		System.out.print("ELEMENTS:\n");
		for(int i=0;i<arr.length;i++){
			arr[i]=scan.nextInt();
			}

			int[] newarr=new int[arr.length-1];

			for(int i=1;i<arr.length;i++){
				newarr[i-1]=arr[i];
				}
				System.out.print("After DELETION:\n");
			for(int i:newarr){
				System.out.print(i+" | ");
				}
		//System.out.print("\n"+newarr[0]+"\n");
		}
	}