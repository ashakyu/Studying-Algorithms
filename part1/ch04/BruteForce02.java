package part1.ch04;

import java.util.Scanner;

public class BruteForce02 {
    /*
    백준 10448 - 유레카 이론
    삼각수 Tn(n ≥ 1)는 [그림]에서와 같이 기하학적으로 일정한 모양의 규칙을 갖는 점들의 모음으로 표현될 수 있다.

    자연수 n에 대해 n ≥ 1의 삼각수 Tn는 명백한 공식이 있다.

    Tn = 1 + 2 + 3 + ... + n = n(n+1)/2

    1796년, 가우스는 모든 자연수가 최대 3개의 삼각수의 합으로 표현될 수 있다고 증명하였다. 예를 들어,

    4 = T1 + T2
    5 = T1 + T1 + T2
    6 = T2 + T2 or 6 = T3
    10 = T1 + T2 + T3 or 10 = T4
    이 결과는 증명을 기념하기 위해 그의 다이어리에 “Eureka! num = Δ + Δ + Δ” 라고 적은것에서 유레카 이론으로 알려졌다. 꿍은 몇몇 자연수가 정확히 3개의 삼각수의 합으로 표현될 수 있는지 궁금해졌다. 위의 예시에서, 5와 10은 정확히 3개의 삼각수의 합으로 표현될 수 있지만 4와 6은 그렇지 않다.

    자연수가 주어졌을 때, 그 정수가 정확히 3개의 삼각수의 합으로 표현될 수 있는지 없는지를 판단해주는 프로그램을 만들어라. 단, 3개의 삼각수가 모두 달라야 할 필요는 없다.

    * */

    static boolean[] isEureakNumber = new boolean[1001];
    public static void preprocess(){
        int[] triangleNumbers = new int[50];
        int triangleNumberCount = 0;

        for(int i = 1; ; i++){
            int triangleNumber = i * ( i + 1 ) / 2;
            if(triangleNumber >= 1000) break;
            triangleNumbers[triangleNumberCount++] = triangleNumber;
        }

        //삼각 수 세개의 합으로 K를 구할 수 있는지 -> 3중 반복문에서 2중 반목문으로 수정
        boolean[] isSumOfTriangleNumber = new boolean[1000];
        for(int i =0; i<triangleNumberCount; i++){
            for(int j =0; j<triangleNumberCount; j++){
                int sum =triangleNumbers[i] + triangleNumbers[j];
                if(sum <1000) isSumOfTriangleNumber[sum] = true;
            }
        }

        for(int i=0; i <1000; i++){
            if(!isSumOfTriangleNumber[i]) continue;
            for(int j=0; j <triangleNumberCount; j++){
                int sum = i + triangleNumbers[j];
                if(sum <= 1000) isEureakNumber[sum] = true;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        preprocess();
        int t = sc.nextInt();

        while(t-- >0){
            int k = sc.nextInt();
            System.out.println(isEureakNumber[k] ? "1" : "0");
        }

    }


}
