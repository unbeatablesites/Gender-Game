import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        askGenderQuestion();

        Scanner scan = new Scanner(System.in);

        String genderAns = scan.nextLine();

        askFirstNameQuestion();
    }

    public static void askGenderQuestion(){
        System.out.println("What is your gender (M or F):");
    }

    public static void askFirstNameQuestion(){
        System.out.println("First name:");
    }



}
