class First {
    int x, y;

    void f1() {
        System.out.println("parents function 1 is executed");
    }

    void f2() {
        System.out.println("parents function 2 is executed");
    }

    First() {
        System.out.println("parent constructor is executed");
    }
}

class Second extends First {
    int p = 5, q = 5, sum = 0;

    void f3() {
        sum = p + q;
        System.out.println("child in sum " + sum);
    }

    Second() {
        System.out.println("child constructor is executed");
        // first call But execute the parents class constractor
    }
}

class Inherit {
    public static void main(String[] args) {
        Second s = new Second();
        s.f1();
        s.f3();
    }
}
