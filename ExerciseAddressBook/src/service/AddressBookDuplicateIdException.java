package service;

public class AddressBookDuplicateIdException extends Exception {

    public AddressBookDuplicateIdException(String message) {
        super(message);
    }

    public AddressBookDuplicateIdException(String message,
                                           Throwable cause) {
        super(message, cause);
    }

}