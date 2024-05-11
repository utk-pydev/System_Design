package Java8Codes;

import java.util.Objects;

public class LazySingleton {
    private LazySingleton(){
    }
    private static LazySingleton instance;
    ///This will not work in multithreaded environment
    //Race Condition will be there.
    ///In order to avoid that use synchronised keyword.
    public static synchronized LazySingleton getInstance(){
        return Objects.requireNonNullElseGet(instance, () -> instance = new LazySingleton());
    }

}
