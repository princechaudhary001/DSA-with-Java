import java.math.BigInteger;
import java.util.Scanner;

public class TakingInput {
    static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for first num");
        int firstNum = sc.nextInt();
        System.out.println("Enter the value for second num");
        int secondNum = sc.nextInt();
        int ans = firstNum + secondNum;
        System.out.println("Answer is :" + ans);

        BigInteger bg = sc.nextBigInteger();
        System.out.println("Answer is:" + bg);

        System.out.println("Enter the value for flag");
        boolean flag = sc.nextBoolean();

        System.out.println("Enter the value for shortval");
        short shortval = sc.nextShort();
        System.out.println("Enter the value for floatvalue");
        float floatvalue = sc.nextFloat();

        System.out.println("Flag is" + flag);
        System.out.println("shortval is :" + shortval);
        System.out.println("floatvalue is :" + floatvalue);
        sc.close();
    }
}
