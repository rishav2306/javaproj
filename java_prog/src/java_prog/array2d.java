package java_prog;

public class array2d {

	public static void main(String[] args) {
		
//		int arr[][] = {
//				           {5,6,3,7},
//				           {2,9,0},
//				           {6,9,6,4,1}
//				           
//		              };
		
		int arr[][] = new int[3][];
		
		arr[0] = new int[5];
		arr[1] = new int[3];
		arr[2] = new int[4];
		
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[0][3] = 4;
		arr[0][4] = 5;
		arr[1][0] = 3;
		arr[1][1] = 4;
		arr[1][2] = 5;
		arr[2][0] = 5;
		arr[2][1] = 6;
		arr[2][2] = 7;
		arr[2][3] = 8;

		
		
		for(int n[]: arr) {
			for(int a : n) {
				System.out.print(a +"  ");
			}
			System.out.println();
		}
		
		
		
	}

}
