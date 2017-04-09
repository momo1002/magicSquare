import java.util.Scanner;
public class MagicSquare1 {
	public static void main(String[] args){
		int[][] ar;
		ar = new int[4][4];
		
		Scanner scan = new Scanner(System.in);
		ar[0][0] = scan.nextInt();
		ar[0][1] = scan.nextInt();
		ar[0][2] = scan.nextInt();
		ar[0][3] = scan.nextInt();
		ar[1][0] = scan.nextInt();
		ar[1][1] = scan.nextInt();
		ar[1][2] = scan.nextInt();
		ar[1][3] = scan.nextInt();
		ar[2][0] = scan.nextInt();
		ar[2][1] = scan.nextInt();
		ar[2][2] = scan.nextInt();
		ar[2][3] = scan.nextInt();
		ar[3][0] = scan.nextInt();
		ar[3][1] = scan.nextInt();
		ar[3][2] = scan.nextInt();
		ar[3][3] = scan.nextInt();
		

		int row1 = ar[0][0]+ar[0][1]+ar[0][2]+ar[0][3];
		int row2 = ar[1][0]+ar[1][1]+ar[1][2]+ar[1][3];
		int row3 = ar[2][0]+ar[2][1]+ar[2][2]+ar[2][3];
		int row4 = ar[3][0]+ar[3][1]+ar[3][2]+ar[3][3];
		if(row1 == row2 &&  row2 == row3 && row3 == row4 && row4 == row1)
			System.out.println("Every rows are the same.\n");
		else
			System.out.println("Every rows aren't the same.\n");

		int col1 = ar[0][0]+ar[1][0]+ar[2][0]+ar[3][0];
		int col2 = ar[0][1]+ar[1][1]+ar[2][1]+ar[3][1];
		int col3 = ar[0][2]+ar[1][2]+ar[2][2]+ar[3][2];
		int col4 = ar[0][3]+ar[1][3]+ar[2][3]+ar[3][3];
		
		if(col1 == col2 &&  col2 == col3 && col3 == col4 && col4 == col1)
			System.out.println("Every cols are the same.\n");
		else
			System.out.println("Every cols aren't the same.\n");
		
		int rowSum = row1 + row2 + row3 + row4;
		int colSum = col1 + col2 + col3 + col4;
		if(rowSum == colSum)
			System.out.println("IT'S A MAGIC SQUARE.\n");
		else
			System.out.println("It's not a magic squrea.\n");
	}
}
