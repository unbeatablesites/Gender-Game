import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        askGenderQuestion();

        Scanner scan = new Scanner(System.in);

        String genderAns = scan.nextLine().toLowerCase();

        askFirstNameQuestion();

        String firstNameAns = scan.nextLine();

        askLastNameQuestion();

        String lastNameAns = scan.nextLine();

        askAgeQuestion();

        String ageAns = scan.nextLine();

        if(genderAns.equals("F")){

        }


    }




    public static void askGenderQuestion(){
        System.out.println("What is your gender (M or F):");
    }

    public static void askFirstNameQuestion(){
        System.out.println("First name:");
    }

    public static void askLastNameQuestion(){
        System.out.println("Last name:");
    }
    public static void askAgeQuestion(){
        System.out.println("Age:");
    }


}
