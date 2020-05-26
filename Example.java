import java.util.*;
public class Example {
	public static void main(String[] args) {
		int[][] s=new int[10][4];
		Scanner input=new Scanner(System.in);
		for(int i=0; i<10; i++){	
			System.out.println("Input marks for student "+(i+1)+" ...");
			for(int j=0; j<4; j++){
				System.out.print("\tSub"+(j+1)+" : ");
				s[i][j]=input.nextInt();
			}
		}
    }
}