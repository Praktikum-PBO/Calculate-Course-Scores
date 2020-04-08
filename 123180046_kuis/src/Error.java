// Membuat custom exception
public class Error extends Throwable {
    // Deklarasi vaiabel
    private String exception;

    // Membuat constructor
    public Error(String e) {
        super();
        this.exception = e;
    }

    // Membuat method getMessage exception
    public String getMessage(){
        return this.exception;
    }
}
