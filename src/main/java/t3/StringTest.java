package t3;

import java.util.Scanner;

/**
 * Project name(项目名称)：常用类
 * Package(包名): t3
 * Class(类名): StringTest
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/11/9
 * Time(创建时间)： 14:30
 * Version(版本): 1.0
 * Description(描述)：
 * 编程要求
 * 请仔细阅读右侧代码，根据方法内的提示，在Begin - End区域内进行代码补充，具体任务如下：
 * 编写测试类，输入一个标准的网址，输出其域名的主体；
 * 将该主体转换为大写，打印输出；
 * 具体输出要求请看测试说明。
 * 测试说明
 * 补充完代码后，点击测评，平台会对你编写的代码进行测试，当你的结果与预期输出一致时，即为通过。
 * 测试输入：
 * https://www.educoder.net/
 * 预期输出：
 * educoder
 * EDUCODER
 */

public class StringTest
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //String str = sc.next();
        String str = "https://www.baidu.com/";
        // String substring(int start,int end)
        // 截取字符串，传入的两个参数分别为要截取边界的下标
        // 在java api 中,通常使用两个数字表示范围时,都是含头不含尾,即包含起始下标对应的内容,但不包含结束下标的处对应的内容
        // String toUpperCase() 将当前字符串中的英文部分转换为全大写
        /********* Begin *********/
        int start = str.indexOf("www.") + 4;
        int end = str.indexOf(".com");
        if (end<=-1)
        {
            end=str.indexOf(".net");
        }
        //System.out.println(start +"  "+ end);
        String str1=str.substring(start, end);
        System.out.println(str1);
        System.out.println(str1.toUpperCase());
        /********* End *********/
    }
}
