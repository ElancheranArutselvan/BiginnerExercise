package JavaExercises.Basic;

public class BasicEx9 {
    public static void main(String[] args) {
        System.out.println("Java Version" +System.getProperty("java.Version"));
        System.out.println("Java Runtime Version " +System.getProperty(("java.runtime.version")));
        System.out.println("Java Home " + System.getProperty("java.home"));
        System.out.println("Java Vendor " +System.getProperty("java.vendor"));
        System.out.println(("Java Vendors URL " + System.getProperty("java.vendors.url")));
        System.out.println("Java Class Path "+System.getProperty("java.class.path"));

    }
}
