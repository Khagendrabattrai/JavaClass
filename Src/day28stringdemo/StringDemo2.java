package day28stringdemo;

public class StringDemo2 {
// String comparision on below:
	public static void main(String[] args) {
String s1 ="USA";
String s2="USA";
String s3=new String("USA");
String s4= new String ("USA");
System.out.println(s1==s2);// true // yo  true xa coz autai object lai refer gari.....
                                   // ra xa reffer variable lae
System.out.println(s1==s3);// false// yo false xa coz auta object(s1 ko) literal pool ma ...
                                   // banira xa arko (s2) ko heap memory ma 
System.out.println(s3==s4);// false // yo false xa coz new lae xuta xuta object heap 
                                    // memory ma banaira xa s3 lae auta object reffer farxa s4 lae...
                                     // xutai object reffer garxa 
// mathi sapaiko vitra ko content USA Nai xa. They are equal by content  wise
// string class ko library ma  diff method haru xa ra ...
// s1 ra s3 lai equal garaunu xa vane equal vannae method use garnae 
// abo tala ko code lae result sap true dinxa  // content wise equal garaunaxa vane talako code ..
// use garnae mathi ko use garnu hudaina kina ke bug dina sakxa
System.out.println(s1.equals(s2));  // true 
System.out.println(s1.equals(s3));// true 
System.out.println(s3.equals(s4));// true 
 
// yo talako false hunxa coz content same xa but...
// auta USA upper case ma xa arkoo usa lower case ma xa
 String s5= new String("usa");
 System.out.println(s1.equals(s5));// false 
 // content j vaye pani equal garauna xa vane equalIgnore case use garinxa 
 System.out.println(s1.equalsIgnoreCase(s5));// true 
	}

}
