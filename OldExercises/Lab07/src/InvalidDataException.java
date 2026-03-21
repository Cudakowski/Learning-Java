public class InvalidDataException extends Exception {
    public InvalidDataException(String errorMessage, Throwable err){
        super(errorMessage, err);
    }

    public InvalidDataException(String errorMessage){
        super(errorMessage);
    }
}
