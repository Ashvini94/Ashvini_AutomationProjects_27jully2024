package day15;

/* super keyword -->1.it is used in only inheritance concept
 * 					2.super keyword representing immediate parent class
 * 					3.super keyword will be used to invoke immediate parent class variable and immediate parent class method
 * 					4.super keyword is only used in class not in interface
 * 					5.super keyword is only use with variable and method not with class
 * 
 */

class Animal
{
	String color="white"; 
	
	void eat()
	{
		System.out.println("This is parent class eat method");
	}
}
class Dog extends Animal
{
	String color="black"; //override variable
	
	void display()
	{
		System.out.println(super.color); //here bec of super keyword parent class varaible will be call with the help of child class object
	}

	void eat()
	{
		//System.out.println("This is child class eat method");
		super.eat();//bec of super keyword parent class eat method will be call with the help of child class obj
	}
	
}

public class SuperKeyword {

	public static void main(String[] args) {

		//create child class object 
		Dog d=new Dog();
		
		d.display();//call child class display method
		
		d.eat();
		
		
		

	}

}
