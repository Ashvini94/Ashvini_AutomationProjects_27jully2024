package day9assignment;

public class CountsWordsInString {

	public static void main(String[] args) {

		//find count words in a string
		String s="welcome to java language";
		System.out.println(s.length());//15-1=14
		
		int count=1;
		
		for(int i=0;i<=s.length()-1;i++)//0 ,0<=14,
		{
			if((s.charAt(i)==' ')&&(s.charAt(i+1)!=' '))
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
