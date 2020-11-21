package P1;

import P2.C5;

public class C2 {
    public void call() {
        System.out.println("call C2");

        C4 c4 = new C4();
        c4.call();

        C5 c5 = new C5();
        c5.call();
    }
}
