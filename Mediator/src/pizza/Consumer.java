package pizza;


/**
 * Created by Luciano on 17/12/2017.
 */
class Consumer implements Runnable {
    // 3. Consumers are coupled only to the Mediator
    private Mediator med;
    private int    id;
    private static int num = 1;

    public Consumer(Mediator m) {
        med = m;
        id = num++;
    }

    @Override
    public void run() {
        while (true) {
            System.out.print("consumidor" + id + "-" + med.recuperarPizza() + "  ");
        }
    }
}
