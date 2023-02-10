import java.util.Scanner;

public class Main {
    // 어떠한 수 N 이 1이 될때까지 두 과정중 하나를 반복적으로 선택 후 수행
    // 두번째 연산은 N이 K로 나누어 떨어질 때만 선택
    // 1. N 에서 1을 뺀다
    // 2. N을 K로 나눈다
    public static int solution(int N, int K) {
        int turn = 0;
        while (true){
           if (N % K == 0) {
               N = N / K;
               turn ++;
           } else {
               N = N - 1;
               turn ++;
           }
            if (N == 1){
               break;
           }
        }
        return turn;
        }

    public static void main(String[] args) {
        System.out.println(solution(30,4));

    }


}