import java.util.Scanner;
public class MagicSquare2 {
	public static void main(String[] args){
		int[] row = new int[4];
		int[] col = new int[4];
		int k =0;
		int[][] FourTimesFour;
		FourTimesFour = new int[][]{
			{1,2,3,4},
			{1,1,1,1},
			{1,1,1,1},
			{1,1,1,1}
		};
		
		for(int i = 0; i < FourTimesFour.length ; i++){
			for(int j = 0; j < FourTimesFour.length ; j++){
				row[i] += FourTimesFour[i][j];
				col[i] += FourTimesFour[j][i];
			}
		}
		System.out.println("\t\t\t\t"+row[0]);
		System.out.println("\t\t\t\t"+row[1]);
		System.out.println("\t\t\t\t"+row[2]);
		System.out.println("\t\t\t\t"+row[3]);

		System.out.print(col[0] +"\t");
		System.out.print(col[1]+"\t");
		System.out.print(col[2]+"\t");
		System.out.print(col[3]);
	}
}
