package Starting;

import java.util.Scanner;

public class Arraysum {
    static void main(){
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        int n = arr.length;
        for(int i =0;i<n;i++){
            System.out.println("Enter the values for index :" +i);
            arr[i] = sc.nextInt();
        }
        int ans =0;
        for(int val : arr) {
            ans += val;
        }
            System.out.println(ans);


    }
}
