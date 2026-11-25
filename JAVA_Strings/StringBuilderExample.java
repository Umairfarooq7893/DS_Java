public class StringBuilderExample{
    public static void main(String[] args) {

        // Immutable String
        String s = "Hello";
        s = s + " World";
        System.out.println(s);

/*      => StringBuilder is a class in Java used to create mutable strings.
        => the string can be changed without creating a new object.*/
        // 1. Declaration
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println("Original String: " + sb);

        // 2. Get Character at index
        System.out.println("Character at index 2: " + sb.charAt(2));

        // 3. Set Character at index (Replace 'T' with 'P')
        sb.setCharAt(0, 'P');
        System.out.println("After setCharAt: " + sb); // Pony

        // 4. Insert Character (Insert 'S' at index 0)
        sb.insert(0, 'S');
        System.out.println("After insert: " + sb); // SPony

        // 5. Delete (Delete the extra 'S')
        // delete(start, end) -> end is exclusive
        sb.delete(0, 1); 
        System.out.println("After delete: " + sb); // Pony

        // 6. Append (Adding to the end)
        StringBuilder helloSb = new StringBuilder("h");
        helloSb.append("e"); // h -> he
        helloSb.append("l"); // he -> hel
        helloSb.append("l"); // hel -> hell
        helloSb.append("o"); // hell -> hello
        System.out.println("After appends: " + helloSb);

        // --- REVERSE STRING ALGORITHM ---
        
        StringBuilder reverseSb = new StringBuilder("hello");
        
        // Loop runs until the middle (length/2)
        for(int i=0; i < reverseSb.length()/2; i++) {
            int front = i;
            int back = reverseSb.length() - 1 - i; // 5 - 1 - 0 = 4
            
            char frontChar = reverseSb.charAt(front);
            char backChar = reverseSb.charAt(back);
            
            // Swapping characters
            reverseSb.setCharAt(front, backChar);
            reverseSb.setCharAt(back, frontChar);
        }

        System.out.println("Reversed String: " + reverseSb); // olleh
    }
}
