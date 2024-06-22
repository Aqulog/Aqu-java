package loop;

public class NestedEx02 {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows ; i++) {
            // 일단 i는 *의 라인 5줄까지 오는 거고
            for (int j = 1; j < i ; j++) {
                // j는 ** *** 이렇게 3개씩 출력 해주는 거 3번 돌아야함
                // i가 1이면 1개찍고, 2면 2개를 ln없이 찍고?
                String star = "*";
                System.out.print(star);
            }
            System.out.println();
        }

    }
}
