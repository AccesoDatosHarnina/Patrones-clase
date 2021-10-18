package ejemplo01;

/**

 */
public class PrincipalCliente {
	public static void main(String[] args) {

		FacadeImpresora facadeImpresora = new FacadeImpresora();
		facadeImpresora.imprimirDocumentoNormal("texto");

		Impresora i2 = new Impresora();

		i2.setHoja("a4");

		i2.setColor(true);

		i2.setTipoDocumento("pdf");

		i2.setTexto("texto 2");

		i2.imprimirDocumento();

		Impresora i3 = new Impresora();

		i3.setHoja("a3");

		i3.setColor(false);

		i3.setTipoDocumento("excel");

		i3.setTexto("texto 3");

		i3.imprimirDocumento();

	}
}
