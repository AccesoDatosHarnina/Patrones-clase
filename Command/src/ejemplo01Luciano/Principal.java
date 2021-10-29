package ejemplo01Luciano;

/**
 * Created by Luciano on 11/12/2017.
 */
public class Principal {
    public static void main(String[] args)    {
    RemoteControl control = new RemoteControl();
    Horno horno = new Horno();
    Command celsiusOn = new PonerCelsiusCommand(horno);
    Command farenheitOn = new PonerFarenheitCommand(horno);
    //switch on
    control.setCommand(celsiusOn);
    control.pressButton();
    System.out.println(horno.temp);
    //switch off
    control.setCommand(farenheitOn);
    control.pressButton();
    System.out.println(horno.temp);


}

}
