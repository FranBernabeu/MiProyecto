
public class ASumar {

	private String valor_inicial;

	/**
	 * Pasamos el valor
	 */
	public ASumar(String string) {
		this.valor_inicial = string;
	}

/**
 * Metodo que muestra si el numero es de una cifra, negativo o lo devuelve formando ej. 3 + 4 + 3 + 3 = 13
 * @return
 */
	public String mostrar() {
		String numero = valor_inicial;
		if (numero.length() == 1) {
			return (numero + " = " + numero);
		} else if (numero.length() == 2 && numero.substring(0, 1).equals("-")) {
			return ("Es un número negativo");
		} else {
			String suma = "";
			for (int i = 0; i < valor_inicial.length(); i++) {
				String digito = valor_inicial.substring(i, i + 1);

				if (i == 0) {
					suma = suma + digito;
				} else {
					suma = suma + " + " + digito;
				}
			}

			return (suma + " = " + total());
		}
	}
	/**
	 * Metodo que devuelve la suma de los digitos del numero
	 * @return
	 */

	public int total() {
		int suma = 0;

		for (int i = 0; i < valor_inicial.length(); i++) {
			// Cadena de un dígito.
			String digito = valor_inicial.substring(i, i + 1);
			suma = suma + Integer.parseInt(digito);
		}
		return suma;

	}

}
        


