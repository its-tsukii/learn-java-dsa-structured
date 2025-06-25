package Java.Core.OOP.Interface;

public class Interface {
    public static void main(String[] args) {
        car mycar = new Methods();
        mycar.battery();
        mycar.door();
        mycar.engine();
    }
}

interface car {
    void engine();

    void battery();

    void door();

}

class Methods implements car {
    public void engine() {
        System.out.println("engine on");
    }

    public void battery() {
        System.out.println("battery at full capacity");
    }

    public void door() {
        System.out.println("doors open");
    }

}
// class - class -> extends
// class - interface -> implements
// interface - interface -> extends