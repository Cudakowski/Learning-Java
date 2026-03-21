public class NonNumericDataException extends InvalidDataException {
    public NonNumericDataException(String errorMessage, Throwable err){
        super(errorMessage, err);
    }

    public NonNumericDataException(String errorMessage){
        super(errorMessage);
    }
}
