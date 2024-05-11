package Java8Codes;

public class Test {
    public static void main(String []args){
        System.out.println("Hello World!");
        LazyInnerClassSingleton obj = LazyInnerClassSingleton.getInstance();
        System.out.println(obj.hashCode());
        LazyInnerClassSingleton obj2 = LazyInnerClassSingleton.getInstance();
        System.out.println(obj2.hashCode());
    }
}
