package model;

public class AccountNumberAlreadyInUseException extends Exception{

	private static final long serialVersionUID = 3987523865766794215L;

    @Override
    public String getMessage() {
        return "Account number has already been registered!";
    }
	
}
