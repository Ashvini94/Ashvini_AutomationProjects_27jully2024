package day3;

public class OperatorDemo {

	public static void main(String[] args) {
		
		//operator --> operator is a symbol which will perform operation
		
		//eg:
		
		int a=100,b=200;
		int result =a+b; // here a+b is an expression,+ is a operator, a and b are operands
						 // operands --> the variables which are particiapted in the expression along with the operator is called operands 
		
		System.out.println(result); //300
		
		//Types of operator -->
		// 1.Arithmatic operator --> +, -, *, /, %
		// 2.relational operator or compariosn operator --> >, >=, <, <=, ==, !=
		// 3.logical operator --> && || !
		// 4.increment decrement operator --> ++ , --
		// 5.Assignment operator --> =, += , -=, *=, /=, %=
		// 6.Conditional operator --> ?:
		
		// 1.Arithmatic operator --> +, -, *, /, %
		
		int x=20,y=10;
		
		
		int res=x+y;
		System.out.println("Sum of x and y is:"+res); //30
		
		//or 
		
		//System.out.println("sum of x and y is:"+(x+y)); //30
		System.out.println("diff of x and y is:"+(x-y)); //10
		System.out.println("mul of x and y is:"+(x*y)); //200
		System.out.println("diff of x and y is:"+(x/y)); //2 --> quotient
		System.out.println("diff of x and y is:"+(x%y)); //0 --> modulo division means gives remainder
		
		// 2.relational operator or compariosn operator --> >, >=, <, <=, ==, !=
		// it will returns boolean value i.e true or false
		// it can done with all type of data type
		
		int p=100,q=300;
		boolean bl=(p<q);//true
		//System.out.println(bl); //true
		System.out.println(p<b); //true
		System.out.println(p<=q); //true
		System.out.println(p>q); // false
		System.out.println(p>=q); //false
		
		// 3.logical operator --> && || !
		// it will returns boolean value 
		// works between two boolean values
		// it can be done with only boolean type of data type
		
		//eg:1
		boolean i= true;
		boolean j=false;
		System.out.println(i&&j); //false
		System.out.println(i|| j); //true
		System.out.println(!i); //false
		System.out.println(!j); //true
		
		//eg:2
		boolean b1=20<10; //false
		boolean b2=30>20; //true
		
		System.out.println(b1 && b2); //false
		System.out.println(b1 || b2); //true
		System.out.println(!b1); //true
		System.out.println(!b2); //false
		
		
		// 4.increment decrement operator --> ++ , --
		
		//increment ++  --> two types 1.preincrement 2.postincrement
		
		
		int i1=50;
		//i1=i1+1; //50+1=51
		i1++; //51
		System.out.println(i1); //51
		
		//case 1 -->postincrement -->first assign and then increment
		int i2=80;
		int post=i2++;
		System.out.println(post); //80
		System.out.println(i2); //81
		
		//case 2 -->preincrement -->first increment then assign
		 int i3=90;
		 int pre=++i3;
		 System.out.println(pre); //91
		 System.out.println(i3); //91
		 
		 //decrement -- --> two tpes 1.postdecrement 2.predecrement
		 
		 //case1 -->postdecrement
		 int j1=500;
		 int post1=j1--;
		 System.out.println(post1); //500
		 System.out.println(j1); //499
		 
		 //case2 -->predecrement
		 int j2=500;
		 int pre1=--j2;
		 System.out.println(pre1); //499
		 System.out.println(j2); //499
		 
		// 5.Assignment operator or short hand operator  --> =, += , -=, *=, /=, %=
		 
		int ass=200;
		// ass= ass+5; or
		
	   // ass+=5;
		//System.out.println(ass); //200+5 =205
	    
	   // ass-=5; or
	   // ass=ass*2;
	   // System.out.println(ass); //200*2 =400
	    
	   // ass/=2;
	    //System.out.println(ass); //100
		
		ass%=5;
		System.out.println(ass); //0
	    
	    
		// 6.Conditional operator --> ?:
		
		//syntax : var =exp? result 1 : result 2;
		
		int t=200,r=100;
		int condition=(t<r)?t:r; //false
		System.out.println(condition); //100
		
		int person_age=30; //perosn_age >18 then valid otherwise invalid
		String age=(person_age >18)? "valid" : "invalid";
		System.out.println(age); //valid
		
		
		
		 

	}

}
