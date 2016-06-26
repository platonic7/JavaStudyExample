package 자바의정석;

/**
 * Created by JIN on 2016. 6. 26..
 */
public class 연습문제4_7_MathRandom {
    //Math.random()을 이용해서 1부터 6사이의 임의의 정수를 변수 value에
    // 저장하는 코드를 완성하라. (1)에 알맞은 코드를 넣으시오.
    public static void main(String[] args) {
        // (1)
        int value = (int)(Math.random() * 6 ) + 1;

        System.out.println(value);
    }
}
