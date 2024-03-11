package programers;

public class safePlace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		safePlace sp = new safePlace();
		int[][] board = {{1, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 1, 1, 0}, {0, 0, 0, 0, 0}};
		int cnt = board.length * board[0].length;
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				if(board[i][j] == 1) {
					cnt--;
					if(sp.isUpLeft(i, j)) {
						if(board[i-1][j-1] == 0) {
							board[i-1][j-1] = 2;
							cnt--;
						}
					}if(sp.isCenter(i)) {
						if(board[i-1][j] == 0) {
							board[i-1][j] = 2;
							cnt--;
						}
					}if(sp.isUpRight(i, j, board[i].length)) {
						if(board[i-1][j+1] == 0) {
							board[i-1][j+1] = 2;
							cnt--;
						}
					}if(sp.isLeft(j)) {
						if(board[i][j-1] == 0) {
							board[i][j-1] = 2;
							cnt--;
						}
					}if(sp.isRight(j, board[i].length)) {
						if(board[i][j+1] == 0) {
							board[i][j+1] = 2;
							cnt--;
						}
					}if(sp.isDownLeft(i,j,board.length)) {
						if(board[i+1][j-1] == 0) {
							board[i+1][j-1] = 2;
							cnt--;
						}
					}if(sp.isDownCenter(i, board.length)) {
						if(board[i+1][j] == 0) {
							board[i+1][j] = 2;
							cnt--;
						}
					}if(sp.isDownRight(i,j, board.length, board[i].length)) {
						if(board[i+1][j+1] == 0) {
							board[i+1][j+1] = 2;
							cnt--;
						}
					}
				}
			}
		}
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++)
				System.out.print(board[i][j] + " ");
			System.out.println();
		}
		System.out.println(cnt);
	}
	
	private boolean isUpLeft(int i, int j) {
		if((i-1) < 0 || (j-1) < 0)
			return false;
		else
			return true;
	}
	
	private boolean isCenter(int i) {
		if((i-1) < 0)
			return false;
		else
			return true;
	}
	
	private boolean isUpRight(int i, int j, int n) {
		if((i-1) < 0 || (j + 1) >= n)
			return false;
		else
			return true;
	}
	
	private boolean isLeft(int j) {
		if((j-1) < 0)
			return false;
		else
			return true;
	}
	
	private boolean isRight(int j, int n) {
		if((j+1) >= n)
			return false;
		else
			return true;
	}
	
	private boolean isDownLeft(int i, int j, int n) {
		if((i+1) >= n || (j-1) < 0)
			return false;
		else
			return true;
	}
	
	private boolean isDownCenter(int i, int n) {
		if((i+1) >= n)
			return false;
		else
			return true;
	}
	
	private boolean isDownRight(int i, int j, int n, int m) {
		if((i+1) >= n || (j + 1) >= m)
			return false;
		else
			return true;
	}
	
}
