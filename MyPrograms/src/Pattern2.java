public class Pattern2
{
    public static void main(String args[]) {
        for (int i = 86; i <= 90; i++)
        {
            for (int j = 90; j >= i; j--)
                {
                System.out.print((char)j);
            }
            System.out.println();
        }
    }
}