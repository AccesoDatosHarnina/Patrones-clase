package ejercicio01Solucion;

import java.util.ArrayList;
import java.util.Scanner;

public class flyng {
public static void main(String[] args) {
	ArrayList<PelotaConcreta> pelotas=new ArrayList<>();
	PelotaFlyweight pelotaFlyweight=new PelotaFlyweight();
	for (int i = 0; i < 10000000; i++) {
		pelotas.add(new PelotaConcreta(pelotaFlyweight));
	}
	System.out.println("Pon algo");
	new Scanner(System.in).nextInt();
}
}
