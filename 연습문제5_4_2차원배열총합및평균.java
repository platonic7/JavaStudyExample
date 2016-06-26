package 자바의정석;

/**
 * Created by JIN on 2016. 6. 26..
 */
public class 연습문제5_4_2차원배열총합및평균 {
    // 실행결과
    // total=325
    // average=16.25
    public static void main(String[] args) {
        int[][] arr = {
                {5, 5, 5, 5, 5},
                {10, 10, 10, 10, 10},
                {20, 20, 20, 20, 20},
                {30, 30, 30, 30, 30}
        };

        int total = 0;
        float average = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                total += arr[i][j];
            }
        }
        average = total / (float) (arr.length * arr[0].length);
        System.out.println("total=" + total);
        System.out.println("average=" + average);
    }
}
