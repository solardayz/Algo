package loop;

import java.util.ArrayList;

public class Receipt {
    public static void main(String[] args) {
        int a = 50000;
        int b = 4;
        String c = "1000 5";
        String d = "10000 1";
        String e = "2000 2";
        String f = "3000 5";
        ArrayList<String> str = new ArrayList<>();
        str.add(c);
        str.add(d);
        str.add(e);
        str.add(f);

        int sum = 0;
        for (int i = 0; i < b; i++) {
            String[] sp = str.get(i).split(" ");
            sum += Integer.parseInt(sp[0]) * Integer.parseInt(sp[1]);
            System.out.println(sp[0]+" x "+sp[1]+" = "+Integer.parseInt(sp[0]) * Integer.parseInt(sp[1]));
        }
        System.out.println("sum = " + sum);
    }
}
