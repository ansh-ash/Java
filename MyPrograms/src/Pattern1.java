public class Pattern1
{
    public static void main(String args[]) {
        for (int i = 49; i <=57; i++) {
            for (int j = 49; j <= i; j++) {
                if (i % 2 == 0)
                    System.out.print((char)(j+16));
                else if(i%3==0)
                    System.out.print((char)(j+48));
                else
                    System.out.print((char)j);
            }
            System.out.println();
        }
    }
}
