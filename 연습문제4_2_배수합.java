package 자바의정석;

/**
 * Created by JIN on 2016. 6. 26..
 */
public class 연습문제4_2_배수합 {
    public static void main(String[] args) {
        // 연습문제 4-2
        //1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오
        // 정답 : 73
        int sum = 0;

        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0 && i % 3 != 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
