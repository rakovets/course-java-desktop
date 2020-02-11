package sample.model;

public class HandingService {
	private static boolean isX;
	private static int lastPosition;
	private static int[] canvas;

	private HandingService() {
	}

	public static String getChar(int position) throws Exception {
		boolean player = isX;
		lastPosition = position;
		if (canvas[lastPosition] != 0) {
			throw new Exception();
		}
		canvas[lastPosition] = isX ? 1 : 2;
		isX = !isX;
		return player ? "X" : "O";
	}

	public static boolean hasWinner() {
		int row = lastPosition - lastPosition % 3;
		if (canvas[row] == canvas[row + 1] &&
				canvas[row] == canvas[row + 2]) return true;

		int column = lastPosition % 3;
		if (canvas[column] == canvas[column + 3])
			if (canvas[column] == canvas[column + 6]) return true;
		if (lastPosition % 2 != 0) return false;


		if (lastPosition % 4 == 0) {
			if (canvas[0] == canvas[4] &&
					canvas[0] == canvas[8]) return true;
			if (lastPosition != 4) return false;
		}
		return canvas[2] == canvas[4] &&
				canvas[2] == canvas[6];
	}

	public static boolean isGameEnded() {
		for (int n : canvas) if (n == 0) return false;
		return true;
	}

	public static void initialize() {
		isX = true;
		lastPosition = 0;
		canvas = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
	}
}
