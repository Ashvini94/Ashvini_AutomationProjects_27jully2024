package demo.java;

public class DemoDatatype {

	public static void main(String[] args) {

		//data types are divided into two types-->1.primitive 2.Non-primitive
		/* 1.primitive data types -->1.in this data type represents how much amount of memory stored
		 * 							 2.It specifies size and types of data 
		 * 							 3.It classified into 2 type -->
		 *       						 a.Numeric data types
		 *       						 b.Non-numeric data types 
		 *       
		 *        a.Numeric data types --> 1.It stores numeric value
		 							  	  2.It is classified into two types -->
		 							  	  	a.1 integer data types
		 							  	  	a.2 floating data types 
		 			
		 			a.1 Integer data types --> 1.it stores integer value without decimal point
		 									   2.It is classified into four types -->i)byte, ii)short, iii)int, iv)long
		 			
		 							  	  	
		 							  	  	i)byte -->1.It stores value from -128 to +128
		 							  	  	          
		 							  	  	 Syntax --> byte variable name = value;            */
		 							  	  	
		 							  	  	//example 
		 							  	  	 
		 							  	  	 byte b = 125;
		 							  	  	 System.out.println(b); //125
		 							  	  	 byte by = -125;
		 							  	  	 System.out.println(by); //-125
		 							  	  	 
		 							  	  	
//		 							  	     ii)short --> it stores value from -32,768 to +32,768 (it stores 5 number)
		 							  	  	
//		 							  	  	syntax --> short variable name = value;
		 							  	  	 
//		 							  	  	 example 
		 							  	  	 
		 							  	  	 short s= 32765;
		 							  	  	 System.out.println(s); //32765
		 							  	  	
//		 							  	  	iii)int ---> it stores integer value means without decimal point (it stores upto 7 numbers)
		 							  	  	
		 							  	  //	Syntax --> int variable name = value
			  	  	
							//example : 
										int a=1023567456;   // -->stores 10 number
										System.out.println(a);//1023567
										
//										iv)long --> long can stores 19 number and in this we use literals l or L
										
//										syntax --> long variable name = value;
										
//										example :
										
										long l = 3456789786789067459l;  //it stores 19 number
										System.out.println(l);
										
					
										//a.2 Floating data type --> 1.it stores decimal number 
//																	 3.It is classified into two types --> i)float ii)double	
										
										//i)float --> 1.in this we used literals f or F
//										               2.It stores 6 to 7 number after decimal point 
										 
										// syntax --> flat variable name = value;
							
							//example :
										float f= 20.34678679f;
										System.out.println(f);
										
										
//										ii)double	--> it stores 14 to 15 number after deciaml points 
										
//										Syntax --> double variable name = value ;
										
//										example 
										
										double d = 23.23456789954789123456;
										System.out.println(d);
		
										
		//       b. Non-numeric data types --> 1.it doesn't contain number 
		// 									   2.it has two types --> a)boolean b)char
										
						//    a)boolean	 --> it stores true or false value
								
//								Syntax --> boolean variable name = value ;		
										
//										example :
										boolean bl = true;
										System.out.println(bl);
										
										
//							  b)char --> it stores single character and it is written in single code

										
//										Syntax --> char variable name = value ;
										
//										example :
										
										char c = 'A';
										System.out.println(c); //A
										
										//primitive data types contains some value means not accept null value
										
										//char c=''; //it shows compile error
		
										
				/* 2. Non-primitive data type -->1.it is also called as reference type bec it refers a class or object
											     2.It has no fixed size 
											     3.Non-primitive data type accepts null value  */
								
										
										String str = "Hello";
										System.out.println(str); //Hello
										
										// for print the output in same line use print
										
										String sr="Welcome to the automation class";
										System.out.print(sr);//Welcome to the automation class
										System.out.print(sr);//Welcome to the automation class
										
										//for insert space use 
										System.out.println();//it will insert blank line
										System.out.println(str);
										
										//accept null value
										String st=""; //null value means blank value
										System.out.println(st);
										
										
										
										
	}

}
