public class IfElseStatementTheme {
    public static void main(String[] args) {
        int age = 15;
        String male = "male";
        int growth = 181;
        if(age>20) {
            System.out.println("good");
        } else {
            System.out.println("bad");
        }
        if(growth<1.80) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
        char firstletterofname = "Name".charAt(0);
        if(firstletterofname == 'M') {
            System.out.println("false");
        } else if(firstletterofname== 'I') {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
    }
}
