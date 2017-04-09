import java.util.Scanner;
public class MagicSquare3 {
	public static void main(String[] args){
		
		int[] row = new int[4];
		int[] col = new int[4];
		int k =0;
		
		String[][] FourTimesFour;
		FourTimesFour = new String[][]{
			{"1","2","3","4"},
			{"1","1","1","1"},
			{"1","1","1","1"},
			{"1","1","1","1"}
		};
		
		for(int i = 0; i < FourTimesFour.length ; i++){
			for(int j = 0; j < FourTimesFour.length ; j++){
				row[i] += Integer.parseInt(FourTimesFour[i][j]);
				col[i] += Integer.parseInt(FourTimesFour[j][i]);
			}
		}
		System.out.println("\t\t\t\t\t"+row[0]);
		System.out.println("\t\t\t\t\t"+row[1]);
		System.out.println("\t\t\t\t\t"+row[2]);
		System.out.println("\t\t\t\t\t"+row[3]);

		System.out.print(col[0] +" ");
		System.out.print(col[1]+" ");
		System.out.print(col[2]+" ");
		System.out.print(col[3]);
	}

}
