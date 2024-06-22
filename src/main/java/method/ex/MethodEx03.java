package method.ex;

public class MethodEx03 {
    public static void main(String[] args) {
        int balance = 10000;

        // 입금 500
        int deposiAmount = 1000;
        balance += deposiAmount;
        System.out.println(deposiAmount + "원 입금하였습니다. 현재 잔액: " +balance);


        // 출금 200
        int withdrawAount = 2000;
        if (balance >= withdrawAount) {
            balance -= withdrawAount;
            System.out.println(withdrawAount + "원 출금하였습니다. 현재 잔액: " +balance);
        } else {
            System.out.println(withdrawAount + "원을 출금하려 하였으나 잔액이 부족합니다.");
        }

        System.out.println("최종잔액: " +balance +"원");



    }



}
