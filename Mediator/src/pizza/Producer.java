package pizza;


/**
 * Created by Luciano on 17/12/2017.
 */
class Producer implements Runnable {
    // 2. Los productores están acoplados solo al Mediador
    private Mediator med;
    private int id;
    private static int num = 1;

    public Producer(Mediator m) {
        med = m;
        id = num++;
    }

    @Override
    public void run() {
        int num;
        while (true) {
            med.almacenPizza(num = (int)(Math.random()*100));
            System.out.print( "p" + id + "-" + num + "  " );
        }
    }
}
