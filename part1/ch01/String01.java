package part1.ch01;

import java.util.Scanner;

public class String01 {
    /*
    * 한 번 인스턴스가 생성되면 수정할 수 없다. String Class
    * -> 원소에 접근하고 싶으면 해당 인색스의 값을 받아온다. charAt(n) 접근만 가능하지 변경은 가능하다
    * 덮어쓰기 등으로 새로운 String을 만든다.
    *
    * StringBuilder 등도 있다.
    * == 로 문자열 비교는 불가능하다. Object Class는 주소값을 비교하기 때문에 서로 다른 값이다.
    *
    * 1. 리터럴 생성
    * String a = "test"
    * String b = "test"
    *
    * 2. new로 생성 Obejct String
    * String c = new String("c");
    * String d = new String("c");
    *
    * 1번은 constant String pool에서 확인하고 저장한다
    * 2번은 Heap에 저장한다 (Constant String pool을 확인하지 않음)
    *
    * 리터럴간의 비교는 같은 주소값을 바라보기 때문에 만약 a == b 를 하면 true가 나온다.
    * 만약 리터럴과 오브젝트를 비교하면 주소값이 다르기 떄문에 false
    * 두 오브젝트를 비교하면 주소값이 다르다 false
    *
    * 문자열을 비교하려면 .equals()로 비교한다.
    * */
    public static void main(String[] args) {
       // 백준 2744 대소문자 바꾸기

        /*
        *문제
        영어 소문자와 대문자로 이루어진 단어를 입력받은 뒤, 대문자는 소문자로, 소문자는 대문자로 바꾸어 출력하는 프로그램을 작성하시오.

        입력
        첫째 줄에 영어 소문자와 대문자로만 이루어진 단어가 주어진다. 단어의 길이는 최대 100이다.

        출력
        첫째 줄에 입력으로 주어진 단어에서 대문자는 소문자로, 소문자는 대문자로 바꾼 단어를 출력한다.
        * */

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        StringBuilder result = new StringBuilder();

        // 어떻게 대, 소문자를 판별할 수 있을까 ? -> 아스키 코드

        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);

            if('A' <= c && c <= 'Z'){
                result.append((char)('a' + c - 'A')); // 소문자로 변환하여 추가
            }else {
                result.append((char)('A' + c - 'a')); // 대문자로 변환하여 추가
            }
        }
        System.out.println(result.toString());

    }
}
