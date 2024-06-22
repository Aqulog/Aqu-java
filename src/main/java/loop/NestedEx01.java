package loop;

public class NestedEx01 {
    public static void main(String[] args) {
        // 구구단 문제
        // 1 * 1 = 1
        // 1 * 2 = 2
        // 1 * 3 = 3
        // 1 * 4 = 4
        // 1 * 5 = 5
        // 1 * 6 = 6
        // 1 * 7 = 7
        // 1 * 8 = 8
        // 1 * 9 = 9
        // ...
        // 9 * 9 = 81

        // 안에 하나 더 있는 중첩 for문
        // 3단일 때 9번, 4단일 때 9번 ... etc

        for (int i = 1; i <= 9 ; i++) {
            // i한테 1을 받고, for문으로 들어와서 1~9까지 돌린다.
            // 이게 1 * j 를 하는 거다 j도 9까지 돌리고 다시
            // i의 2로 간다
            for (int j = 1; j <= 9 ; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }

        }



    }
}
