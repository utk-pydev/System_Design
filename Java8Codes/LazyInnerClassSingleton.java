package Java8Codes;

public class LazyInnerClassSingleton {
    private LazyInnerClassSingleton(){
    }
    private static class singletonHelper{
        private static final LazyInnerClassSingleton instance = new LazyInnerClassSingleton();
    }
    public static LazyInnerClassSingleton getInstance(){
        return singletonHelper.instance;
    }
}
