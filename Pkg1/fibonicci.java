package Pkg1;

public class fibonicci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		/*int a=0;
		int b=1;
		int limit=20;
		int sum=0;
		// 0,1,1,2,3,5,8
		for(int i=2;i<10;i++)
		{
			sum=a+b;
			System.out.println(sum);
			a=b;
			b=sum;
		}*/
		
		String name= "Abhilasha gupta";
		char ch;
		int count=0;
		int i=0;
		int length=name.length();
		System.out.println(length);
		while(i<length)
		{
			ch=name.charAt(i);
			
			if(ch=='a' || ch== 'e' || ch=='i' || ch== 'o' || ch=='u' || ch=='A' || ch== 'E' || ch=='I' || ch== 'O' || ch=='U' )
				
			{
				System.out.println(ch);
				count++;
			}
			
			i++;
		}
		
		System.out.println("The number of vowels in string is "+count);
	}

}
