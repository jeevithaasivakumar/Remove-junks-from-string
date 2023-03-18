public class removejunk {
    public static void main(String[] args) {
        String s = "*-/*$%^^remove junk123~!@)()";
        // expecting:[a-z,A-Z,0-9] rest rmove
        s = s.replaceAll("[^a-zA-Z0-9]", ""); // ^-denotes not ( to keep only those characters in the string and replace
                                              // others)
        System.out.println(s);

    }
}