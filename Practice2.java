import java.util.stream.Stream;

public class Practice2 {
    public static void main(String[] args) {
        Stream.iterate(2, n -> n + 3)
                .map(n -> n * 2)
                .filter(n -> n % 5 == 0)
                .limit(3)
                .forEach((x) -> System.out.print(x + " "));
    }
}



// this is the practice file