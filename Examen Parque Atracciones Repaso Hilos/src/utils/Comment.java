package utils;

public class Comment {
	private static boolean on=true;
	public static void talk(Object comment) {
		if(on) {
			System.err.println(comment);
		}
	}
	
}
