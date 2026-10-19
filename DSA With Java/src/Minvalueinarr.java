import java.util.Scanner;

public class Minvalueinarr {
    static void main(){
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        int n = arr.length;
        for(int i =0;i<n;i++){
            System.out.println("Enter the value of index :" +i);
            arr[i] = sc.nextInt();
        }
        int minvalue = arr[0];
        for(int val:arr){
            if(minvalue>val){
                minvalue = val;
            }
        }
        System.out.println(minvalue);
    }
}
