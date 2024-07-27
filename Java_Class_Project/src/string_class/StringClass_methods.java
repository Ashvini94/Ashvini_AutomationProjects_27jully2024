package string_class;

public class StringClass_methods {

	public static void main(String[] args) {
		
		String a ="Nagpur";
		
		//1.to get length of character present in string -->use length() and its return type is int
		
		int len=a.length();
		System.out.println("Length of string is: "+len);//or
		
		System.out.println("Length of string is: "+a.length());//6
		
		//2.to replace some character from string -->use replace() and its return type is string
		
		String b="Wardha";
		
		String str=b.replace('a', 'e');
		System.out.println(str);//or
		System.out.println(b.replace('a','e'));//werdhe
		
		//3.if we want to replace only one charater from repetative character then
		String str1=b.replaceFirst("a", "c");
		System.out.println(str1);//wcrdha
		
		//4.to get index/position of character in string -->use indexOF() and its return type is int
		String c="Aut omation";
		System.out.println(c.indexOf("m"));//4
		
		//5.to get substring(some character)from string--> use subString()and its return type is string
		String d="Selenium";
		System.out.println("Substring is: "+d.substring(5));//nium
		System.out.println("Substring is: "+d.substring(2, 7));//leniu
		
		//6.to get character with respect to index -->use charAt() and its return type is char
		String e="Automation";
		System.out.println(e.charAt(4));//m
		
		//7.to add another string in given string -->use concat() and its return type is string.
	    String f="Automation";
		System.out.println(f.concat("Selenium"));//or
		System.out.println(f+"java and selenium");
		
		//8.to make string in a lowercase -->use toLowerCase() and its return type is string
		String g="NAGPUR";
		System.out.println(g.toLowerCase());//NAGPUR
		
		//8.to make string in uppercase -->use toUpperCase() and its return type is string
		String h="wardha";
		System.out.println(h.toUpperCase());//WARDHA
		
		//9.to remove beginning and ending spaces from string -->use trim() and its return type is String
		String i=new String("   table and chair  ");
		System.out.print(i.trim());
		System.out.println("hello");
		
		//10.to check string empty or not -->use isEmpty() -->its return type is boolean
		String j="";
		System.out.println(j.isEmpty());//true
		
		String k="selenium and java";
		System.out.println(k.isEmpty());//false
		
		//11.to check some character which is present in string or not -->use contains(sequence character) and its return type is boolean
		String l="Welcome";
		System.out.println(l.contains("come"));//true
		System.out.println(l.contains("wel"));//false -->bec it consider case sensitive
		System.out.println(l.contains("lme"));//false  -->bec character should be in sequence
		
		//12.to compare two string value is same or not-->use equals() and its return type is boolean,this method accept string value or string variable and it consider case sensitive
		String m="selenium";
		String n="selenium";
		System.out.println(m.equals(n));//true//or
		System.out.println(m.equals("selenium"));//true
		
		//13.to ignore case of string between two string value -->use equalsIgnoreCase() and its return type is boolean.this method accept string value or string variable and it ignore case
		String o="Welcome";
		String p="welcome";
		System.out.println(o.equalsIgnoreCase(p));//true
		
		//14.to check ending character in string -->use endsWith() and its return type is boolean
		String q="Umred and aaibaba";
		System.out.println("its ending character is: "+q.endsWith("baba"));//true
		
		//15.Split method-->1.if you want to break or split the string then use split method with reference variable of string
		//                  2.Split method accept argument as a portion of string that you want split string.
		//					3.It may be character,colon,underscore,hyphen,white spaces
		//  				4.after using split method it will convert single dimensional array which is start from zero index and store in a one value of array
		
		String st="Hello I am John and i am from Poland";
		
		String stn[]=st.split(" ");
		
		System.out.println(stn[0]);
		System.out.println(stn[1]);
		System.out.println(stn[2]);
		System.out.println(stn[3]);
		System.out.println(stn[4]);
		System.out.println(stn[5]);
		System.out.println(stn[6]);
		System.out.println(stn[7]);
		System.out.println(stn[8]);
		
		//to print all values by using for each loop
	/*	for(String all_values:stn)
		{
			System.out.println(all_values);
		}
		*/
		
		//or 
		for(int x=0;x<=8;x++)
		{
			System.out.println(stn[x]);
		}
		
		//break string with character
		String abc="Character";
		
		String[]sn=abc.split("t");
		
		for(String s:sn)
		{
			System.out.println(s);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

	}

}
