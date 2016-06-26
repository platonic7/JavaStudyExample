package 자바의정석;

/**
 * Created by JIN on 2016. 6. 26..
 */
public class 연습문제4_9_문자열쪼개서더하기 {
//숫자로 이루어진 문자열 str이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코 드를 완성하라.
// 만일 문자열이 "12345"라면, ‘1+2+3+4+5’의 결과인 15를 출력이 출력되 어야 한다.
// (1)에 알맞은 코드를 넣으시오.
// 정답 : 15

    public static void main(String[] args) {
        String str = "12345";
        int sum =0;
        for (int i=0; i < str.length(); i++) {
            // (1) 부분 시작
            sum += str.charAt(i) - '0';
            // (1) 부분 끝
        }
        System.out.println(sum);
    }
}
// 뺄셈과 같은 이항연산자는 int타입보다 작은 타입은 피연산자(byte, short, char)은 int 로 변환한다.
// 그래서 '3'-'0'은 51 - 48으로 변환되고 그 결과는 숫자 3이 된다.

