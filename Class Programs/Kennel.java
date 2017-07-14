//Driver Program

import java.util.Scanner;

public class Kennel
{
    public static void main (String[] canbeanything)
    {
        Scanner scan = new Scanner (System.in);
        
        //Create objects - test constructors
        Dog dog1 = new Dog("Pico", 2, "hates cats and bikes");
        Dog dog2 = new Dog("Kruger", 3, "Likes to butt bounce");
        Dog dog3 = new Dog();
         
        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
        
        //Local Variables
        String dogname, dogquirks;
        int dogage;
    
        System.out.print("Enter a dog's name: " );
            dogname = scan.nextLine();
                   
        System.out.print("Enter a dog's age: " );
            dogage = scan.nextInt();
                    
            dogquirks = scan.nextLine();
        System.out.print("Enter a dog's quirks: " );
            dogquirks = scan.nextLine();
             
        
        dog3.setName(dogname);
        dog3.setAge(dogage);
        dog3.setQuirks(dogquirks); 
        
        
        System.out.println("\n" + dog1);
        System.out.println(dog2);
        System.out.println(dog3); 
        
    }    
}