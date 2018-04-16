package singleton.subclass;

public class SingletonTestDrive {
    public static void main(String[] args) {
        Singleton foo = CoolerSingleton.getInstance();
        Singleton bat = HotterSingleton.getInstance();
        System.out.println(foo);
        System.out.println(bat);
    }
}
