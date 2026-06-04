public class SparseMatrices {
    
    public static void tripletRepresentation(int[][] matrix, int row, int col){
        
        
    }

    public static void main(String[] args) {
        final int row = 5;
        final int col = 5;

        int[][] matrix  = {
                {0, 0, 1, 0, 0},
                {0, 9, 0, 0, 1},
                {2, 0, 0, 1, 0},
                {4, 0, 5, 0, 0},
                {0, 3, 0, 0, 7},

        };

        int values = 0;

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(matrix[i][j] != 0)
                    values++;
            }
        }
        final int tcol = 3;
        final int trow = values + 1;

        int[][] tRep = new int[trow][tcol];
        tRep[0][0] = row;
        tRep[0][1] = col;
        tRep[0][2] = values;

        int srows = 1;

        for(int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                if(matrix[i][j] != 0){
                    tRep[srows][0] = i;
                    tRep[srows][1] = j;
                    tRep[srows][2] = matrix[i][j];
                    srows++;

                }
            }
        }

        for (int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("---------------------------------");

        for (int i = 0; i < trow; i++){
            for(int j = 0; j < tcol; j++){
                System.out.print(tRep[i][j] + " ");
            }
            System.out.println();
        }

        

     
    }
}
