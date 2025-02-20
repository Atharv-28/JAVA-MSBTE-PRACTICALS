public class wrp2 {
    public static void main(String[] args) {
        char c1,c2;
        c1='8';
        c2='v';
        boolean b1,b2;
        b1= Character.isDigit(c1);
        b2= Character.isDigit(c2);

        String str1 =c1+" is a digit is "+b1;
        String str2 =c2+" is a digit is "+b2;

        System.out.println(str1);
        System.out.println(str2);
    }
}
