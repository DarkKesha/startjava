public class VariablesTheme {
    public static void main(String[] args) {
        byte a = 64;
        short b = 327;
        int c = 12345;
        long d = 123456;
        float i = 922337203;
        double f = 1.5;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(i);
        System.out.println(f);

        int x = 100;
        int y = 200;
        int z = ((x + y) * 11) / 100;
        System.out.println(x + y - z);
        System.out.println(z);

        System.out.println ("J    "+"a  "+"v     "+"v  "+"a");
        System.out.println ("J   "+"a "+"a  "+"v   "+"v  "+"a "+"a");
        System.out.println ("J  "+"J  "+"aaaaa  "+"V "+"V  "+"aaaaa");
        System.out.println ("JJ  "+"a     "+"a  "+"V  "+"a     "+"a");

        byte a1 = 127;
        short b1 = 32767;
        int c1 = 2147483647;
        long d1 = 9_223_372_03;
        float i1 = 340282346;
        double f1 = 1.7E+308;
        System.out.println(a1);
        System.out.println(b1);
        System.out.println(c1);
        System.out.println(d1);
        System.out.println(i1);
        System.out.println(f1);
        byte a2 = 127;
        a2++;
        short b2 = 32767;
        b2++;
        int c2 = 2147483647;
        c2++;
        long d2 = 9_223_372_03;
        d2++;
        float i2 = 340282346;
        i2++;
        double f2 = 1.7E+308;
        f2++;
        System.out.println(a2);
        System.out.println(b2);
        System.out.println(c2);
        System.out.println(d2);
        System.out.println(i2);
        System.out.println(f2);
        byte a3 = 127;
        a3--;
        short b3 = 32767;
        b3--;
        int c3 = 2147483647;
        c3--;
        long d3 = 9_223_372_03;
        d3--;
        float i3 = 340282346;
        i3--;
        double f3 = 1.7E+308;
        f3--;
        System.out.println(a3);
        System.out.println(b3);
        System.out.println(c3);
        System.out.println(d3);
        System.out.println(i3);
        System.out.println(f3);
    }
}
