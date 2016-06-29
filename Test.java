import java.util.Arrays;

/**
 * Created by leyiwo on 2016/6/29.
 */
public class Test {
    //完成 main 方法
    public static void main(String[] args) {

        int[] scores = {89, -23, 64, 91, 119, 52, 73};
        System.out.println("考试前三名");
        Test hello = new Test();
        hello.myResort(scores);
    }

    //定义方法完成成绩排序并输出前三名的功能
    public void myResort(int[] scores) {
        Arrays.sort(scores);
        int temp = 0;
        for (int i = scores.length - 1; i > 0; i--) {
            if (scores[i] < 0 || scores[i] > 100) {
                continue;
            }
            temp++;
            if (temp > 3) {
                break;
            }
            System.out.println(scores[i]);
        }
    }

}
