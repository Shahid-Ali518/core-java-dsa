package inheritance;

interface B extends A {
    default void foo() {
        System.out.println("B foo");
    }
}
