import java.util.Scanner;

class Stack{
	int elements;	
	int top;

	Stack(int size){		
		elements=new int[size];
		top=-1;
	}

	void push(int element){
		top++;
		if(top==size){
			System.out.println("Overflow");
		}
		else{
			elements[top]=element;
			System.out.println(element+"is pushed on Stack");		}
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

	int peek(){
		System.out.println("Top level element position="+top);
	}
}

public class MyStack{
	public static void main(String args[])
	{
		int option;
		Scanner scanner = new Scanner(System.in);
		// Input size of the Stack
    	//System.out.println("Enter the max size of the Stack: ");
    	int size = scanner.nextInt();
    	Stack s=new Stack(size);
     		do
			{
				System.out.println("Enter '1' for PUSH operation");
				System.out.println("Enter '2' for PUSH operation");
				System.out.println("Enter '3' for PUSH operation");
				System.out.println("Press any other key to EXIT");
	
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
        		}
			}while (option >= 1 && option <=3);
	}
}