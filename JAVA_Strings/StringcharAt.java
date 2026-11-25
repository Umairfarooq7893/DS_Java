public class StringcharAt {
    public static void main(String[] args) {

        String name = "Umair Farooq";

        // Print length of the string
        System.out.println("Length: " + name.length());

        // Print each character of the string
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }
    }
}
