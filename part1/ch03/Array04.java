package part1.ch03;

import java.util.Scanner;

public class Array04 {
    /*
    백준  3273 - 두 수의 합
    n개의 서로 다른 양의 정수 a1, a2, ..., an으로 이루어진 수열이 있다. ai의 값은 1보다 크거나 같고, 1000000보다 작거나 같은 자연수이다. 자연수 x가 주어졌을 때, ai + aj = x (1 ≤ i < j ≤ n)을 만족하는 (ai, aj)쌍의 수를 구하는 프로그램을 작성하시오.

    첫째 줄에 수열의 크기 n이 주어진다. 다음 줄에는 수열에 포함되는 수가 주어진다. 셋째 줄에는 x가 주어진다. (1 ≤ n ≤ 100000, 1 ≤ x ≤ 2000000)

    * */
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] h = new int[n];

        for(int i =0; i < n; i++){
            h[i] =sc.nextInt();
        }

        int x =  sc.nextInt();

        boolean[] exist = new boolean[1000001];

        for (int i= 0; i<n; i++){
            exist[h[i]] = true;
        }

        int ans = 0;
        for (int i = 1; i <= (x-1) / 2; i++){
            if(i <=100000 && x- i <= 1000000){
                ans += (exist[i] && exist[x-i]) ? 1 : 0;
            }

        }

        System.out.println(ans);
    }
}
