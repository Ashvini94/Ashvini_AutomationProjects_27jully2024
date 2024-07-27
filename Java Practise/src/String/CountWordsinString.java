package String;

public class CountWordsinString {

	public static void main(String[] args) {
	
		String s="A very warm welcome to manual testing and java and automation testing";//total words 12
		
		//find count of words
		int count =1;
		
		for(int i=0;i<=s.length()-1;i++)
		{
			if((s.charAt(i)==' ')&& (s.charAt(i+1)!=' '))
			{
				count++;
			}
		}
		System.out.println("Count of words: "+count);

	}

}
