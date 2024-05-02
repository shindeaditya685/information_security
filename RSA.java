class Main {
    public static void main (String[] args) {
        int e, d = 0;
        int p = 3;
        int q = 11;
        int originalMessage = 2;
        
        int n = p * q;
        System.out.println("The value of n = " + n);
        
        int z = (p - 1) * (q - 1);
        System.out.println("The value of z = " + z);
        
        // calaculating e value
        for (e = 2; e < z; e++) {
            if (gcd(e, z) == 1) {
                break;
            }
        }
        
        // calcualting d value
        for (int i = 0; i <= 9; i++) {
            int x = 1 + (i * z);
            
            if (x % e == 0) {
                d = x / e;
                break;
            }
        }
        System.out.println("The value of d = " + d);
        
        // encrypted message
        
        double c = (Math.pow(originalMessage, e)) % n;
        System.out.println("Encrypted message: " + c);
        
        // decrpted message
        
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
}
