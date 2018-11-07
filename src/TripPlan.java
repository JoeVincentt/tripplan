import java.util.Scanner;

public class TripPlan {

    public static void main(String[] args){
        intro();
        budget();
        time();
        distance();

    }

    public static void intro(){
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome!");
        System.out.print("What is your name? ");
        String name = input.nextLine();
        System.out.print("Nice to meet you " + name + " Where are you goin? ");
        String city = input.nextLine();
        System.out.println("Great " + city + " sounds like fun!");
    }

    public static void budget(){
        Scanner input=new Scanner(System.in);
        System.out.println("How many days are you going to spend? ");
        int days = input.nextInt();
        System.out.print("How much money would you like to spend? ");
        int money = input.nextInt();
        System.out.print("How many MXC are in 1 usd? ");
        double mxc = input.nextDouble();
        System.out.println("If you traveling for " + days + " you have " + money/days + " $ per day!");
        System.out.println("You gonna spend there " + days*24 +" hours");
        System.out.println("Total MXC budget is " + money*mxc + " Pesso");
    }

    public static void time(){
        Scanner input=new Scanner(System.in);
        System.out.println("What is time difference? ");
        int dif = input.nextInt();
        System.out.println("Than means when it's midnight here. These is gonna be " + (0 + dif));
        System.out.println("and when noon here, there is " + (12%24+dif));
    }

    public static void distance(){
        Scanner input=new Scanner(System.in);
        System.out.println("WHat is distance form here to there in km? ");
        double dist=input.nextDouble();
        System.out.println("In miles its gonna be: " + dist/1.6 + " miles");
    }
}
