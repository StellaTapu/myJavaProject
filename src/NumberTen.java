import java.util.Scanner;

public class NumberTen {
    public static void main(String[] args) {
        int y;
        Scanner input=new Scanner(System.in);
        y=input.nextInt();
        if(y==1) System.out.println("y=1");
        y=y+1;
        y++;
        y+=1;

        int x=5000;

        x+=100;
        System.out.println(x);
        x-=100;
        System.out.println(x);
        x/=100;
        System.out.println(x);
        x%=100;
        System.out.println(x);
        x*=100;
        System.out.println(x);
        x&=100;
        System.out.println(x);
        x|=100;
        System.out.println(x);
        x^=100;
        System.out.println(x);
        int q=5;
        int rez=q%2;
        System.out.println(rez);
    }
}
