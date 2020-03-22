import java.util.Scanner;



public class Main {
	
	static Scanner s = new Scanner(System.in);
	
	
public static void spiralPrint(int matrix[][]){
        
        int row = matrix.length;
        int col = matrix[0].length;
        
        int num = 0;
        int cs = 0;
        int rs = 0;
        int ce = col-1;
        int re = row-1;
        
        while(num != row*col)
        {
            for(int i = cs; i<=ce; i++)
            {
                System.out.print(matrix[rs][i] + " ");
                num++;
            }
            rs++;
            
            if(num != row*col)
            {
            for(int j = rs; j<=re; j++)
            {
                System.out.print(matrix[j][ce] + " ");
                num++;
            }
            }
            ce--;
            if(num != row*col)
            {
            for(int k = ce; k>=cs; k--)
            {
                System.out.print(matrix[re][k] + " ");
                    num++;
            }
            re--;
            }
            if(num != row*col)
            {
            for(int l = re; l >= rs; l--)
            {
                System.out.print(matrix[l][cs] + " ");
                num++;
            }
            cs++;
            }
        }
        
	}
	
	public static int[][] takeInput2D(){
		int numRows = s.nextInt();
		int numCols = s.nextInt();
		int[][] input = new int[numRows][numCols];
		for(int i = 0; i < numRows; i++){
			for(int j = 0; j < numCols; j++){
				input[i][j] = s.nextInt();
			}
		}
		return input;
	}
	
	public static void main(String[] args) {
		int a[][] = takeInput2D();
		spiralPrint(a);
	}
}