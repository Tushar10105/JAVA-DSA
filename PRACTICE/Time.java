public class Time{
	public static void main(String args[]){

		int[] arr= new int[1000];
		for(int i=0;i<arr.length;i++){
			arr[i]=i+1;
			}
			long start=System.nanoTime();
			int sum=0;
			for(int i:arr){
				sum+=i;
				}
				long end=System.nanoTime();

				System.out.print("Sum: "+sum+"\n");
				long time=end-start;
				System.out.print("Time COMPLEXITY: "+time+" NanoSeconds\n");
		}
	}