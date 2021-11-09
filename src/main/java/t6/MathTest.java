package t6;

import java.util.Scanner;

/**
 * Project name(项目名称)：常用类
 * Package(包名): t6
 * Class(类名): MathTest
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/11/9
 * Time(创建时间)： 14:55
 * Version(版本): 1.0
 * Description(描述)： 编写测试类MathTest，输入4个int类型数值，7个double类型数值；
 * 分别输出第一个数的平方根，第二个数的立方根，第三个数的第四个数次方，
 * 第五个数和第六个数的最大值、最小值，第七个数的绝对值，第八个数的ceil值，第九个数的floor值，第十个数的rint值，第十一个数的round值。
 * 测试说明
 * 补充完代码后，点击测评，平台会对你编写的代码进行测试，当你的结果与预期输出一致时，即为通过。
 * 测试输入：
 * 25
 * 27
 * 4
 * 3
 * 3.5
 * 5.5
 * -8.8
 * 10.8
 * 9.6
 * 10.62
 * 11.51
 * 预期输出：
 * 5.0
 * 3.0
 * 64.0
 * 5.5
 * 3.5
 * 8.8
 * 11.0
 * 9.0
 * 11.0
 * 12
 */

public class MathTest
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();
        int a4 = sc.nextInt();
        double a5 = sc.nextDouble();
        double a6 = sc.nextDouble();
        double a7 = sc.nextDouble();
        double a8 = sc.nextDouble();
        double a9 = sc.nextDouble();
        double a10 = sc.nextDouble();
        double a11 = sc.nextDouble();
        /********* Begin *********/
        //分别输出第一个数的平方根，第二个数的立方根，第三个数的第四个数次方，第五个数和第六个数的最大值、最小值，
        //第七个数的绝对值，第八个数的ceil值，第九个数的floor值，第十个数的rint值，第十一个数的round值。
        System.out.println(Math.sqrt(a1));
        System.out.println(Math.cbrt(a2));
        System.out.println(Math.pow(a3, a4));
        System.out.println(Math.max(a5, a6));
        System.out.println(Math.min(a5, a6));
        System.out.println(Math.abs(a7));
        System.out.println(Math.ceil(a8));
        System.out.println(Math.floor(a9));
        System.out.println(Math.rint(a10));
        System.out.println(Math.round(a11));

        /********* End *********/
    }
}
