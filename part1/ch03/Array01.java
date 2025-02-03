package part1.ch03;

import java.util.Scanner;

public class Array01 {
    /*
    백준 1236 번 성 지키기
    영식이는 직사각형 모양의 성을 가지고 있다. 성의 1층은 몇 명의 경비원에 의해서 보호되고 있다.
    영식이는 모든 행과 모든 열에 한 명 이상의 경비원이 있으면 좋겠다고 생각했다.
    성의 크기와 경비원이 어디있는지 주어졌을 때, 몇 명의 경비원을 최소로 추가해야 영식이를 만족시키는지 구하는 프로그램을 작성하시오.

    * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        char[][] map = new char[n][m];

        for(int i = 0; i< n; i++)
            map[i] = sc.next().toCharArray();

            //1. 각 행 /열에 대해 경비원이 있는지 확인하다.
            int existRowCount = 0;
            for(int i =0; i < n; i++){
                boolean exist = false;
                for(int j = 0; j < m; j++){
                    if(map[i][j] =='X'){
                        exist = true;
                        break;
                    }
                }
                if(exist) existRowCount++;
            }

        int existColCount = 0;
        for(int i =0; i < m; i++){
            boolean exist = false;
            for(int j = 0; j < n; j++){
                if(map[j][i] =='X'){
                    exist = true;
                    break;
                }
            }
            if(exist) existColCount++;
        }
            int needRowCount = n - existRowCount;
            int needColCount = m - existColCount;
            System.out.println(Math.max(needRowCount, needColCount));

    }
}
