package pizza;

/**
 * Created by Luciano on 17/12/2017.
 */
// 1. The "intermediary"
public class Mediator {
    // 4 El mediador arbitra
    private boolean pizzasFull = false;
    private int number;

    public synchronized void almacenPizza(int num) {
        // no hay espacio para otra pizza
        while (pizzasFull == true) {
            try {
                wait();
            }
            catch (InterruptedException e ) {
                Thread.currentThread().interrupt();
            }
        }
        pizzasFull = true;
        number = num;
        notifyAll();
    }
    public synchronized int recuperarPizza() {
        // no message to retrieve
        while (pizzasFull == false) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        pizzasFull = false;
        notifyAll();
        return number;
    }
}
