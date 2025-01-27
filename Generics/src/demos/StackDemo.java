package demos;

import entities.Stack;

public class StackDemo {

	public static void main(String[] args) {
		//for integer
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(11);
		stack.push(12);
		stack.push(13);
		stack.push(14);
		stack.display();
		
//		System.out.println("Deleted element is : "+stack.pop());
//		System.out.println("Deleted element is : "+stack.pop());
//		System.out.println("Deleted element is : "+stack.pop());
//		System.out.println("Deleted element is : "+stack.pop());
//		System.out.println("Deleted element is : "+stack.pop());
//		stack.display();
		
		//for sting
		Stack<String> stack1 = new Stack<String>();
		stack1.push("java");
		stack1.push("object");
		stack1.push("final");
		stack1.push("super");
		stack1.push("is");
		stack1.display();
		
	}

}
