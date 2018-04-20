package test;

public class Test extends TestInitializer {

    @Override
    void main() {
        actionContoller.hit(4);
        actionContoller.walk(5);
        actionContoller.doBackflip(99);
    }
}
