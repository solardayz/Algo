package brute;

public class SNM {

    static int N;
    static int M;
    static int[] selected;

    StringBuffer sb = new StringBuffer();

    public static void main(String[] args) {
        input();
//        System.out.println("N+\" , \"+M+\" , \"+selected.length = " + N+" , "+M+" , "+selected.length);
        process(1);

        for (int j = 1; j <= M; j++) {
            System.out.println(selected[j]);
        }
    }

    private static void process(int i) {
        if (i == M + 1) {
        } else {
            for (int j = 1; j <= N; j++) {
                selected[i] = j;

                System.out.println("j:"+j+" , i:"+i);
            }
        }
    }

    private static void input() {
        N = 2;
        M = 1;
        selected = new int[M + 1];
    }
}
