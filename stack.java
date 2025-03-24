package day5;

public class stack {
	int[] stack1=new int[10];
	int top=-1;
	public void push(int val)
	{
		if(top<9)
		{
		stack1[++top]=val;
		++top;
	}
		else
		{
			System.out.println("st");
		}
	}
		public void pop()
		{
			stack1[top--]=0;
			for(int i=0;i<top;i++)
			{
				System.out.println(stack1);
				
		}
			public void peek()
			{
				System.out.println()
			}
			

}
}
