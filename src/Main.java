
/**
 * @author sansuke05
 * @version 1.0
 */

import java.util.*;


public class Main {
    public static void main(String[] args) {

        Funcs t = new Funcs();

        // 総数入力
        Scanner sc1 = new Scanner(System.in);
        int n = sc1.nextInt();

        // 整数入力
        int[] ni = t.inputNums(sc1, n);

        // 昇順にソート
        int[] sorted_ni = t.sort(ni);

        // ソートした整数を出力
        t.printNums(sorted_ni);
    }
}