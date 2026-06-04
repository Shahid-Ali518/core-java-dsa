package inheritance;

interface C extends A {
    default void foo() {
        System.out.println("C foo");
    }
}