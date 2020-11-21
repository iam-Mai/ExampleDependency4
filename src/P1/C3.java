package P1;

import P3.C11;
import P3.C13;

public class C3 {
    public void call() {
        System.out.println("call C3");

        C11 c11 = new C11();
        c11.call();

        C13 c13 = new C13();
        c13.call();
    }
}
