package day11;

//in how many ways we can store data into variable in a class
public class Student {

	int sid;
	String sname;
	char grade;
	
	//1st way
	void printData()
	{
		System.out.println(sid+ " "+sname+ " "+grade);
	}
	
	//2nd way create another method to store or hold the data
	void printSetData(int id,String name,char gr)
	{
		sid=id;
		sname=name;
		grade=gr;
	}
	
	//3.by using constructor
	Student(int id,String name,char gr)
	{
		sid=id;
		sname=name;
		grade=gr;
	}
}
