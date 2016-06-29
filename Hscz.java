/**
 * Created by leyiwo on 2016/6/29.
 */
//Java 中方法的重载
public class Hscz {
    public static void main(String[] args) {

        // 创建对象
        Hscz hello = new Hscz();

        // 调用无参的方法
        hello.print();

        // 调用带有一个字符串参数的方法
        String name = "leyiwo";
        hello.print(name);

        // 调用带有一个整型参数的方法
        int age = 1;
        hello.print(age);
    }

    public void print() {
        System.out.println("无参的print方法");
    }

    public void print(String name) {
        System.out.println("带有一个字符串参数的print方法，参数值为：" + name);
    }

    public void print(int age) {
        System.out.println("带有一个整型参数的print方法，参数值为：" + age);
    }
}
