import java.util.Scanner;

class Stack{
	int[] elements;	
	int size;
	int top;

	Stack(int s){	
		size=s;
		elements=new int[size];
		top=-1;
	}

	void push(int element){		
		if(top==size-1){
			System.out.println("Overflow");
		}
		else{
			top++;
			elements[top]=element;
			System.out.println(element+" is pushed on Stack");		
		}
	}

	void pop(){
		if(top==-1){
			System.out.println("Underflow");
		}
		else{
			System.out.println(elements[top]+"is popped out");
			top--;			
		}
	}

	void peek(){
		System.out.println("Top level element position="+top);
	}

	void display(){
		System.out.print("\nStack==");
		for(int i=0;i<=top;i++){
			System.out.print(elements[i]+"\t");
		}
	}
}

public class MyStack{
	public static void main(String args[])
	{
		int option=0;
		Scanner scanner = new Scanner(System.in);
		// Input size of the Stack
    	System.out.print("Enter the max size of the Stack: ");
    	int size = scanner.nextInt();
    	Stack s=new Stack(size);
     		do
			{
				System.out.println("\n\n\n\n");
				System.out.println("Enter '1' for PUSH operation");
				System.out.println("Enter '2' for POP operation");
				System.out.println("Enter '3' for PEEK operation");
				System.out.println("Enter '4' to display Stack");
				System.out.println("Press any other key to EXIT");
				System.out.print("Choose an option: ");
				option = scanner.nextInt();
				switch(option)
				{
					case 1:
						System.out.print("Enter the element to be pushed on to the Stack: ");
        				int element = scanner.nextInt();
        				s.push(element);
        				break;
        			case 2:
        				s.pop();
        				break;
        			case 3:
        				s.peek();
        				break;
        			case 4:
        				s.display();
        				break;
        		}
			}while (option >= 1 && option <=4);
	}
}