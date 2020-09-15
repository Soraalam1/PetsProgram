import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PetsProgramWithSounds {
    public static void main(String[] args) {
        System.out.println("How many pets do you have?");
        Scanner scanner = new Scanner(System.in);
        int numberOfPets = scanner.nextInt();
        scanner.nextLine();
        ArrayList<String> petTypes = new ArrayList<String>();
        ArrayList<String> petNames = new ArrayList<String>();
        ArrayList<String> petSound = new ArrayList<String>();
        System.out.println("Answer the following for each pet:");
        String petName;
        String petType;

        for(int count = 0; count < numberOfPets; count++){
            System.out.println("What kind of pet do you have?");
            petType = scanner.nextLine();
            petTypes.add(petType);

            System.out.println("What is the pets name?");
            petName = scanner.nextLine();
            petNames.add(petName);

            if(petType.equalsIgnoreCase("Dog")){
              Dog dog = new Dog();
                petSound.add(dog.Speak());
            }
            if(petType.equalsIgnoreCase("Cat")){
                Cat cat = new Cat();
                petSound.add(cat.Speak());
            }
            if(petType.equalsIgnoreCase("Duck")){
                Duck duck = new Duck();
                petSound.add(duck.Speak());
            }
           if(!petType.equalsIgnoreCase("dog") &&
            !petType.equalsIgnoreCase("cat") &&
           !petType.equalsIgnoreCase("Duck")){
                Pet pet = new Pet();
                petSound.add(pet.Speak());
            }

        }
        System.out.println(Arrays.toString(petNames.toArray()));
        System.out.println(Arrays.toString(petTypes.toArray()));
        System.out.println(Arrays.toString(petSound.toArray()));
    }
}
