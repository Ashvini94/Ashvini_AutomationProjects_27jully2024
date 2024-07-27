package day12;

public class BoxMain {

	public static void main(String[] args) {

		//Box b=new Box();//1st call default constructor i.e constructor 1

		//Box b=new Box(10.15,20.25,10.15);//constructor 2 call
		
		Box b=new Box(10.15);//constructor 3 call
		System.out.println(b.volume());//call method
	}

}
