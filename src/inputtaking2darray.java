import java.util.Scanner;

public class inputtaking2darray {
    static void main(){
        int arr[][] = new int[3][4];
        Scanner sc = new Scanner(System.in);
        //input
        for(int i =0;i<= arr.length-1;i++) {
            for (int j = 0; j <= arr.length - 1; j++) {
                System.out.println("provide value for row " + i + "and column" + j);
                arr[i][j] = sc.nextInt();
            }
        }
        //print
        for(int rowIndex =0;rowIndex<=arr.length-1;rowIndex++){
            for(int colIndex =0;colIndex<=arr[rowIndex].length-1;colIndex++){
                System.out.println(arr[rowIndex][colIndex] + " ");
            }
            System.out.println();
        }
    }
}
