package model;

public class NoSuchAccountException extends Exception{

	private static final long serialVersionUID = 7388193593235487201L;

    private long accountNumber;

    public NoSuchAccountException(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String getMessage() {
        return this.accountNumber + " is not registered!";
    }
	
}
