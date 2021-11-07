public class JavaSingleton {
    public String name;

    private JavaSingleton(){}

    private static JavaSingleton javaSingleton = null;

    public static JavaSingleton getInstance() {
        if(javaSingleton == null) {
            javaSingleton = new JavaSingleton();
        }
        return javaSingleton;
    }

    public static void main(String[] args) {
        JavaSingleton instance = JavaSingleton.getInstance();
    }

}
