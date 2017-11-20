
import java.util.Scanner;

/**
 * @author sansuke05
 * @version 1.0
 */

public class Funcs {
    // 整数入力
    /**
     * inputNumsメソッド
     * パラメータnの数だけループし標準入力を受け取る
     * @param n 数値
     * @param s Scannerオブジェクト
     * @return 読み込んだ整数を返すint型の配列
     */
    int[] inputNums(Scanner s, int n){

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = s.nextInt();
        }

        return nums;
    }

    // 昇順にソート
    /**
     * sortメソッド
     * バブルソートで昇順にソート
     * @param nums 整数の配列
     * @return ソート済みの整数配列
     */
    int[] sort(int[] nums){

        for (int i = 0; i < nums.length; i++){
            for (int j = nums.length-1; j > i; j--){
                if (nums[j-1] > nums[j]) {
                    int tmp = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j] = tmp;
                }
            }
        }

        return nums;
    }

    // ソートした整数を出力
    /**
     * printNumsメソッド
     * ソート済みの整数を１行ずつ出力
     * @param nums ソート済みの整数配列
     */
    void printNums(int[] nums){

        for (int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }
    }
}