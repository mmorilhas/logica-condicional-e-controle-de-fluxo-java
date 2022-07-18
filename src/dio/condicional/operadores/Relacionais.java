package dio.condicional.operadores;

public class Relacionais {

    public static void main(String[] args) {

        int i1 = 10;
        int i2 = 20;
        float f1 = 4.5f;
        float f2 = 3.5f;
        char c1 = 'x';
        char c2 = 'y';
        String s1 = "Fulano";
        String s2 = "Fulano";
        boolean b1 = true;
        boolean b2 = false;
        long l1 = 1000000L;
        long l2 = 2000000000L;
        short srt = 20;

        System.out.println("int 1 == int 2: " + (i1 == i2));
        System.out.println("float 1 != float 2: " + (f1 != f2));
        System.out.println("String 1 == String 2: " + (s1 == s2));
        System.out.println("long 1 < long 2: " + (l1 < l2));
        System.out.println("float 1 > long 1: " + (f1 > l1));
        System.out.println("boolean 1 == boolean 2: " + (b1 == b2));

    }

}
