public class Main {

import java.util.Scanner;
    public class thirdHW {
        public static void main(String[] args) {
            String[][] myArray = new String[7][2];
            myArray[0][0] = "Sunday";
            myArray[0][1] = "do home work";
            myArray[1][0] = "Monday";
            myArray[1][1] = "go to courses; watch a film";
            myArray[2][0] = "Tuesday";
            myArray[2][1] = "пo to the gym";
            myArray[3][0] = "Wednesday";
            myArray[3][1] = "visit grandma";
            myArray[4][0] = "Thursday";
            myArray[4][1] = "пo to an art show";
            myArray[5][0] = "Friday";
            myArray[5][1] = "пo to the pool";
            myArray[6][0] = "Saturday";
            myArray[6][1] = "Get together with friends";

            String inputLine = "";
            Scanner myScanner = new Scanner(System.in);

            while (!inputLine.equals("Exit")) {
                System.out.println("Please, input the day of the week: ");
                inputLine = myScanner.nextLine();

                switch (inputLine) {
                    case "sunday", "SUNDAY", "Sunday ", "Sunday":
                        System.out.println("Your tasks for " + myArray[0][0] + " " + myArray[0][1]);
                        break;
                    case "monday", "MONDAY", "Monday ", "Monday":
                        System.out.println("Your tasks for " + myArray[1][0] + " " + myArray[1][1]);
                        break;
                    case "tuesday", "TUESDAY", "Tuesday ", "Tuesday":
                        System.out.println("Your tasks for " + myArray[2][0] + " " + myArray[2][1]);
                        break;
                    case "wednesday", "WEDNESDAY", "Wednesday ", "Wednesday":
                        System.out.println("Your tasks for " + myArray[3][0] + " " + myArray[3][1]);
                        break;
                    case "thursday", "THURSDAY", "Thursday ", "Thursday":
                        System.out.println("Your tasks for " + myArray[4][0] + " " + myArray[4][1]);
                        break;
                    case "friday", "FRIDAY", "Friday ", "Friday":
                        System.out.println("Your tasks for " + myArray[5][0] + " " + myArray[5][1]);
                        break;
                    case "saturday", "SATURDAY", "Saturday ", "Saturday":
                        System.out.println("Your tasks for " + myArray[6][0] + " " + myArray[6][1]);
                        break;
                    case "Exit":
                        break;
                    default:
                        System.out.println("Sorry, I don't understand you, please try again.");

                }
            }
        }
    }
}
