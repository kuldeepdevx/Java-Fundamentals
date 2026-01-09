package OOPS.Inheritance.LocalInnerClass;

public class Outer {

    void process() {
        final int[] x = {0};
        class LocalHelper {
            void help() {
                System.out.println("Helping..."+ x[0]);
                x[0] =2;
            }
        }
        LocalHelper lh = new LocalHelper();
        lh.help();
    }
}
