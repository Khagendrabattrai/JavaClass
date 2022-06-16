package day27polymorphism;

import java.util.Scanner;

public class AnimalTest {

	public static void main(String[] args) {
     Animal animal= null;
       /*  animal = new Dog();
         animal.makeSound();
         
         animal= new Tiger();
         animal.makeSound();*/
      // yo talako code ma  
     // user lae tiger deyo vane Rore dinxa 
     // user lae dog deyo vanae bark dinxa 
     // user lae aru kunai name deyo vane wrong selection dinxa 
     // yaniki yo run time ma  decide vai ra xa  kasko sound nikalne 
     // note :yo talako run time polymorphism ho(dynamic binding)
     // run time polymorphism is achived by overridding 
         Scanner input = new Scanner(System.in);
         System.out.println("Enter animal name ");
         String animalName = input.next();
       
         switch (animalName) {
		case"dog" :
			 animal = new Dog();
			break;
		case"tiger" :
			 animal = new Tiger();
			break;

		default:
			System.out.println("Wrong selection of animal name: ");
			break;
		}
     
         if (animal!= null);
         
         animal.makeSound();
         
	}

}
