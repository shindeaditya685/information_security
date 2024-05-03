import java.util.*;

public class Main {
    public static void main (String[] args) {
        int e, d = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter P: ");
        int p = sc.nextInt();
        
        System.out.println("Enter Q: ");
        int q = sc.nextInt();
        
        
        if (!(isPrime(p) && isPrime(q))) {
            System.out.println("Please enter valid prime numbers.");
            return;
        }
        
        System.out.println("Enter Message: ");
        int originalMessage = sc.nextInt();
        
        int n = p * q;
        System.out.println("n = " + n);
        
        int z = (p - 1) * (q - 1);
        System.out.println("z = " + z);
        
        for (e = 2; e < z; e++) {
            if (gcd(e, z) == 1) {
                break;
            }
        }
        System.out.println("e = " + e);
        
        for (int i = 0; i <= 9; i++) {
            int x = 1 + (i * z);
            
            if (x % e == 0) {
                d = x / e;
                break;
            }
        }
        System.out.println("d = " + d);
        
        System.out.println("Encryption process: ");
        double c = (Math.pow(originalMessage, e)) % n;
        System.out.println("Encrypted message: " + c);
        
        System.out.println("Decryption process: ");
        double m = (Math.pow(c, d)) % n;
        System.out.println("Decrypted message: " + m);
    }
    
    static int gcd(int e, int z) {
        if (e == 0) {
            return z;
        } else {
            return gcd(z % e, e);
        }
    }
    
    
    static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        } 
        
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        
        return true;
    }
} 
