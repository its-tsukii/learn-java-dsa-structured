package DataStructures.Variables;

// Java Data Types with memory sizes, values, and operations

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Java Primitives with Memory ===");

        // 🔢 int: 32-bit (4 bytes)
        int myInt = 42;
        System.out.println("int: " + myInt + " (Size: 32 bits = 4 bytes)");

        // 🔢 double: 64-bit (8 bytes)
        double myDouble = 3.14159;
        System.out.println("double: " + myDouble + " (Size: 64 bits = 8 bytes)");

        // 🔢 float: 32-bit (4 bytes)
        float myFloat = 2.5f;
        System.out.println("float: " + myFloat + " (Size: 32 bits = 4 bytes)");

        // 🔢 long: 64-bit (8 bytes)
        long myLong = 123456789L;
        System.out.println("long: " + myLong + " (Size: 64 bits = 8 bytes)");

        // 🔢 boolean: JVM-dependent (technically 1 bit, usually 1 byte)
        boolean myBool = true;
        System.out.println("boolean: " + myBool + " (Size: ~1 byte in arrays/objects)");

        // 🔤 char: 16-bit (2 bytes) because Java uses Unicode
        char myChar = 'A';
        System.out.println("char: '" + myChar + "' (Size: 16 bits = 2 bytes)");

        System.out.println("\n=== Wrapper Objects and Memory ===");

        // 📦 Wrapper classes (Integer, Double, etc.)
        Integer myInteger = 42;
        Double myDoubleObj = 3.14;
        Boolean myBooleanObj = true;

        System.out.println("Integer object: " + myInteger);
        System.out.println("Double object: " + myDoubleObj);
        System.out.println("Boolean object: " + myBooleanObj);

        System.out.println("Approximate memory size:");
        System.out.println("Integer: ~16-24 bytes (object header + 4 bytes value)");
        System.out.println("Double: ~24 bytes");
        System.out.println("Boolean: ~16 bytes");

        // ℹ️ Note: Actual size depends on JVM implementation and object alignment
        // (e.g., 8-byte aligned)

        System.out.println("\n=== String and StringBuffer ===");

        String str = "Hello World";
        System.out.println("String: \"" + str + "\"");
        System.out.println(
                "Each character: 2 bytes (Unicode), total: " + (str.length() * 2) + " bytes + object overhead");

        StringBuffer sb = new StringBuffer("Java");
        sb.append(" is cool");
        System.out.println("StringBuffer: " + sb);
        System.out.println("Mutable string, size = character array + object overhead");

        System.out.println("\n=== Character & ASCII Table ===");

        char exampleChar = 'G';
        int asciiVal = (int) exampleChar;
        System.out.println("Character: '" + exampleChar + "' -> ASCII: " + asciiVal);

        System.out.println("\n--- ASCII A-Z ---");
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.println("'" + c + "' = " + (int) c);
        }

        System.out.println("\n--- ASCII a-z ---");
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.println("'" + c + "' = " + (int) c);
        }

        System.out.println("\n=== Character Utility Methods ===");
        char testChar = '8';
        System.out.println("isDigit('" + testChar + "') = " + Character.isDigit(testChar));
        System.out.println("isLetter('A') = " + Character.isLetter('A'));
        System.out.println("isLetterOrDigit('!') = " + Character.isLetterOrDigit('!'));
        System.out.println("isWhitespace(' ') = " + Character.isWhitespace(' '));
        System.out.println("toUpperCase('x') = " + Character.toUpperCase('x'));
        System.out.println("toLowerCase('J') = " + Character.toLowerCase('J'));

        System.out.println("\n=== Type Conversion / Parsing ===");

        String numberStr = "123";
        int parsedInt = Integer.parseInt(numberStr);
        double parsedDouble = Double.parseDouble("45.67");
        boolean parsedBool = Boolean.parseBoolean("true");

        System.out.println("Parsed int: " + parsedInt);
        System.out.println("Parsed double: " + parsedDouble);
        System.out.println("Parsed boolean: " + parsedBool);

        int x = 100;
        String xStr = Integer.toString(x);
        System.out.println("int to String: " + xStr);

        double d = 9.99;
        int casted = (int) d; // Narrowing conversion
        System.out.println("Casted double to int (9.99 -> " + casted + ")");

        System.out.println("\n=== Null Character (\\0) ===");
        char nullChar = '\0';
        System.out.println("Null char: '" + nullChar + "' (ASCII: " + (int) nullChar + ")");

        System.out.println("\n=== Object Comparison ===");
        Integer a = 128;
        Integer b = 128;
        System.out.println("Integer a == b? " + (a == b)); // false
        System.out.println("Integer a.equals(b)? " + a.equals(b)); // true

        // JVM caches Integer values between -128 and 127
        Integer c = 127;
        Integer d_ = 127;
        System.out.println("Integer c == d (within cache)? " + (c == d_)); // true
    }
}
