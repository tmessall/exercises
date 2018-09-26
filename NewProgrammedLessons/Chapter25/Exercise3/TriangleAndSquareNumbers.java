public class TriangleAndSquareNumbers{
	public static void main(String[] args){

		for (int x = 0; x < 1226; x++){
			boolean triangleNum = false;
			boolean squareNum = false;
			for (int sq = 0; sq * sq <= x; sq++){
				if (sq * sq == x){
					squareNum = true;
				}
			}
			int sum = 0;
			for (int i = 0; i <= x; i++){
				sum = sum + i;
				if (sum == x){
					triangleNum = true;
					i = x;
				}
			}
			if ((triangleNum && squareNum) && (x != 0)){
				System.out.println(x + " is a square number and a triangular number.");
			}
		}
	}
}