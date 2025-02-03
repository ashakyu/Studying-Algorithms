package part1.ch03;

import java.io.*;
public class Array03 {
    /*
    백준  10989 - 수 정렬하기 3
    N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.

    * N은 10,000,000까지 -> 시간 초과에 주의
    첫째 줄에 수의 개수 N(1 ≤ N ≤ 10,000,000)이 주어진다. 둘째 줄부터 N개의 줄에는 수가 주어진다. 이 수는 10,000보다 작거나 같은 자연수이다.

    * */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] cnt = new int[10001];
        for(int i= 0; i< n; i++){
            cnt[Integer.parseInt(br.readLine())]++;
        }

        for(int i =1; i<=10000; i++){
            while(cnt[i]-- > 0){
                bw.write(i + "\n");
            }
        }

        bw.flush();
    }
}
