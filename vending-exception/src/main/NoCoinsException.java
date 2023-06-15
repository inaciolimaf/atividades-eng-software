package main;

/**
 * Classe de Exce��o para o Dispenser indicar quando nenhuma moeda foi inserida
 * na m�quina e uma venda foi solicitada.
 */
public class NoCoinsException extends RuntimeException {

	/**
	 * Construct this exception object.
	 */
	public NoCoinsException() {
		super();
	}

	/**
	 * Construct this exception object.
	 * 
	 * @param message
	 *            the error message.
	 */
	public NoCoinsException(String message) {
		super(message);
	}
}
