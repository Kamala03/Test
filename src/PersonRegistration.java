import java.util.Scanner;

public class PersonRegistration {
    void registration() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your fin: ");
        String fin = sc.nextLine();

        if (age < 18) {
            throw new MyException("Invalid age");
        }

        if (fin.length() != 7) {
            throw new MyException("Invalid fin");
        }

        Person person = new Person(name, age, fin);
        System.out.println("Registration ended successful");
    }

}
