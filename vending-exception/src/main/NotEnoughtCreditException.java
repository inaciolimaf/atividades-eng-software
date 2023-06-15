package main;

/**
 * Classe de Exce��o para o Dispenser indicar quando o cr�dito existente n�o �
 * suficiente para a compra do item.
 */
public class NotEnoughtCreditException extends RuntimeException {

	public NotEnoughtCreditException() {
		super();
	}

	public NotEnoughtCreditException(String message) {
		super(message);
	}
}
