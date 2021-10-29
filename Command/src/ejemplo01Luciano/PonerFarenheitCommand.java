package ejemplo01Luciano;

//Concrete Command
public class PonerFarenheitCommand implements Command{
  //reference to the light
  Horno horno;
  public PonerFarenheitCommand(Horno horno){
    this.horno = horno;
  }
  public void execute(){
	  horno.PonerFarenheit();
  }
}