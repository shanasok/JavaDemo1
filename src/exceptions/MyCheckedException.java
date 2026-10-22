package exceptions;

// A CHECKED exception, because it extends Exception.
// The compiler forces you to deal with it: any method that throws it must
// either catch it (try/catch) or declare it with "throws MyCheckedException".
// Use checked exceptions for problems a caller should expect and plan for,
// like a missing file or a network that is down.
public class MyCheckedException extends Exception {

    public MyCheckedException(String message) {
        super(message);
    }
}
