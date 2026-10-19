import java.util.Scanner;

public class Arrays {
    static void main(){
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        int n = arr.length;
        for (int i =0;i<=n-1;i++){
            System.out.println("provide input: " +i);
            arr[i] = sc.nextInt();
        }
        for(int val:arr){
            System.out.println(val);
        }
    }
}
