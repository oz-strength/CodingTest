import java.util.Random;
import java.util.Scanner;

public class Main {
//    머쓱이네 양꼬치 가게는 10인분을 먹으면 음료수 하나를 서비스로 줍니다.
//    양꼬치는 1인분에 12,000원, 음료수는 2,000원입니다.
//    정수 n과 k가 매개변수로 주어졌을 때,
//    양꼬치 n인분과 음료수 k개를 먹었다면 총얼마를 지불해야 하는지
//    return 하도록 solution 함수를 완성해보세요.
    public static int solution(int n, int k) {
        int x = 12000;
        int y = 2000;



        for (int i = 1; i < n+1; i++) { // 0을 10으로 나눠도 나머지가 0이여서 n=10/k=3이 틀렸다.
            if (i % 10 == 0) {
                k --;
            }
        }

        int sum = x * n + y * k;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(solution(10,3 ));
        System.out.println(solution(64,6 ));
    }

}





