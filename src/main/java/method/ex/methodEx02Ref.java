package method.ex;

public class methodEx02Ref {
    public static void main(String[] args) {

        printMessage("hello world", 3);
        printMessage("java", 5);
        printMessage("gigi", 7);
    }

    public static void printMessage(String message, int times){
        for (int i = 0; i < times; i++) {
            System.out.println(message);

        }
    }

}
