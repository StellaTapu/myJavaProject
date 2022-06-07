public class NoBreak {
    public static void main(String[] args) {
        int i;
        for (i = 0; i <= 5; i++) {
            switch (i) {
                case 0:
                    System.out.println("i mai mic ca unu");
                case 1:
                    System.out.println("i mai mic ca doi");
                case 2:
                    System.out.println("i mai mic ca trei");
                case 3:
                    System.out.println("i mai mic ca patru");
                case 4:
                    System.out.println("i mai mic ca cinci");
                default:
                    System.out.println("default op");
            }
            System.out.println();
        }
       int z=2;

        switch (z) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("zile");
                break;
            case 6:
            case 7:
                System.out.println("liber");
                break;
            default:
                System.out.println("nu este zi de sapt");
        }
        char ch1='A';
        char ch2='A';

        switch (ch1){
            case 'A':
                System.out.println("acesta este A");
                switch (ch2){
                    case 'A':
                        System.out.println("alt op");
                        break;
                    case 'B':
                        System.out.println("alt o");
                        break;
                }
                break;
            case 'B':
                System.out.println("altul");
                break;
        }
    }
}
