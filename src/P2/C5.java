package P2;

import P3.C11;

public class C5 {
    public void call() {
        System.out.println("call C5");

        C6 c6 = new C6();
        c6.call();

        C7 c7 = new C7();
        c7.call();

        C9 c9 = new C9();
        c9.call();
    }
}
