package Java.Core.OOP.Abstraction;

public record Abstraction() {
    public static void main(String[] args) {
        car mycar = new LMG();
        mycar.config();
        mycar.engine();
    }
}

abstract class car {
    abstract void config();

    void engine() {
        System.out.println("engine on");
    }
}

class LMG extends car {
    void config() {
        System.out.println("config");
    }

}

// class - class -> extends
// class - interface -> implements
// interface - interface -> extends