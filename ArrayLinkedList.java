public class ArrayLinkedList {

    public static void main( String [] args) {

        //int [][] Arr = new int [3][3];
        int [][]  Arr= {{1,1,1,0,0,0},{0,1,0,0,0,0},{1,1,1,0,0,0},{0,9,2,-4,-4,0},{0,0,0,-2,0,0},{0,0,-1,-2,-4,0}};

        //int add =0;
        int sum=0;
        for (int i =0;i< 4 ;i++)
             for (int j=0; j< 4;j++) {
                  // add=add+Arr[i][j];
                    int L1= Arr[i][j]+Arr[i][j+1]+ Arr[i][j+2];
                    //int L2=Arr[i+1][j]+Arr[i+1][j+1]+ Arr[i+1][j+2];
                     int L2=Arr[i+1][j+1];
                    int L3=Arr[i+2][j]+Arr[i+2][j+1]+ Arr[i+2][j+2];
                    int add= L1+L2+L3;
                    if (add> sum)
                        sum=add;
                    System.out.println( "i:"+ i + "j:" + j+" add:" + add + " sum:" + sum);


             }
         System.out.println("highest glass hour:  " + sum);


    }
}
