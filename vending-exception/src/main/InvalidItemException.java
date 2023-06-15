package main;

/**
 * Classe de Exce��o para o Dispenser indicar quando um item inv�lido foi
 * selecionado.
 */
public class InvalidItemException extends RuntimeException {

	public InvalidItemException() {
		super();
	}

	public InvalidItemException(String message) {
		super(message);
	}
}
