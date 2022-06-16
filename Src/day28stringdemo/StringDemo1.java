package day28stringdemo;
// object creation on below :
public class StringDemo1 {
// String : it is a  class which is defined in java.lang package and cannot be extended cont...
// because it is a final class.An object of string class is represented by immutable cont.... 
// sequence of character.
// Too use String it is not necessary to import.
// String ko object ak choti banai sakae pacxi change garna mildaina
	public static void main(String[] args) {
System.out.println();
  // Scanner input= null// Scanner is not defined in java.lang package so we have to import it.

// Implicit creation by using literals 
String s1 ="Khagendra";
System.out.println(s1);

// explicit creation by calling  constructor or using constructor
//first 
String s2= new String();   //  yo agadi ko string ko constructor: public String() {}.....
                          //kehai argumnts xainna  yo mathi ko constructor ma 
                          
System.out.println(s2);
//second
String s3= new String("Hi good mrning Nepal");   //  yo agadi ko string ko constructor: ....
                                                //public String(String original) {}
                                      // yo constructor lae string matra linxa
  
System.out.println(s3);
//third 
//array of char leyaera use garna sakxa
char[]ch= {'a','b','c','d'};
String s4=new String(ch);
System.out.println(s4);
// fourth
// array of byte leyaera use garna ssakxa
byte[]b= {2,4,5,};
String c= new String(b);
System.out.println(c);
	}

}
