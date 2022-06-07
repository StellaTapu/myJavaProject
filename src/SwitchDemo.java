public class SwitchDemo {
    public static void main(String[] args) {
        int i;

        for(i=0;i<10;i++);{
        switch (i) {
            case 0:
                System.out.println("i egal cu zero");
                break;
            case 1:
                System.out.println("i egal cu unu");
                break;
            case 2:
                System.out.println("i egal cu doi");
                break;
            case 3:
                System.out.println("i egal cu trei");
                break;
            case 4:
                System.out.println("i egal cu patru");
                break;
            default:
                System.out.println("i egal sau mai mare cu 5");
        }
        }
    }
}
