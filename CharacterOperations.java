package information_security._01_string_xor_and;

public class CharacterOperations {
    public static void main(String[] args) {
        char[] charArray = {'\\', 'H', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'};

        System.out.println("Original string: ");
        for (char c : charArray) {
            System.out.print(c);
        }
        System.out.println();

        System.out.println("AND operation with 127: ");
        for (char c : charArray) {
            int result = 127 & c;
            System.out.print((char) result);
        }
        System.out.println();

        System.out.println("XOR operation with 127: ");
        for (char c : charArray) {
            int result = 127 ^ c;
            System.out.print((char) result);
        }
        System.out.println();
    }
}
