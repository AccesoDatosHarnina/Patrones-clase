package ejemplo01;

public class FacadeImpresora {
	public void imprimirDocumentoNormal(String texto) {
		new ImpresoraNormal(texto);
	}
}
