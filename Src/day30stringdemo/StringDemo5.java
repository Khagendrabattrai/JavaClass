package day30stringdemo;

public class StringDemo5 {

	public static void main(String[] args) {
String sentence="Hi i am khagendra Bhattarai, I am from Nepal currently living at USA";
String [] words=sentence.split(" a"); // split is an object from java lang package 
                                     //yaha jha jha space xa ty bata split garxa 
// to print array
for (String w: words){
System.out.println(w);}
System.out.println("==============================================");	
String sentence2="Hi i am khagendra Bhattarai, I am from Nepal currently living at USA";
String [] words2=sentence2.split(",");// split is an object from java lang package 
	                                     //yaha jha jha ,(commas)xa ty bata split garxa 
// to print array
for (String w2:words2){
System.out.println(w2);}
		}

}
