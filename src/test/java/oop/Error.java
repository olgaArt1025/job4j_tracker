package oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public void printInfo() {
        System.out.println("Active: " + active);
        System.out.println("Статус: " + status);
        System.out.println("Сообщение: " + message);
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public Error() {
    }

    public static void main(String[] args) {
        Error error = new Error();
        error.printInfo();
        error = new Error(false, 53, "ошибка №7");
        error.printInfo();
        error = new Error(false, 45, "ошибка №2");
        error.printInfo();
        error = new Error(true, 0, "ошибок нет");
        error.printInfo();
    }
}
