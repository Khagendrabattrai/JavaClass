package day29StringDemo;

public class StringDemo4 {

	public static void main(String[] args) {
String s1=" Hello";  
System.out.println(s1);  // here yo s1 lae hello nai reffer garxa 
s1.concat("people");   // here concat lae garda yaha Hello people vayaera basyo but yaha kunai referance..
                       // variable xaina 
System.out.println(s1);// yo s1 lae ne hello nai reffer garxa... 
                        // so  out put doitai case ma hello nai auxa 

// abo hello people nai linu xa vane we have two ways 
// first way
 String s2=" Hello";  
 System.out.println(s1);  // here yo s1 lae hello nai reffer garxa 
 s2=s2.concat (" people!!!");   // here concat lae garda yaha Hello people vayaera basyo but yaha kunai referance..
                       // variable xaina 
System.out.println(s2);
// second way
String s3=" Hello";  
System.out.println(s3); 
 String s4=s3.concat (" people!!!");  
System.out.println(s4);

// immutable vanya ak choti banai sake paxii arko choti change nahunae
	}

}
