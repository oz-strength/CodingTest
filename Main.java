import java.util.Random;
import java.util.Scanner;
//정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.
public class Main {

    public static double solution(int[] numbers) {  // 인스턴스 메서드 생성
        int sum = 0;
        double average = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        average = sum / (double) numbers.length;
        return average;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        Main test = new Main();     // 클래스 객체 생성
        double c = solution(numbers);
        System.out.println(c);

    }

}





