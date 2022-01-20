package modulo;

public class Matriz {

	public static void main(String[] args) {
		// Matrices
		
		int array [] [] = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
	
		for (int i=0; i<array.length;i++) { //filas i
			for (int j=0; j<array[i].length;j++) { //columnas
				System.out.println(array [i][j]);
				
			}
		}
		
	}

}
