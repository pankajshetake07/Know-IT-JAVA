package demos;

public class Stack<T> {	
	T [] arr;
	int size;
	int top;
	public Stack(){
		top = -1;
		size = 5;
		arr = (T[])new Object[size];
	}
	public void push(T ele){
		if(!isFull())
			arr[++top]=ele;
		else
			throw new RuntimeException("Stack is full");
	}
	
	public T pop()
	{
		if(!isEmpty())
			return arr[top--];
		else
			throw new RuntimeException("Stack is empty");
	}
	public boolean isEmpty() {
		if(top == -1)
			return true;
		else
			return false;
	}
	public boolean isFull() {
		if(top == (size-1))
			return true;
		else
			return false;
	}	
	public void display() {		
		for(int i = top;i>=0;i--)
			System.out.println(arr[i]);
	}
}
