import java.util.Scanner;

class StackArray {
    private int[] arr;
    private int top;
    private int capacity;

    public StackArray(int size) {
        this.capacity=size;
        this.arr=new int[size];
        this.top=-1;
    }

    public boolean isEmpty(){
		return top==-1;
		}

	public boolean isFull(){
	    return top==capacity-1;
	    }


    public void push(int item) {
        if(isFull()){
            System.out.println("STACK OVERFLOW! Can't PUSH " + item);
            return;
        }
        arr[++top]=item;
        //System.out.println("ELEMENT "+arr[top]+" pushed onto stack at index "+top);
    	System.out.println("PUSHED..");
    }

    public int pop(){
        if (isEmpty()){
            System.out.println("STACK UNDERFLOW! Can't POP.");
            return -1;
        }
        return arr[top--];
    }

    public void peek(){
        if(isEmpty()){
            System.out.println("Its EMPTY..");
            return;
        }
        System.out.println("TOP ELEMENT: "+arr[top]+" at INDEX: "+top);
    }

    public void display(){
        if (isEmpty()){
            System.out.println("Its EMPTY.");
            return;
        }
        System.out.println("-----------------------");
        System.out.print("THE STACK: ");
        for (int i=0;i<=top;i++) {
            System.out.print("|"+arr[i]);
        }
        System.out.println();
    }
}

public class Stack{
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("CAPACITY of the STACK: ");
        int size=scanner.nextInt();
        StackArray stack=new StackArray(size);

        while(true){
            System.out.println("\nSTACK OPERATIONS:");
            System.out.println("---------------------");
            System.out.println("1. PUSH");
            System.out.println("2. POP");
            System.out.println("3. PEEK");
            System.out.println("4. DISPLAY");
            System.out.println("5. EXIT");
            System.out.println("---------------------");
            System.out.print("WHAT IS THE CHOOSEN ONE: ");
            int choice=scanner.nextInt();

            switch(choice){
                case 1:
                    System.out.print("How many ELEMENTS U wanna PUSH: ");
                    int count = scanner.nextInt();
                    if (stack.isFull()){
                        System.out.println("Its ALREADY FULL !!!");
                    }else{
                        System.out.println("\nENTER "+count+" ELEMENTS:");
                        for(int i=0;i<count;i++){
                            if(!stack.isFull()){
                                int value=scanner.nextInt();
                                stack.push(value);
                            }else{
                                System.out.println("STACK FULL! NO MORE elements can be added.");
                                break;
                            }
                        }
                    }
                    break;

                case 2:
                    int poppedValue=stack.pop();
                    if(poppedValue!=-1)
                        System.out.println("POPPED ELEMENT: "+poppedValue);
                    break;

                case 3:
                    stack.peek();
                    break;

                case 4:
                    stack.display();
                    break;

                case 5:
                	System.out.println("---------------------");
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;

                default:
                    System.out.println("INVALID CHOICE !!!\n TRY AGAIN...");
            }
        }
    }
}
