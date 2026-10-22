package exceptions;

// An UNCHECKED (runtime) exception, because it extends RuntimeException.
// The compiler does NOT force you to catch it or declare it.
// Use runtime exceptions for programming mistakes, like passing a bad value,
// that should be fixed in the code rather than handled.
public class MyRuntimeException extends RuntimeException {

    public MyRuntimeException(String message) {
        super(message);
    }
}
