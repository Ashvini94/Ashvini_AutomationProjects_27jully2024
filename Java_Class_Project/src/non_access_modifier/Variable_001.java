package non_access_modifier;

public class Variable_001 {
	
	//if you decalre variable as final then you can not change the value of variable
	final int i=500;
	
	static long l=2000;//static variable lie inside the class only it will restrict to create in method
	
	public void get(int a)
	{
		//i=a;//error -->bec you can not reassign value to the final variable
	}

	public static void main(String[] args) {
		

	}

}
