package abstracts.a4;

abstract class B extends A {
    @Override
    void firstMethod() {
        System.out.println("FIRST");
    }

    abstract void thirdMethod();
}