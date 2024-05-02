
public class Main
{
    public static void encryption(char[][] endCharMatrix, String message, int[] key, int noRow, int noCol) {
        String plaintext = message.replaceAll("\\s", "");
        
        char[][] matrix = new char[noRow][noCol];
        
        
        System.out.println("Row-Column Tranpostion Technique");
        int index = 0;
        
        for (int i = 0; i < noRow; i++) {
            for (int j = 0; j < noCol; j++) {
                if (index < plaintext.length()) {
                    matrix[i][j] = plaintext.charAt(index);
                    index++;
                } else {
                    matrix[i][j] = endCharMatrix[i][j];
                }
            }
        }
        
        // printing the matrix
        for (int i = 0; i < noRow; i++) {
            for (int j = 0; j < noCol; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        // printing according to the key
        System.out.print("Encrypted message: " );
        for (int k : key) {
            StringBuilder column = new StringBuilder();
            for (char[] row : matrix) {
                column.append(row[k - 1]);
            }
            System.out.print(column.toString());
        }
    }
    
	public static void main(String[] args) {
	    String message = "Kill corona virus at twelve am tommorrow";
	    int[] key = {4, 3, 1, 5 ,6, 7};
	    char[][] endCharMatrix = {
	        {'y', 'z','x', 'w', 'v', 'u', 't'},
	        {'s', 'r', 'q', 'p', 'o', 'n', 'm'},
	        {'l', 'k', 'j', 'i', 'h', 'g', 'f'},
	        {'e', 'd', 'c', 'b', 'a', '9', '8'},
	        {'7', '6', '5', '4', '3', '2', '1'}
	    };
	    
	    int noRow = 5;
	    int noCol = 7;
	    
	    
	    encryption(endCharMatrix, message, key, noRow, noCol);
	    
	    
	    
	}
}
