package part1.ch01;

import java.util.Scanner;

public class String03 {
    public static void main(String[] args) {
       // 백준 1157 단어 공부
        /*
            문제
            알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.

            입력
            첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.

            출력
            첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
        * */

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        int count[] = getAlphabetCount(str);

        int maxCount = -1;
        char maxAlphabet = '?';

        for(int i=0; i<count.length; i++) {
            if(count[i] > maxCount) {
                maxCount = count[i];
                maxAlphabet = (char)('A'+i);
            }
            else if(count[i] == maxCount) {
                maxAlphabet = '?';
            }
        }
        System.out.println(maxAlphabet);

    }

    public static int[] getAlphabetCount(String str){
        int[] count = new int[26];

        for(int i = 0; i< str.length(); i++){
            char sh = str.charAt(i);
            if('A' <= sh && sh <= 'Z'){
                count[sh-'A']++;
            }else{
                count[sh-'a']++;
            }
        }
        return count;
    }

}
