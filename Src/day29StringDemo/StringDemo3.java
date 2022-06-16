package day29StringDemo;

public class StringDemo3 {

	public static void main(String[] args) {
		// yaha tala kunai case ma pani "Good Morning" change hudaina .This is called immutable
	 String s1= "Good Morning";
	 System.out.println(s1);
	 // Morning matra print garaunu paryo vane 
	 System.out.println(s1.substring(5));
	 System.out.println(s1.substring(0,4));// here g ko index 0 xa ra d ko index 3 
	                                       //xa so just 1 plus garaera  linae so d=3 so we write 4
	 System.out.println(s1.toLowerCase());// change all into small letter
	System.out.println(s1.toUpperCase());// change all into capital letter 
	System.out.println(s1.indexOf("M"));  // it gives the index of M 
	System.out.println(s1.indexOf("i")); // it gives index of i
	System.out.println(s1.lastIndexOf("o")); // Good mornig ma 3 ta o xa so lastindex lae last ma  
	                                   //   jun xa teskoo index linxa
	System.out.println(s1.charAt(3));
	System.out.println(s1.charAt(5));
	//System.out.println(s1(3)); asari garna mildaina
	//System.out.println(s1[3]); asari pani garna mildaina 

	// To find the array of character
	char[]ch= s1.toCharArray();
	System.out.println(ch[3]);
	// To concat
	System.out.println("Hello i am Khagendra!!!, ".concat(s1));
	// next way to concat
	//s1= s1+" my dear friends!!";
	System.out.println(s1);
	 // s1=""; //khali xa ke xaina check garnako lagi// yo agadi ko case ma true dinxa but ..
	// s1=" "; yo case ma false dinxa why? kina ke " " doita ko bch ma space xa mathi so yo empty xaina 
	System.out.println(s1.isEmpty());
	//System.out.println(s1.isBlank());
	//To check the length 
	System.out.println(s1.length());

	 // To replace the old character by new 
	System.out.println(s1.replace("Morning", "Evening"));
	String s2= " I am khagendra ";
	System.out.println(s2); // aslae mathiko same dinxa 

	System.out.println(s2.trim());// aslae trim garaepaxi ko dinxa
	                              // trim lae agadi ra paxadi ko space hatauxa 

	//note: immutable vanya ak choti banai sake paxi change nahunae 
	// like yaha mathi "good morning" kayle change hudaina  kunai case ma pani like 
	 // System.out.println(s1.toUpperCase()); yo agadi ko case ma " good morning" uppercase ma ..
	// change va xa but actually "good morning"sadhai orgional form ma nai hunxa this is called..
	// immutable .
		}

	

	}


