package 자바의정석;

/**
 * Created by JIN on 2016. 6. 26..
 */
public class 연습문제4_12_구구단 {
    // 구구단 만들기
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 3; j++) {
                int x = j + 1 + (i - 1) / 3 * 3;
                int y = i % 3 == 0 ? 3 : i % 3;

                if (x > 9) break;

                System.out.print(x + "*" + y + "=" + x * y + "\t");
            }
            System.out.println();
            if (i%3==0) {
                System.out.println();
            }
        }

    }
}
