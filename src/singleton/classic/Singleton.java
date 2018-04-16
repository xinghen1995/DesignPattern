package singleton.classic;

/**
 * 其uniqueInstance == null只在第一次检查有用，之后都没用处，但依旧进行了检查，这里
 * 会导致性能的下降
 * 并且：在多线程环境中这将导致不安全的编程。延迟实例化
 */
public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    public String getDescription() {
        return "I'm a classic Singleton";
    }
}
