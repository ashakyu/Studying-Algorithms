package part1.ch04;

import java.util.Scanner;

public class BruteForce04 {
    /*
    백준 11068 - 회문인 수
    어떤 수를 왼쪽부터 읽어도, 오른쪽부터 읽어도 같을 때 이 수를 회문인 수라고 한다. 예를 들어, 747은 회문인 수이다. 255도 회문인 수인데, 16진수로 표현하면 FF이기 때문이다.
    양의 정수를 입력받았을 때, 이 수가 어떤 B진법 (2 ≤ B ≤ 64)으로 표현하면 회문이 되는 경우가 있는지 알려주는 프로그램을 작성하시오. B진법이란, 한 자리에서 수를 표현할 때 쓸 수 있는 수의 가짓수가 B라는 뜻이다. 예를 들어, 십진법에서 B는 10이다.

    * */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t--> 0){
            int x = sc.nextInt();
            boolean ans = false;

            for(int i = 2; i<=64; i++){
                int[] baseDigit = convertBase(x, i);
                if(isPalindrome(baseDigit)){
                    ans = true;
                    break;
                }
            }
            System.out.println( ans ? "1" : "0");

        }

    }

    public static int[] convertBase(int x, int base){
        int len = 0, copyX = x;
        while(copyX > 0){
            copyX /= base;
            len++;
        }
        int[] digit = new int[len];
        len = 0;
        while(x >0){
           digit[len++] = x % base;
           x = x/base;
        }
        return digit;

    }

    public static boolean isPalindrome(int[] baseDigit){
        for(int i=0; i <baseDigit.length/ 2; i++){
            if(baseDigit[i] != baseDigit[baseDigit.length-i-1]){
                return false;
            }
        }
        return true;
    }

}