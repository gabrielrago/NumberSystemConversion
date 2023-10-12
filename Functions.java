public class Functions {

    public int binaryToDecimal(String binaryInput) {
        if (isValidBinary(binaryInput)) {
            return Integer.parseInt(binaryInput, 2);
        } else {
            throw new IllegalArgumentException("Invalid binary input");
        }
    }

    public String binaryToHexadecimal(String binaryInput) {
        int decimalResult = binaryToDecimal(binaryInput);
        return Integer.toHexString(decimalResult).toUpperCase();
    }

    public String binaryToOctal(String binaryInput) {
        int decimalResult = binaryToDecimal(binaryInput);
        return Integer.toOctalString(decimalResult);
    }

    public String decimalToBinary(int decimalInput) {
        return Integer.toBinaryString(decimalInput);
    }

    public String decimalToHexadecimal(int decimalInput) {
        return Integer.toHexString(decimalInput).toUpperCase();
    }

    public String decimalToOctal(int decimalInput) {
        return Integer.toOctalString(decimalInput);
    }

    public int hexadecimalToDecimal(String hexInput) {
        if (isValidHexadecimal(hexInput)) {
            return Integer.parseInt(hexInput, 16);
        } else {
            throw new IllegalArgumentException("Invalid hexadecimal input");
        }
    }

    public String hexadecimalToBinary(String hexInput) {
        int decimalResult = hexadecimalToDecimal(hexInput);
        return Integer.toBinaryString(decimalResult);
    }

    public String hexadecimalToOctal(String hexInput) {
        int decimalResult = hexadecimalToDecimal(hexInput);
        return Integer.toOctalString(decimalResult);
    }

    public int octalToDecimal(String octalInput) {
        if (isValidOctal(octalInput)) {
            return Integer.parseInt(octalInput, 8);
        } else {
            throw new IllegalArgumentException("Invalid octal input");
        }
    }

    public String octalToBinary(String octalInput) {
        int decimalResult = octalToDecimal(octalInput);
        return Integer.toBinaryString(decimalResult);
    }

    public String octalToHexadecimal(String octalInput) {
        int decimalResult = octalToDecimal(octalInput);
        return Integer.toHexString(decimalResult).toUpperCase();
    }

    boolean isValidBinary(String input) {
        return input.matches("[01]+");
    }

    boolean isValidDecimal(String input) {
        return input.matches("\\d+");
    }

    boolean isValidHexadecimal(String input) {
        return input.matches("[0-9A-Fa-f]+");
    }

    boolean isValidOctal(String input) {
        return input.matches("[0-7]+");
    }
}
