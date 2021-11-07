public class Tester {
    public static void main(String[] args) {
        JavaSingleton singleton = JavaSingleton.getInstance();

        singleton.name = "Dima";

        JavaOuter outer = new JavaOuter();
        JavaOuter.JavaInner inner = outer.new JavaInner();
        JavaOuter.JavaNested nested = new JavaOuter.JavaNested();
    }
}

