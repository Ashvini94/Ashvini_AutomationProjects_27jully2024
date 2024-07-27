package string1;

public class Demo {

	public static void main(String[] args) {
		
		//diff betn == and equals()
		
		//create string as an variable
		String s1="welcome";
		String s2="welcome";
		
		System.out.println(s1==s2);//true
		
		System.out.println(s1.equals(s2));//true
		
		//create string as an object
		String s3=new String("welcome");
		String s4=new String("welcome");
		
		System.out.println(s3==s4);//fasle -->== compare two objects
		System.out.println(s1.equals(s4));//true -->equals() compare values of object
		

	}

}
