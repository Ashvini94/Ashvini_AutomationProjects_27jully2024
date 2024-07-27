package day13;

public class StaticKeyword2 {

	public static void main(String[] args) {
		
		//in another class we can not access static stuff directly we can access it using classname
		
		System.out.println(StaticKeyword1.b);
		StaticKeyword1.show();
		
		
		//static method  can access non static stuff through object
		
		StaticKeyword1 stc=new StaticKeyword1();
		System.out.println(stc.a);
		
		stc.display();

	}

}
