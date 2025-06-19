package Java.Core.Basics.Methods;

public class Methods {

    public static void main(String[] args) {

        Computer obj = new Computer();
        obj.playMusic();
        System.out.println(obj.getMeAPend(9));
    }
}

class Computer {
    public void playMusic() {
        System.out.println("music is playing");
    }

    public String getMeAPend(int cost) {
        if (cost >= 10) {
            return "Pen Cost is > Than 10";
        } else {
            return "Nothing";
        }
    }
}