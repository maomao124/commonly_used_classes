package t2;

import java.util.Scanner;

/**
 * Project name(项目名称)：常用类
 * Package(包名): t2
 * Class(类名): WrapperTest
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/11/9
 * Time(创建时间)： 14:16
 * Version(版本): 1.0
 * Description(描述)：
 * 请仔细阅读右侧代码，根据方法内的提示，在Begin - End区域内进行代码补充，具体任务如下：
 * 编写测试类，输入int型值aa传递给Integer类对象a，String型值bb传递给Integer类对象b，输入int型值c，aa、bb、c对应的数值相等；
 * 输入String型值str11传递给String类对象str1，输入String型值str22传递给String类对象str2，str1和str2对应的内容相同；
 * 打印输出a == b、a == c、b == c、a.equals(b)；
 * 打印输出str1 == str2、str1.equals(str2)。
 * 测试说明
 * 补充完代码后，点击测评，平台会对你编写的代码进行测试，当你的结果与预期输出一致时，即为通过。
 * 测试输入：
 * 100
 * 100
 * 100
 * educoder
 * educoder
 * 预期输出：
 * false
 * true
 * true
 * true
 * false
 * true
 */

public class WrapperTest
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int aa = sc.nextInt();
        String bb = sc.next();
        int c = sc.nextInt();
        String str11 = sc.next();
        String str22 = sc.next();
        // 包装类中“==”与equals的用法比较
        // 值得注意的是，包装类中的equals方法和String类一样，都是重写了Object类中的equals方法，因此比较的是内容而不是地址，
        // 而“==”比较的依然是引用变量的地址，只是当包装类型和与之相对应的基本类型进行“==”比较时会先做自动拆箱处理。
        /********* Begin *********/
        //编写测试类，输入int型值aa传递给Integer类对象a，String型值bb传递给Integer类对象b，输入int型值c，aa、bb、c对应的数值相等；
        Integer a=new Integer(aa);
        Integer b=new Integer(bb);
        //输入String型值str11传递给String类对象str1，输入String型值str22传递给String类对象str2，str1和str2对应的内容相同；
        String str1 = str11;
        String str2 = str22;
        //打印输出a == b、a == c、b == c、a.equals(b)；
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(b == c);
        System.out.println(a.equals(b));
        //打印输出str1 == str2、str1.equals(str2)。
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        /********* End *********/
    }
}
