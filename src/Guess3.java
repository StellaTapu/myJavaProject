import java.io.IOException;

public class Guess3 {
    public static void main(String[] args)throws IOException {

        char ch,answer='S';
        System.out.println("Litera din minte A-Z");

        System.out.println("Ghiciti");

        ch=(char)System.in.read();

        if(ch==answer) System.out.println("Corect");
        else {
            System.out.print("Se afla");
            if(ch<answer) System.out.println("la sfirsit de alfabet");
            else System.out.println("la inceput de alfabet");

    }
}

}
