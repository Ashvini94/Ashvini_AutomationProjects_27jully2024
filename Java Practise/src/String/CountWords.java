package String;

public class CountWords {

	public static void main(String[] args) {


		//count words in a string
		
		String s="Welcome to java and selenium automation";
		
		int count =1;
		
		for(int i=0;i<=s.length()-1;i++)
		{
			if((s.charAt(i)==' ')&&(s.charAt(i+1)!=' '))
			{
				count++;
			}
		}
		System.out.println(count);//6

	}

}
