package brute;

/**
 *
 * N과 M(3) https://www.acmicpc.net/problem/15651
 * 문제
 * 자연수 N과 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.
 *
 * 1부터 N까지 자연수 중에서 M개를 고른 수열
 * 같은 수를 여러 번 골라도 된다.
 * 입력
 * 첫째 줄에 자연수 N과 M이 주어진다. (1 ≤ M ≤ N ≤ 7)
 *
 * 출력
 * 한 줄에 하나씩 문제의 조건을 만족하는 수열을 출력한다. 중복되는 수열을 여러 번 출력하면 안되며, 각 수열은 공백으로 구분해서 출력해야 한다.
 *
 * 수열은 사전 순으로 증가하는 순서로 출력해야 한다.
 * */

public class S15651 {

    static StringBuffer sb = new StringBuffer();
    static int N,M;
    static int[] selected;

    public static void main(String[] args) {
        input();
        recFunc(1);
        System.out.println(sb.toString());

//        System.out.println(" === ");
//        for (int num : selected) {
//            System.out.println("num = " + num);
//        }
    }

    private static void input() {
        N = 3;
        M = 2;
        selected = new int[M+1];
    }

    private static void recFunc(int i) {
        if (i == M+1) {
            for (int j = 1; j <= M; j++) {
                System.out.println(j+" selected[j] = " + selected[j]);
                sb.append(selected[j]).append(" ");
            }
            sb.append("\n");
        }else {
            for (int cand = 1; cand <= N; cand++) {
                selected[i] = cand;
                System.out.println("전selected = " + i+ " ,  "+cand);
                recFunc(i + 1);
                selected[i] = 0;
                System.out.println("후selected = " + i+ " ,  "+cand);
            }
        }
    }
}
