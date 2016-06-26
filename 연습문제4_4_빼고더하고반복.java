package 자바의정석;

/**
 * Created by JIN on 2016. 6. 26..
 */
public class 연습문제4_4_빼고더하고반복 {
    public static void main(String[] args) {
//1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때,
// 몇까지 더해야 총합이 100이상이 되는지 구하시오.
// 정답 : 199
        int sum = 0; // 총합을 저장할 변수
        int s = 1; // 값의 부호를 바꿔주는데 사용하는 변수
        int num = 0;

        for (int i = 1; sum < 100; i++, s = -s) {
            num = i * s; // 부호 바꾸기
            sum += num;
        }

        System.out.println(num);
        System.out.println(sum);
    }
}
