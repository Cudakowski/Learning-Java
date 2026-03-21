public class EmptyFileException extends Exception{
    public EmptyFileException(String errorMessage, Throwable err){
        super(errorMessage, err);
    }

    public EmptyFileException(String errorMessage){
        super(errorMessage);
    }
}
