package part1.ch01;

import java.util.Scanner;

public class String02 {
    public static void main(String[] args) {
       // 백준 1919 애너그램 만들기
        /*
        *문제
            두 영어 단어가 철자의 순서를 뒤바꾸어 같아질 수 있을 때, 그러한 두 단어를 서로 애너그램 관계에 있다고 한다. 예를 들면 occurs 라는 영어 단어와 succor 는 서로 애너그램 관계에 있는데, occurs의 각 문자들의 순서를 잘 바꾸면 succor이 되기 때문이다.
            한 편, dared와 bread는 서로 애너그램 관계에 있지 않다. 하지만 dared에서 맨 앞의 d를 제거하고, bread에서 제일 앞의 b를 제거하면, ared와 read라는 서로 애너그램 관계에 있는 단어가 남게 된다.
            두 개의 영어 단어가 주어졌을 때, 두 단어가 서로 애너그램 관계에 있도록 만들기 위해서 제거해야 하는 최소 개수의 문자 수를 구하는 프로그램을 작성하시오. 문자를 제거할 때에는 아무 위치에 있는 문자든지 제거할 수 있다.
        *
        * */
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        int[] countA = new int[26];
        int[] countB = new int[26];

        for(int i = 0; i< str1.length(); i++){
            countA[str1.charAt(i)-'a']++;
        }
        for(int i = 0; i< str2.length(); i++){
            countB[str2.charAt(i)-'a']++;
        }

        int ans = 0;
        for(int i = 0; i < 26; i++){
            if(countA[i] > countB[i]){
                ans += countA[i] - countB[i];
            }else if(countA[i] < countB[i]){
                ans += countB[i] - countA[i];
            }
        }
        System.out.println(ans);
    }
}
