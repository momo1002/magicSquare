import java.util.Scanner;
public class MagicSquares {
	public static void main(String[] args){

		int[] row = new int[4];
		int[] col = new int[4];
		int k=0;
		int l = 0;
		boolean resultC = true; // col
		boolean resultR = true; // row
		boolean resultB = true; // both
		String str;

		Scanner scan = new Scanner(System.in);
		String input1 = scan.nextLine();
		String input2 = scan.nextLine();
		String input3 = scan.nextLine();
		String input4 = scan.nextLine();
		String[][] FourTimesFour = new String[][]{
			input1.split(" "),
			input2.split(" "),
			input3.split(" "),
			input4.split(" ")};


			for(int i = 0; i < FourTimesFour.length ; i++){
				for(int j = 0; j < FourTimesFour.length ; j++){
					row[i] += Integer.parseInt(FourTimesFour[i][j]);
					col[j] += Integer.parseInt(FourTimesFour[j][i]);
				}
			}

			for(k = 0 ; k < FourTimesFour.length -1; k++){
				l = k+1;
				if(row[k] != row[l]){
					resultR = false;
					break;
				}
			}
			for(k = 0 ; k < FourTimesFour.length -1; k++){
				l = k+1;
				if(col[k] != col[l]){
					resultC = false;
					break;
				}
			}
			
			for(k = 0 ; k < FourTimesFour.length -1; k++){
				l = k+1;
				if(row[k] != col[l]){
					resultB = false;
					break;
				}
			}
			if(resultR == true && resultC == true && resultB == true){
				str = "magic";
			} else {
				str = "not magic";
			}

			System.out.println(str);
			
			System.out.println("-------------------------");
			System.out.println("Explanation for Output.");


			System.out.println("\t\t"+row[0]);
			System.out.println("\t\t"+row[1]);
			System.out.println("\t\t"+row[2]);
			System.out.println("\t\t"+row[3]);

			System.out.print(col[0] +" ");
			System.out.print(col[1] +" ");
			System.out.print(col[2] +" ");
			System.out.println(col[3] +" ");
			
			System.out.println("Result row =" + resultR);
			System.out.println("Result col = " + resultC);
			System.out.println("Result = " + resultB);
	}
}
