class Demo {
    int x, y, z; // globle variable of class

    void f1() {
        System.out.println("f1()=====> method");
    }

    Demo(int p, int q) {
        x = p;
        y = q;
        z = 10;
        System.out.println("Demo() constructor" + x);
        System.out.println("Demo() constructor" + y);
    }
}

class Constract {
    public static void main(String[] args) {
        Demo d1 = new Demo(2, 3);
        Demo d2 = new Demo(4,5);
        System.out.println("y is member variable of constractor" + d2.z);
        // d1.f1();
    }
}