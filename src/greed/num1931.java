package greed;

import java.util.*;

/*
최대한 많은 회의실을 사용하기 위해서는 짧은 회의시간을 갖는 타임을 먼저 선택해야한다.
겹치는 시간대가 있는경우 종료되는 시간을 기준으로
회의시간이 짧은걸 선택한다.
그리디 알고리즘은 현재 시점에서 최적의 선택을 하면 전체에서도 최적의 결과를 얻을 수 있다는 알고리즘이다.
그렇다면 이 문제에서 현재 시점에서 최적의 선택은 종료시간이 가장 빠른 회의를 선택해야 남은 시간을 최대로 확보 할 수 있다.
 */
class MeetingRoom implements Comparable<MeetingRoom>{
    int startTime;
    int finishTime;

    public MeetingRoom(int startTime, int finishTime) {
        this.startTime = startTime;
        this.finishTime = finishTime;
    }

    @Override
    public String toString() {
        return "MeetingRoom " +
                "startTime=" + startTime +
                ", finishTime=" + finishTime ;
    }

    @Override
    public int compareTo(MeetingRoom o2) {
        /*
        종료시간이 같을 경우 시작시간이 종료시간과 가까운 시간이 곧 사용시간이 짧은 것을 의미한다.
        차이를 구해서 음수가 나올경우 this가 사용시간이 긴것이고
        양수가 나올경우 this가 사용시간이 짧을것이다.
        종료시간이 같지 않을 경우에는 종료시간이 가장 짧은 것이 나머지 시간의 극대화 하여 최적의 해를 찾게 해준다.
         */
        if(this.finishTime == o2.finishTime) return this.startTime - o2.startTime;
        return finishTime - o2.finishTime;
    }
}
public class num1931 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        MeetingRoom[] mr = new MeetingRoom[N];

        for(int i=0; i<N; i++) {
            int startTime = sc.nextInt();
            int finishTime = sc.nextInt();
            mr[i] = new MeetingRoom(startTime,finishTime);
        }
        for(MeetingRoom m : mr){
            System.out.println(m.toString());
        }
        Arrays.sort(mr);
        System.out.println("----------------------------------------------");
        for(MeetingRoom m : mr){
            System.out.println(m.toString());
        }
    }
}
