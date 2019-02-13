package max;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello, World!");
		
		int i = 0;
		String str = "This is a string";
		boolean bo = true;
		int[] ints = {1,2,3,4,5,6,7,8,9,10};
		
		if(bo == true)
		{
			
		}
		for(int idx = 0; idx < 5; idx++)
		{
			
		}
		while(i< 10)
		{
			i++;
		}
		//foreach(var i in collection)
		for(int idx : ints)
		{
			
		}
		int a = 5 % 2; //a = 1
		
		int total = 0;
		for(int idx : ints)
		{
			if(idx % 2 == 0)
			{
				total += idx;
			}
		}
		System.out.println(total);
		
		total2 = 0;
		for(int i2 = 0; i < ints.length; i2++)
		{
			if(i2 % 2 == 0)
			{
				total2 += i2;
			}
		}
		System.out.println(total2);
		
	}

}
