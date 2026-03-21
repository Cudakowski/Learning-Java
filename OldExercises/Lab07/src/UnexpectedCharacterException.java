public class UnexpectedCharacterException extends InvalidDataException{
    public UnexpectedCharacterException(String errorMessage, Throwable err){
        super(errorMessage, err);
    }

    public UnexpectedCharacterException(String errorMessage){
        super(errorMessage);
    }
}
