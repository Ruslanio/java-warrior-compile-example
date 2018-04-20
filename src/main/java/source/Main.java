package source;

import net.openhft.compiler.CompilerUtils;
import test.ControlInteface;


public class Main {



    public static void main(String[] args) {
        String className = "test.Test";
        String javaCode = CodeStorage.CLASS_CODE;
        Class aClass = null;
        try {
            aClass = CompilerUtils.CACHED_COMPILER.loadFromJava(className, javaCode);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        ControlInteface runner = null;
        try {
            runner = (ControlInteface) aClass.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        runner.doShit();
    }
}
