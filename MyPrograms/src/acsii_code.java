class acsii_code {
    public static void main(String args[]) {
        char ch;
        System.out.println("ACSII CODE"+"\t"+"CHARACTER");
        for(int i = 0; i<=255;i++){
            ch = (char)i;
            System.out.println(i + "\t"+"\t" + ch);
        }
    }
}