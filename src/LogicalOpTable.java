public class LogicalOpTable {
    public static void main(String[] args) {
        System.out.println("  P  \t" + "  Q   \t" + "  AND  \t" + "  OR  \t" + "  XOR \t" + "  NOT  ");
// p = true q = true
        boolean p = true;
        boolean q = true;
        if (p & q) {
            int x = 1;
            System.out.print(p + "  " + "\t " + q + " \t   " + x + "   ");
        } else {
            int x = 0;
            System.out.print(" " + p + " " + " \t " + q + " \t   " + x + "   ");
        }
        if (p | q) {
            int x = 1;
            System.out.print("\t   " + x + "  ");
        } else {
            int x = 0;
            System.out.print("\t  " + x + "    ");
        }
        if (p ^ q) {
            int x = 1;
            System.out.print("\t   " + x + "  ");
        } else {
            int x = 0;
            System.out.print("\t    " + x + "  ");
        }
        if (!p) {
            int x = 1;
            System.out.println("\t  " + x + "  ");
        } else {
            int x = 0;
            System.out.println("\t   " + x + "   ");
        }
// p = true q = false
        p = true;
        q = false;
        if (p & q) {
            int x = 1;
            System.out.print(p + "   \t " + q + " \t   " + x + "   ");
        } else {
            int x = 0;
            System.out.print(p + "  " + " \t" + q + " \t  " + x + " ");
        }
        if (p | q) {
            int x = 1;
            System.out.print("\t   " + x + "  ");
        } else {
            int x = 0;
            System.out.print("\t  " + x + "    ");
        }
        if (p ^ q) {
            int x = 1;
            System.out.print("\t    " + x + "  ");
        } else {
            int x = 0;
            System.out.print("\t    " + x + "  ");
        }
        if (!p) {
            int x = 1;
            System.out.println("\t  " + x + "  ");
        } else {
            int x = 0;
            System.out.println("\t   " + x + "   ");
        }
        // p = false q = true
        p = false;
        q = true;
        if (p & q) {
            int x = 1;
            System.out.print(p + "  \t " + q + " \t   " + x + "   ");
        } else {
            int x = 0;
            System.out.print(p + " " + " \t" + q + " \t  " + x + "   ");
        }
        if (p | q) {
            int x = 1;
            System.out.print("\t   " + x + "  ");
        } else {
            int x = 0;
            System.out.print("\t  " + x + "   ");
        }
        if (p ^ q) {
            int x = 1;
            System.out.print(" \t    " + x + "  ");
        } else {
            int x = 0;
            System.out.print("\t   " + x + "  ");
        }
        if (!p) {
            int x = 1;
            System.out.println("\t   " + x + " ");
        } else {
            int x = 0;
            System.out.println("\t   " + x + " ");
        }
        // p = false q = false
        p = false;
        q = false;
        if (p & q) {
            int x = 1;
            System.out.print(p + "   \t " + q + "\t   " + x + "   ");
        } else {
            int x = 0;
            System.out.print(p + " " + " \t" + q + " \t  " + x + "   ");
        }
        if (p | q) {
            int x = 1;
            System.out.print(" \t   " + x + "  ");
        } else {
            int x = 0;
            System.out.print(" \t   " + x + "  ");
        }
        if (p ^ q) {
            int x = 1;
            System.out.print(" \t  " + x + "  ");
        } else {
            int x = 0;
            System.out.print(" \t    " + x + "  ");
        }
        if (!p) {
            int x = 1;
            System.out.println("\t   " + x + "   ");
        } else {
            int x = 0;
            System.out.println(" \t  " + x + "  ");
        }
    }
}