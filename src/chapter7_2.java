// 1 successfully works.
// 2 does not work. The return type was changed (boolean -> int) but does not overload the method,
// since the argument type was not changed (int -> int).
// 3 does not work. The Vampire class uses a new method called "scare", which will not run since the for loop in main()
// calls on the frighten() method.
// 4 does not work. Changing the argument type (int -> byte) overloads the method, causing the JVM to skip the method
// in vampire and use the method in its superclass, Monster.

class MonsterTestDrive {

    public static void main(String[] args) {

        Monster [] ma = new Monster[3];
        ma[0] = new Vampire();
        ma[1] = new Dragon();
        ma[2] = new Monster();

        for (int x = 0; x < 3; x++) {
            ma[x].frighten(x);
        }
    }
}

class Monster {

    boolean frighten(int d) {
        System.out.println("arrrgh");
        return true;
    }
}

class Vampire extends Monster {

    boolean frighten(int x) {

        System.out.println("a bite?");
        return false;
    }
}

class Dragon extends Monster {

    boolean frighten(int degree) {
        System.out.println("breath fire");
        return true;
    }
}