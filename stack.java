package day5;

public class stack {
	int[] stack1=new int[10];
	int top=-1;
	public void push(int val)
	{
		if(top<9)
		{
		stack1[++top]=val;
	}
		else
		{
			System.out.println("stack overflow");
		}
	}
		public void pop()
		{
			if(top>=0)
			{
				System.out.println("popped:"+stack1[top--]);
			}
			else
			{
				System.out.println("stack underflow");
			}
				
		}
		
			public void peek() {
		        if (top >= 0) {
		            System.out.println("Top value: " + stack1[top]);
		        } else {
		            System.out.println("Stack is empty. No top value.");
		        }
		    }
			public void display() {
		        if (top >= 0) {
		            System.out.print("Stack elements: ");
		            for (int i = 0; i <= top; i++) {
		                System.out.print(stack1[i] + " ");
		           
		        } 
		        }
		            else 
		            {
		            System.out.println("Stack is empty.");
		        }

}
}


