package objectsmothers;

import java.util.Random;
public class AdnOM {
	public static String getNuevoAdn(String oldADN) {
		
		StringBuilder nueva=new StringBuilder(oldADN);
		nueva.append("-");
		int cadena=2;
		for (int i = 0; i < cadena; i++) {
			nueva.append(generateRandomCharacter());
		}
		return nueva.toString();
	}
	private static char generateRandomCharacter() {
		byte primera='A',ultima='Z'+1;
		return (char) (new Random().nextInt((ultima-primera)+1)+primera);
	}
	
}
