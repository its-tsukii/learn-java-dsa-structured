package Java.Core.OOP.Polymorphism;

public class Polymorphism {
    public static void main(String[] args) {
        animal a = new dog();
        animal a1 = new animal();
        animal a2 = new cat();
        a.makesound();
        a1.makesound();
        a2.makesound();
    }
}

class animal {
    public void makesound() {

        System.out.println("animal sound");
    }
}

class dog extends animal {
    public void makesound() {
        super.makesound();
        System.out.println("dog sound");
    }
}

class cat extends dog {

    public void makesound() {
        System.out.println("cat sound");
    }
}