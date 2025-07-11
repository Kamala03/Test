public class Main {
    public static void main(String[] args) {
        PersonRegistration personRegistration = new PersonRegistration();

        try {
            personRegistration.registration();
        } catch (MyException e) {
            System.out.println("Something went wrong");
            System.out.println("Try again");
        }

    }
}
