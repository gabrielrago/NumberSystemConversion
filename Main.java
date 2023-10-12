import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Functions functions = new Functions();

        System.out.println("\nNumber Conversion Systems \n");

        while (true) {
            System.out.println("Choose conversion type:");
            System.out.println("\t1. Binary to Decimal");
            System.out.println("\t2. Binary to Hexadecimal");
            System.out.println("\t3. Binary to Octal");
            System.out.println("\t4. Decimal to Binary");
            System.out.println("\t5. Decimal to Hexadecimal");
            System.out.println("\t6. Decimal to Octal");
            System.out.println("\t7. Hexadecimal to Binary");
            System.out.println("\t8. Hexadecimal to Decimal");
            System.out.println("\t9. Hexadecimal to Octal");
            System.out.println("\t10. Octal to Binary");
            System.out.println("\t11. Octal to Decimal");
            System.out.println("\t12. Octal to Hexadecimal\n");

            System.out.print("Choose number system to convert: ");
            int choice = input.nextInt();

            input.nextLine();  

            System.out.print("Input the value you want to convert: ");
            String inputNumber = input.nextLine();

            // Validation message and terminates if the input is invalid
            String errorMessage = validateInput(choice, inputNumber);
            if (errorMessage != null) {
                System.out.println("Invalid input: " + errorMessage);
                System.out.println("Program Terminated");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.printf("Binary to Decimal (%s) = %d%n", inputNumber, functions.binaryToDecimal(inputNumber));
                    break;
                case 2:
                    System.out.printf("Binary to Hexadecimal (%s) = %s%n", inputNumber, functions.binaryToHexadecimal(inputNumber));
                    break;
                case 3:
                    System.out.printf("Binary to Octal (%s) = %s%n", inputNumber, functions.binaryToOctal(inputNumber));
                    break;
                case 4:
                    System.out.printf("Decimal to Binary (%s) = %s%n", inputNumber, functions.decimalToBinary(Integer.parseInt(inputNumber)));
                    break;
                case 5:
                    System.out.printf("Decimal to Hexadecimal (%s) = %s%n", inputNumber, functions.decimalToHexadecimal(Integer.parseInt(inputNumber)));
                    break;
                case 6:
                    System.out.printf("Decimal to Octal (%s) = %s%n", inputNumber, functions.decimalToOctal(Integer.parseInt(inputNumber)));
                    break;
                case 7:
                    System.out.printf("Hexadecimal to Binary (%s) = %s%n", inputNumber, functions.hexadecimalToBinary(inputNumber));
                    break;
                case 8:
                    System.out.printf("Hexadecimal to Decimal (%s) = %d%n", inputNumber, functions.hexadecimalToDecimal(inputNumber));
                    break;
                case 9:
                    System.out.printf("Hexadecimal to Octal (%s) = %s%n", inputNumber, functions.hexadecimalToOctal(inputNumber));
                    break;
                case 10:
                    System.out.printf("Octal to Binary (%s) = %s%n", inputNumber, functions.octalToBinary(inputNumber));
                    break;
                case 11:
                    System.out.printf("Octal to Decimal (%s) = %d%n", inputNumber, functions.octalToDecimal(inputNumber));
                    break;
                case 12:
                    System.out.printf("Octal to Hexadecimal (%s) = %s%n", inputNumber, functions.octalToHexadecimal(inputNumber));
                    break;
                default:
                    System.out.println("Please choose between 1-12");
                    break;
            }

            System.out.print("Convert more? (yes/no): ");
            String continueChoice = input.nextLine().toLowerCase();

            if (choice == 0 || !continueChoice.equals("yes")) {
                System.out.println("Program Terminated");
                break;
            }
        }
    }

    // Validations for invalid inputs
    private static String validateInput(int choice, String inputNumber) {
        Functions functions = new Functions();

        switch (choice) {
            case 1:
            case 2:
            case 3:
                return functions.isValidBinary(inputNumber) ? null : "Please input a valid binary number.";
            case 4:
            case 5:
            case 6:
                return functions.isValidDecimal(inputNumber) ? null : "Please input a valid decimal number.";
            case 7:
            case 8:
            case 9:
                return functions.isValidHexadecimal(inputNumber) ? null : "Please input a valid hexadecimal number.";
            case 10:
            case 11:
            case 12:
                return functions.isValidOctal(inputNumber) ? null : "Please input a valid octal number.";
            default:
                return "Invalid choice. Please choose between 1-12.";
        }
    }
}
