import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PetsProgram {
    public static void main(String[] args) {
        System.out.println("How many pets do you have?");
        Scanner scanner = new Scanner(System.in);
        int numberOfPets = scanner.nextInt();
        scanner.nextLine();
        ArrayList<String> petTypes = new ArrayList<String>();
        ArrayList<String> petNames = new ArrayList<String>();
        System.out.println("Answer the following for each pet:");


        for(int count = 0; count < numberOfPets; count++){
            System.out.println("What kind of pet do you have?");
            petTypes.add(scanner.nextLine());
            System.out.println("What is the pets name?");
            petNames.add(scanner.nextLine());
        }
        System.out.println(Arrays.toString(petNames.toArray()));
        System.out.println(Arrays.toString(petTypes.toArray()));
    }
}
