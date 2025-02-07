package part1.ch04;

import java.util.Scanner;

public class BruteForce03 {
    /*
    백준 11005 - 진법 변환2
    10진법 수 N이 주어진다. 이 수를 B진법으로 바꿔 출력하는 프로그램을 작성하시오.

    10진법을 넘어가는 진법은 숫자로 표시할 수 없는 자리가 있다. 이런 경우에는 다음과 같이 알파벳 대문자를 사용한다.

    A: 10, B: 11, ..., F: 15, ..., Y: 34, Z: 35


    int -> 10진법
    2진수 - Binary
    8진수 - Octal
    16진수 - Hex
    * */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int decimal = sc.nextInt();
        int base = sc.nextInt();


        StringBuilder sb = new StringBuilder();

        while (decimal > 0) {
            int temp = decimal % base;
            if (temp >= 10) { // 10 이상일 때 A~Z로 변환
                sb.append((char) (temp - 10 + 'A'));
            } else {
                sb.append((char) (temp + '0')); // 0~9는 문자로 변환
            }
            decimal /= base;
        }

        System.out.println(sb.reverse().toString());
    }

}