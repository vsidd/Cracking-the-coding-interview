package ctc.arrays;

/**
 * Created by Siddarthan on 22-Jan-17.
 */
public class c8_ZeroMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,0,1},{1,1,1},{1,1,1}};
//        matrix = zeroMatrix(matrix);
        for(int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                System.out.print("   "+matrix[i][j]);
            }
            System.out.println("");
        }
    }

    public static void zeroMatrix(int[][] matrix){
        if(matrix == null)
            return;
        boolean columnZeroFlag = false;
        boolean rowZeroFlag = false;

        for(int i = 0; i < matrix.length && !rowZeroFlag; i++){
            if(matrix[i][0]==0){
                rowZeroFlag = true;
            }
        }

        for(int j = 0; j < matrix[0].length && !columnZeroFlag; j++){
            if(matrix[0][j]==0){
                columnZeroFlag = true;
            }
        }

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j]==0){
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

	/* for(int i = 0; i < matrix.length; i++){
		if(matrix[i][0]==0){
			for(int j = 1; j < matrix[0].length; j++){
				matrix[i][j] = 0;
			}
		}
	}

	for(int j = 0; j < matrix[0].length; j++){
		if(matrix[0][j]==0){
			for(int i = 0; i < matrix.length; i++){
				matrix[i][j] = 0;
			}
		}
	} */
        for(int i = 1; i < matrix.length; i++){
            for(int j = 1; j < matrix[0].length; j++){
                if(matrix[i][0] == 0 || matrix[0][j]==0){
                    matrix[i][j] = 0;
                }
            }
        }

        if(columnZeroFlag){
            for(int j = 0; j < matrix[0].length; j++){
                matrix[0][j] = 0;
            }
        }
        if(rowZeroFlag){
            for(int i = 0; i < matrix.length; i++){
                matrix[i][0] = 0;
            }
        }
    }
}
