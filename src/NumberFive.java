import java.util.Scanner;

public class NumberFive {
    public static void main(String[] args) {
        int i,j;
        boolean b1,b2;
        i=10;
        j=11;
        if(i<j) System.out.println("i<j");
        if(i<=j) System.out.println("i<=j");
        if(i!=j) System.out.println("i!=j");
        if(i==j) System.out.println("nu calc");
        if(i>=j) System.out.println("nu clac");
        if(i>j) System.out.println("nu calc");
        b1=true;
        b2=false;

        if(b1&b2) System.out.println("nu se indeplineste");
        if(!(b1&b2)) System.out.println("!(b1&b2):true");
        if(b1 | b2) System.out.println("b1|b2:true");
        if(b1 ^ b2) System.out.println("b1^b2:true");
        Scanner input=new Scanner(System.in);
        System.out.println("Enter birthday");
        int birthday=input.nextInt();

        System.out.println("Enter if promo is running");
        boolean isPromo=input.nextBoolean();

        int currentdate=11;


        if(( currentdate==birthday)&isPromo) System.out.println("nu va fi bonus");
        if(( currentdate==birthday)&isPromo) System.out.println(" va fi bonus");
        if(!( currentdate==birthday)&!isPromo) System.out.println(" nu este zi de nastere");
        if(!( currentdate==birthday)&isPromo) System.out.println(" nu este zi de nastere, va fi bonus");
    }
}
