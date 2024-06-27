class First {
    int x = 11, y = 22;

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

class Third extends First {
    void foo() {
        System.out.println("child in foo");
    }
}

class Inherit {
    public static void main(String[] args) {
        Third t = new Third();
        System.out.println("execed by third class object" + t.x + " " + t.y  );
       
    }
}
