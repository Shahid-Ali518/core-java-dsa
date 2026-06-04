package inheritance;

interface A {
    default void foo() {
        System.out.println("A foo");
    }
}
