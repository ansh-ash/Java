public class AlternateLetters {
    public static void main(String args[]) {
        for (char ch = 'A'; ch <= 'z'; ch = (char) (ch + 2))
        {
            System.out.println(ch);
        }
    }
}
