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

        int ageAns = scan.nextInt();

        if(genderAns.equals("F") && ageAns > 20){

            System.out.println("Are you married " + firstNameAns + " (y or n)?" );

            String areYouMarriedAns = scan.nextLine().toLowerCase();

            if(areYouMarriedAns.equals("Y")){

                System.out.println("Then I shall call you Mrs. " + lastNameAns);

            }
            if(areYouMarriedAns.equals("N")){

                System.out.println("Then I shall call you Ms. " + lastNameAns);

            }

        }
        if(genderAns.equals("F") && ageAns < 20){

            System.out.println("Then I shall call you " +firstNameAns+ " " +lastNameAns);
        }

        if(genderAns.equals("M") && ageAns > 20){

            System.out.println("Are you married " + firstNameAns + " (y or n)?" );

            String areYouMarriedAns = scan.nextLine().toLowerCase();

            if(areYouMarriedAns.equals("Y")){

                System.out.println("Then I shall call you Mr. " + lastNameAns);

            }else{
                System.out.println("Then I shall call you " +firstNameAns+ " " +lastNameAns);
            }
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
