import java.util.Scanner;

public class TestDog {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Number of dogs in the kennel: ");
        int numDogs = scan.nextInt();
        scan.nextLine();

        int maxAge = 0;
        Dog oldDog = new Dog(maxAge, "");
        int ageTotal = 0;
        for (int i = 0; i < numDogs; i++) {
            System.out.println("Enter Dog age: ");
            int newDogAge = scan.nextInt();
            scan.nextLine();

            System.out.println("Enter Dog breed: ");
            String newDogBreed = scan.nextLine();

            Dog newDog = new Dog(newDogAge, newDogBreed);

            if ((newDog.compareTo(oldDog)) == 1) {
                oldDog = newDog;
            }

            ageTotal = ageTotal + newDogAge;
        }

        System.out.println("Average Age: " + ((float)(ageTotal)/numDogs));
        System.out.println("Oldest Dog -> Breed: " + oldDog.getBreed() + ", Age: " +
                oldDog.getAge());
    }

}
