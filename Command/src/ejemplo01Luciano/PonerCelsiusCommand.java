package ejemplo01Luciano;

//Concrete Command
public class PonerCelsiusCommand implements Command{
//reference to the light
Horno horno;
public  PonerCelsiusCommand(Horno horno){
  this.horno = horno;
}
public void execute(){
	  horno.PonerCelsius();
}
}