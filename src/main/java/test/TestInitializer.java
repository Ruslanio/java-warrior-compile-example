package test;

import action.ActionContoller;
import action.ActionControllerImpl;

public abstract class TestInitializer implements ControlInteface {

    protected ActionContoller actionContoller;

    @Override
    public void doShit() {
        actionContoller = new ActionControllerImpl();
        main();
    }

    abstract void main();
}
