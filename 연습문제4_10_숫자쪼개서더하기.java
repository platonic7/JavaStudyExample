package 자바의정석;

/**
 * Created by JIN on 2016. 6. 26..
 */
public class 연습문제4_10_숫자쪼개서더하기 {
    //int타입의 변수 num 이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라.
    // 만일 변수 num의 값이 12345라면, ‘1+2+3+4+5’의 결과인 15를 출력하라.
    // (1) 에 알맞은 코드를 넣으시오.
    // 정답 : 15
    public static void main(String[] args) {
        int num = 12345;
        int sum = 0;

        //(1) 시작
        while(num > 0) {
            sum += num%10;
            num /= 10;
        }
        //(1) 끝
        System.out.println(sum);
    }
}
