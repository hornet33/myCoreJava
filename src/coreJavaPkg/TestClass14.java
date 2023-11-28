//Core Java program to multiply two matrices
//Ex. Input matrixA[][] = {{1,2},{2,3}} and matrixB[][] = {{10,20},{30,40}}
//Ex. Output[][] = {{70,100},{110,160}}

package coreJavaPkg;

public class TestClass14 {
	
	static void multiplyMatrices(int[][] matrixA, int[][] matrixB) {
		//Get the number of rows and columns from input matrices
		int outMatrixRows = matrixA.length;
		int outMatrixCols = matrixB[0].length;

		//Check if number of rows of matrixA is equal to number of columns in matrixB - prerequisite to perform matrix multiplication
		if(outMatrixRows != outMatrixCols) {
			System.out.println("Cannot multiply given matrices: " +
					"Number of rows in Matrix A (" + outMatrixRows + ") are NOT EQUAL to number of columns in Matrix B (" + outMatrixCols + ")");
		}

		else {//Continue with the matrix multiplication			
			int[][] output = new int[outMatrixRows][outMatrixCols];

			//Row index
			for(int i=0;i<outMatrixRows;i++) {
				//Column index
				for(int j=0;j<outMatrixCols;j++) {
					//Instantiate output matrix[i][j] to zero since it needs to be added to the individual matrix product in the inner loop
					output[i][j] = 0;
					//Row,Column index
					for(int k=0;k<matrixB.length;k++) {
						output[i][j] += (matrixA[i][k] * matrixB[k][j]);
					}
				}
			}

			//Printing the output matrix
            for (int[] ints : output) {
                System.out.print("{");
                for (int j = 0; j < ints.length; j++) {
                    System.out.print(ints[j]);
                    if (j + 1 < ints.length) {
                        System.out.print(", ");
                    } else {
                        System.out.print("}");
                    }
                }
                System.out.println();
            }
		}
	}
	
	public static void main(String[] args) {

		//Test1: 2x2 X 2x2 matrix
		int[][] matrixA1 = {{1,2},{2,3}};
		int[][] matrixB1 = {{10,20},{30,40}};
		multiplyMatrices(matrixA1,matrixB1);
		System.out.println("-----");
		
		//Test2: 3x4 X 4x3 matrix
		int[][] matrixA2 = {{2,3,4,5},
							{3,4,5,6}, 
							{4,5,6,7} }; 
		int[][] matrixB2 = {{1,2,3},
							{4,5,6}, 
							{7,8,9}, 
							{10,11,12} };
		multiplyMatrices(matrixA2,matrixB2);
		System.out.println("-----");
		
		//Test3: 2x3 X 2x2 matrix
		int[][] matrixA3 = {{1,2,3},
							{2,3,4},
							{3,4,5}};
		int[][] matrixB3 = {{1,2},
							{2,3}};
		multiplyMatrices(matrixA3,matrixB3);
		System.out.println("-----");		
	}		
}
