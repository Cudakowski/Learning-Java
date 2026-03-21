public class EmptyLineException extends InvalidDataException{
    public EmptyLineException(String errorMessage, Throwable err){
        super(errorMessage, err);
    }

    public EmptyLineException(String errorMessage){
        super(errorMessage);
    }
}
