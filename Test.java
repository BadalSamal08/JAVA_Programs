import java.util.*;

class Empl {
    int eid, sal;
    String name;

    void setInfo(int a, int b, String c) {
        eid = a;
        sal = b;
        name = c;
    }

    void display() {
        System.out.println(eid + " " + sal + " " + name);

    }
}

class Test {
    public static void main(String[] args) {
        Empl e1 = new Empl();
        e1.setInfo(23, 20000, "Badal");
        e1.display();

    }
}
