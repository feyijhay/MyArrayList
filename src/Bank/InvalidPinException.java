package Bank;

public class InvalidPinException extends RuntimeException{
        public InvalidPinException(String statement){
            super(statement);
        }

}
