package part1.ch01;

import java.util.Scanner;

public class String04 {
    public static void main(String[] args) {
       // 백준 1543 문서 검색
        /*
            문제
            세준이는 영어로만 이루어진 어떤 문서를 검색하는 함수를 만들려고 한다. 이 함수는 어떤 단어가 총 몇 번 등장하는지 세려고 한다. 그러나, 세준이의 함수는 중복되어 세는 것은 빼고 세야 한다.
            예를 들어, 문서가 abababa이고, 그리고 찾으려는 단어가 ababa라면, 세준이의 이 함수는 이 단어를 0번부터 찾을 수 있고, 2번부터도 찾을 수 있다. 그러나 동시에 셀 수는 없다.
            세준이는 문서와 검색하려는 단어가 주어졌을 때, 그 단어가 최대 몇 번 중복되지 않게 등장하는지 구하는 프로그램을 작성하시오.
        * */

        /*
        * 풀이 방법
        * 문서의 첫 글자부터 순회한다.
        * 문서의 지금 글자부터 주어진 단어와 한글자씩 비교한다.
        * 단어와 완전히 일치하면 개수를 올린다.
        * 해당 안어가 등장한 이후부터 반복한다.
        *
        * 단어와 매치되지 않았다면 다음 글자에서 2를 반보간다.
        * */
        Scanner scanner = new Scanner(System.in);
        String doc = scanner.nextLine();
        String word = scanner.nextLine();

        int count =0;
        int startIndex = 0;

        while(true){
            int findIndex = doc.indexOf(word, startIndex);
            if(findIndex < 0) {
                break;
            }
            startIndex = findIndex+word.length();
            count ++;
        }

        System.out.println(count);

    }

}
