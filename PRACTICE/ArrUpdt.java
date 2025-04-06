import java.util.Scanner;
class Update{
	void Display(int[] arr){

	Scanner scan=new Scanner(System.in);

	System.out.print("Number of the INDEX to UPDATE: ");
	int index=scan.nextInt();

	System.out.print("NEW VALUE of that INDEX:");
	int new_value=scan.nextInt();

	if(index>=0 && index<arr.length){
		arr[index]=new_value;
		for(int i:arr){
			System.out.print(i+" | ");
			}
			System.out.print("\n\n");
		}else{
			System.out.print("INVALID INDEX CHOOSEN\n\n");
			}
			scan.close();
		}
}

	public class ArrUpdt{
		public static void main(String args[]){
			Scanner scan=new Scanner(System.in);
			System.out.print("SIZE: ");
			int size=scan.nextInt();

			if(size<=0){
				System.out.print("INVALID SIZE !\n");
				return;
				}

			int[] arr=new int[size];
			System.out.print("ELEMENTS:\n");
			for(int i=0;i<arr.length;i++){
				arr[i]=scan.nextInt();
				}
		Update obj=new Update();
		obj.Display(arr);

		scan.close();

			}
		}