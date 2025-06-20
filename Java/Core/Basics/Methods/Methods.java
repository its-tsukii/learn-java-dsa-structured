/**
 * Performs Various functions and demonstrates various functions of Methods.
 * @param obj computer, playmusic(), pen().
 * @param i To iterate.
 * @print obj.
 */

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

/*
 * this demonstrates the use of method how we can use em again and again
 * alongside how to handle objects tackle them with methods, so in the example
 * obj is an object and its method is playmusic() and Computer is an class
 */