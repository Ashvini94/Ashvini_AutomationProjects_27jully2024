package day6;

public class Array {

	public static void main(String[] args) {


		/* Array --> 1.array is a collection of elements of same data type or heterogenous data type
		 * 			 2.we want to store multiple data into a sinle variable then we use array
		 * 			 3.It is a non-primitive data type or derived data type or collection data type or reference data type
		 *           4.It is called as refernce data type bec it refers to the class or object
		 * 			 5.There are two types of array --> 1.single dimentional array
		 * 												2.Two dimentional array/multidimentional array
		 * 
		 */
		
		//synatax of array --> 
				
				//declaration of array -->
				
				//Approach 1:
				int a[]=new int[5];//here 5 is the index or size of array means we can store 5 values into variable a and size is always fixed
								   //here size is fixed i.e 5 now we can't add any value or remove any value from array
								   //if we know the size of array and in future we don't want to add any data or values then we use 1'st approach
				
				
				//or 
				
				//int[]a=new int[5]; //--> we can declare array in this way also
				
				//we want to add values or data in array -->
				a[0]=100;
				a[1]=200;
				a[2]=300;
				a[3]=400;
				a[4]=500;
				
				//approach 2:
				
				int x[]= {100,200,300,400,500}; //declaration and assignment
												//here we can add or increment and remove or decrement the values in array
												//we use 2nd approach when we don't know the size of array or in future if we add or remove the data or values from it
		}

}