import java.io.IOException;

public class Guess {
    public static void main(String[] args)throws IOException {
        char ch,answer='S';
        System.out.println("Litera din minte A-Z");

        System.out.println("Ghiciti");

        ch=(char)System.in.read();

        if(ch==answer) System.out.println("Corect");
        else System.out.println("Gresit");

    }
}
