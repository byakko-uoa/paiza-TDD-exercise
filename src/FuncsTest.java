import java.util.Scanner;

/**
 * Created by sansuke05
 */

import static org.junit.Assert.*;


// テスト用クラス
public class FuncsTest {
    private static final String MSG = "assart error! index:";

    private static Funcs t = new Funcs();

    static void testInputNums(Scanner s){

        int[] testNum = t.inputNums(s,5);

        assertEquals(MSG + "0", testNum[0],3);
        assertEquals(MSG + "1", testNum[1],5);
        assertEquals(MSG + "2", testNum[2],19);
        assertEquals(MSG + "3", testNum[3],1);
        assertEquals(MSG + "4", testNum[4],2);
    }

    static void testSort(){
        int[] nums = new int[]{ 3, 5, 19, 1, 2};

        int[] result = t.sort(nums);

        assertEquals(MSG + "0", result[0],1);
        assertEquals(MSG + "1", result[1],2);
        assertEquals(MSG + "2", result[2],3);
        assertEquals(MSG + "3", result[3],5);
        assertEquals(MSG + "4", result[4],19);
    }

    static void testPrintNums(){
        int[] nums = new int[]{ 3, 5, 19, 1, 2};

        t.printNums(nums);
    }

    public static void main(String[] args) {

        System.out.println("choose test function\ninputNums:1 sort:2 printNums:3");
        Scanner s = new Scanner(System.in);

        switch (s.nextInt()){
            case 1:
                System.out.println("chose inputNums function test");
                testInputNums(s);
                break;
            case 2:
                System.out.println("chose sort function test");
                testSort();
                break;
            case 3:
                System.out.println("chose printNums function test");
                testPrintNums();
                break;
            default:
                break;
        }
    }
}