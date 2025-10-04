public class strings {
    public static void main(String[] args) {
        String name = "Krish Shah";

        int length = name.length();
        char letter = name.charAt(0);
        System.out.println(length);
        System.out.println(letter);

        int index = name.indexOf("i");
        System.out.println(index);

        int lastindex = name.lastIndexOf("h");
        System.out.println(lastindex);

        // name = name.toUpperCase();
        // name = name.trim();
        // System.out.println(name);
    }
}
