//Driver Program

import java.util.Scanner;

public class KenneVer2
{
    public static void main (String[] canbeanything)
    {
        Scanner scan = new Scanner (System.in);
        
        //Create objects - test constructors
        DogVer2 dog1 = new DogVer2("Pico", 2, "hates cats and bikes");
        DogVer2 dog2 = new DogVer2("Kruger", 3, "Likes to butt bounce");
        DogVer2 dog3 = new DogVer2();
         
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
        
        dog1.setAge(dog1.getAge() + 1);
        
        System.out.println("\n" + dog1);
        System.out.println(dog2);
        System.out.println(dog3);
        System.out.println("Happy Birthday " + dog1.getName() + "! You are now " +dog1.getAge() + 
        " which is " + dog1.peopleYears() + " years old in people years!");
        
        //Dog count
        System.out.println("\nDogs created: " + DogVer2.getCount());
    }    
}