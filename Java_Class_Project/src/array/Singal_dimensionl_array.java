package array;

public class Singal_dimensionl_array {

	public static void main(String[] args) {
	
		//single dimensional aaray -->in this we have only row
		
		//1.declaration of array by allocating a memory
		
		//int []mark = new int[5]; //or
		
		int mark[] = new int[5];
		
		//add element in array
		mark[0]=100;
		mark[1]=200;
		mark[2]=300;
		mark[3]=400;
		mark[4]=500;
		//mark[5]=600;
		
		
		//print element from array
		//System.out.println(mark[3]);//400
		//System.out.println(mark[2]);//300
		//System.out.println(mark[5]);//array index out of bound exception
		
		//to find length in array
		//System.out.println("length of array is: "+mark.length);//5
		
		//2.declaration of array without allocating memory
		
		//syntax--> datatype[]arrayname ={value};
		
		String s[]= {"ab","cd","ef","gh","ij"};
		
		//to print array element
		System.out.println(s[2]);//ef
		
		//to find length of array
		System.out.println(s.length);//5
		
		//to print all array elements using for each loop/enhanced for loop
		
	/*	for(String variable:s)
		{
			System.out.println(variable);
		}
		
		*/
		
		//or print the element using for loop
		for(int i=0;i<s.length;i++)
		{
			//System.out.println(s[i]);
			System.out.println("s[" +i+ "]=" +s[i]);
		}

	}

}
