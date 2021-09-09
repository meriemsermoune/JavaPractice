package SwitchStatement;

import java.util.Scanner;

public class nestedSwitch {
    public static void main(String[]args){
        /* you are making call to company, there are 3 departments.
        it department/ hr dep/ representative
        in the IT dep :Raj,Alex,Jessi
        in the HR : Ana, Tima,
        in the representetive: Jeremiah,John, david
        -ask user which dep they want to talk to
        - after they chose the dep ask them who do they want to talk to

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Which department you want to talk with? 1-IT  2-HR   3-REP");
        int departmentNumber = scanner.nextInt();
        switch (departmentNumber) {
            case 1: // It department
                scanner = new Scanner(System.in);
                System.out.println("Who do you want to talk with? Raj, Alex, Jessi");
                String name = scanner.nextLine().toLowerCase();
                switch (name.toLowerCase()) {
                    case "raj":
                        
                        System.out.println("Transferring to Raj");
                        break;
                    case "alex":
                        System.out.println("Transferring to Alex");
                        break;
                    case "jessi":
                        System.out.println("Transferring to Jessi");
                        break;
                    default:
                        System.out.println("Invalid selection");
                        break;
                }
                break;
            case 2:scanner = new Scanner(System.in);
                System.out.println("Who do you want to talk with? Ana, Tima");
                String hrName = scanner.nextLine().toLowerCase();
                switch (hrName) {
                    case "ana":
                        System.out.println("Transferring to Ana");
                        break;
                    case "tima":
                        System.out.println("Transferring to Tima");
                        break;
                    default:
                        System.out.println("Invalid selection");
                        break;
                }
                break;
            case 3:scanner = new Scanner(System.in);
                System.out.println("Who do you want to talk with? Jeremiah, John, David");
                String repName = scanner.nextLine().toUpperCase();
                switch (repName) {
                    case "JEREMIAH":
                        System.out.println("Transferring to Jeremiah");
                        break;
                    case "JOHN":
                        System.out.println("Transferring to John");
                        break;
                    case "DAVID":
                        System.out.println("Transferring to David");
                        break;
                    default:
                        System.out.println("Invalid selection");
                        break;
                }
                break;
            default:
                System.out.println("Invalid selection for Department");
                break;
        }













    }
}
