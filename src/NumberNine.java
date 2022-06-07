public class NumberNine {
    public static void main(String[] args) {
        int i;

        i=0;

        if (true ||(++i<100))
            System.out.println("This is  displayed");
        System.out.println("if operator is executed case 1:" + i);

        if (true | (++i<100))
            System.out.println("This is  deplayed");
        System.out.println("if operator is executed case 2:"+i);

        int thisNumber=0;

        if(true |false)System.out.println("this should be printed");
        if(true | (++thisNumber>0))System.out.println("this should be printed and thisNumber is"+ thisNumber);//1
        if(true || (++thisNumber>0))System.out.println("this should be printed and thisNumber is"+ thisNumber);//2
        if(true || false)System.out.println("this should be printed");
        if(true &false)System.out.println("this should  NOT be printed");
        if(true & (++thisNumber>0))System.out.println("this should be printed BECAUSE thisNumber is"+ thisNumber);
        if(true && false)System.out.println("this should  NOT be printed");
        if(true && (++thisNumber>0))System.out.println("this should be printed BECAUSE thisNumber is"+ thisNumber);

        if(true ^false)System.out.println("this should  be printed");
        if(!true)System.out.println("this should not be printed");
        if(!false)System.out.println("this should  be printed");


        if(false |false)System.out.println("this should  be printed");
        if(false |(++thisNumber>0))System.out.println("this should  be printed BECAUSE thisNumber is"+ thisNumber);
        if(false || (++thisNumber>0))System.out.println("this should be printed BECAUSE thisNumber is"+ thisNumber);
        if(false || true)System.out.println("this should  be printed");
        if(false & true)System.out.println("this should not be printed");
        if(false & (++thisNumber>0))System.out.println("this should be not  printed  thisNumber is"+ thisNumber);
        if(false && true)System.out.println("this should not be printed" );
        if(false && (++thisNumber>0))System.out.println("this should be not  printed");
        if(false ^ true)System.out.println("this should not be printed");


    }
}
