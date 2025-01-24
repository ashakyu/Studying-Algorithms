package part1.ch01;

import java.util.Scanner;

public class String05 {
    public static void main(String[] args) {
       // 백준 13223 소금 폭탄
        /*
        철수는 화학 시험을 망치고, 애꿎은 화학 선생님에게 복수를하기로 한다.
        철수는 집에서 만든 자동 로봇팔을 선생님의 책상에 숨겨, 선생님이 수업을 시작하려 들어온 순간 숨겨놓은 로봇팔을 이용해 선생님을 혼내주려고한다. 철수는 선생님이 늘 애용하는 물컵에 시간이 되면 로봇팔이 소금을 잔뜩 집어넣도록 프로그램을 짜려고한다.
        철수는 현재시각과 선생님이 언제 컵을 사용할지 시간을 알고있지만, 수 계산에 정말 약해서 로봇팔에 입력해야할 시간 계산을 못한다. 철수가 로봇팔에 알맞은 시간을 입력할수 있도록 도와주자.
        * */

        /*
        * 풀이 방법
        * : 문자를 기준으로 시간 ,분 , 초를 쪼갠다
        * 두 시간 ,분 ,초의 차이를 계산한다.
        * 구해진 시간을 HH:MM:SS 혈태로 출력한다.
        * */
        Scanner scanner = new Scanner(System.in);
        String nowTime = scanner.nextLine();
        String usedCupTime = scanner.nextLine();


        String[] splitNowTime = nowTime.split(":");
        int hour = Integer.parseInt(splitNowTime[0]);
        int minute = Integer.parseInt(splitNowTime[1]);
        int second = Integer.parseInt(splitNowTime[2]);

        String[] splitUsedTime = usedCupTime.split(":");
        int hour2 = Integer.parseInt(splitUsedTime[0]);
        int minute2 = Integer.parseInt(splitUsedTime[1]);
        int second2 = Integer.parseInt(splitUsedTime[2]);

/*        int resultSecond = second2 - second;
        if(resultSecond < 0){
            minute2 -= 1;
            resultSecond = 60 + second2 - second;
        }

        int resultMinute = minute2 - minute;
        if(resultMinute < 0){
            hour2 -= 1;
            resultMinute = 60 + hour2 - hour;
        }

        int resultHour = hour2 - hour;
        if(resultHour < 0){
            resultHour += 24;
        }
        String result = resultHour + ":" + resultMinute + ":" + resultSecond;
        이렇게 시간/ 분 / 초를 나눠서 처리하지 말고 작은 단위인 초로 다 바꾼후 처리한다.
        */

        int currentTime = hour * 3600 + minute * 60 + second;
        int targetTime = hour2 * 3600 + minute2 * 60 + second2;

        int needTime = targetTime - currentTime;

        if(needTime <= 0) {
            needTime += 24 * 3600;
        }

        int needHour = needTime / 3600;
        int needMinute = (needTime % 3600) / 60;
        int needSecond = needTime % 60;

        //각 단위가 한 자리수라면 앞에 0을 붙여야한다.
        System.out.printf("%02d:%02d:%02d\n", needHour, needMinute, needSecond);

    }

}
