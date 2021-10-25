package ejercicio01problema;

import java.util.ArrayList;
import java.util.Scanner;

public class noFly {
public static void main(String[] args) {
	ArrayList<PelotaGorda> pelotas=new ArrayList<>();
	for (int i = 0; i < 10000000; i++) {
		pelotas.add(new PelotaGorda());
	}
	System.out.println("Pon algo");
	new Scanner(System.in).nextInt();
}
}
