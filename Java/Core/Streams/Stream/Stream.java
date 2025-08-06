package Java.Core.Streams.Stream;

import java.util.*;

public class Stream {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // arr.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
        // arr.stream().map(n -> n * n).forEach(System.out::println);
        arr.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .forEach(System.out::println);
    }

    public static void generate() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'generate'");
    }

    public static Object generate(Object object) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'generate'");
    }
}
