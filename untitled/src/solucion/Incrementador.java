package solucion;

public class Incrementador extends Thread {

	private int value = 0;

	@Override
	public void run() {
		do {
			value++;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} while (value < 99);
		System.out.println("el incrementador ha terminado con valor "+value);
	}

	public int getValue() {
		return value;
	}

}
