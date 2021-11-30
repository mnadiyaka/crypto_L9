import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println(sign(sc.nextBigInteger(), sc.nextBigInteger(), sc.nextBigInteger()));
        System.out.println(unsign(sc.nextBigInteger(), sc.nextBigInteger(), sc.nextBigInteger()));
    }

    public static BigInteger sign (BigInteger m, BigInteger d, BigInteger n){
        return m.modPow(d,n);
    }

    public static BigInteger unsign (BigInteger s, BigInteger e, BigInteger n){
        return s.modPow(e,n);
    }
}
