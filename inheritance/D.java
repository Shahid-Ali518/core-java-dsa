package inheritance;

class D implements B, C {
    // Must override foo() to resolve ambiguity
    @Override
    public void foo() {
        B.super.foo(); // choose B's implementation
    }
}
