package P1;

public class C1 {
    public void call() {
        System.out.println("call C1");
        C2 c2 = new C2();
        c2.call();

        C3 c3 = new C3();
        c3.call();

        C4 c4 = new C4();
        c4.call();
    }
}
