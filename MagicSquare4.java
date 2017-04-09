import java.util.Scanner;
public class MagicSquare4 {
	public static void main(String[] args){

		int[] row = new int[4];
		int[] col = new int[4];
		int k=0;
		int l = 0;
		boolean resultC = true;
		boolean resultR = true;
		boolean result = true;
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
					col[i] += Integer.parseInt(FourTimesFour[j][i]);
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
					result = false;
					break;
				}
			}
			
			if(result){
				str = "It's a Magic square!!:)";
			} else {
				str = "It's NOT a Magic square:(";
			}

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
			System.out.println("Result = " + result);
			System.out.println("-------------------------");
			System.out.println(str);
	}
}
