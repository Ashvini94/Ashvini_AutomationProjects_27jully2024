package accessmodifiers1;


//modifiers/specifiers -->it defines scope in java
//1.Access modifiers -->access modifiers specifies the scope of class,method,variable and constructor
//                      it classify into four types
//                      1.public,protected,default,private

//1.public access modifier -->the scope of public access modifier is within the class,outside the class,within the package and outside the package

//2.protected access modifier -->the scope of protected access modifier is within the class,outside the class,within the package,outside the package by forming inheritance

//3.default access modifier -->if you do not mentaion any access modifier then it will be called as default access modifier
//                             the scope of default access modifier is within the class,outside the class,within the package but not outside the package.

//4.private access modifier -->the scope of private access modifier is within the class but not outside the class

//public > protected > default > private

//2.Non-access modifier --> it defines where to restrict access of class,method and vraiable
//                          it is not used with constructor


public class Class1 {//class can take only public and default access modifier
	
	int x=100; //variable can take all the access modifiers i.e public,private,protected,default
	
	public void m1() //method can take all the access modifiers i.e public,private,protected,default
	{
		System.out.println(x);
	}

	public static void main(String[] args) {
		
	}

}
