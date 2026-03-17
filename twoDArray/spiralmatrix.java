package twoDArray;

public class spiralmatrix {

    public static void printSpiral(int matrix[][]){
        int strRow=0;
        int strCol=0;
        int endRow=matrix.length-1;
        int endCol=matrix[0].length-1;


        while(strRow<=endRow && strCol<=endCol){
            //top
            for(int j=strCol;j<=endCol;j++){
                System.out.print(matrix[strRow][j]+" ");

            }
            //Right
            for(int i=strRow+1;i<=endRow;i++){
                System.out.print(matrix[i][endCol]+" ");
            }
            //Bottom
            for(int j=endCol-1;j>=strCol;j--){
                if(strRow==endRow){
                    break;
                }
                 System.out.print(matrix[endRow][j]+" ");

            }
            //Left
            for(int i=endRow-1;i>=strRow+1;i--){
                  if(strCol==endCol){
                    break;
                }
                System.out.print(matrix[i][strCol]+" ");
            }
            strRow++;
            strCol++;
            endCol--;
            endRow--;
        }
        System.out.println("");

    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};

        
        printSpiral(matrix);

    }
    
}
