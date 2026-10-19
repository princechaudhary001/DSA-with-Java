public class array2D {
    static void main(){
        int[][] arr;
        arr = new int[3][4];
        int[][] brr = {{1,2},{2,3,4,5},{3,4},{4,5,6,8,9}};
//        System.out.println(brr[3][0]);
        int rowLength = brr.length;
//        int colLength = brr[0].length;
    for(int rowIndex =0; rowIndex<=rowLength-1;rowIndex++){
        //jaise hi maine new  roww me aaya
        //isme point pr maine uss row ka collength find out krliya
        //current row -> brr[rowindex]
        //isme kitne columns -> brr[rowIndex].length
        int colLength = brr[rowIndex].length;
        for(int colIndex =0; colIndex <= colLength-1; colIndex++){
            System.out.println(brr[rowIndex][colIndex]);
        }
        System.out.println();
    }

    }

}
