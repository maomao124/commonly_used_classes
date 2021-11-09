package t5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Project name(项目名称)：常用类
 * Package(包名): t5
 * Class(类名): DateTest
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/11/9
 * Time(创建时间)： 14:48
 * Version(版本): 1.0
 * Description(描述)： 编写测试类，算一下你的出生日期到2020年10月1日总共有多少天；
 * 测试输入：
 * 1999-09-01
 * 预期输出：
 * 你的出生日期距离2020年10月1日:7701天
 */

public class DateTest
{
    public static void main(String[] args) throws ParseException
    {
        // 键盘录入你的出生年月日 格式为yyyy-MM-dd
        // 把该字符串转换为一个日期
        // 通过该日期得到一个毫秒值
        // 获取2020年10月1日的毫秒值
        // 两者想减得到一个毫秒值
        // 把该毫秒值转换为天 打印输出
        Scanner sc = new Scanner(System.in);
        //String line = sc.nextLine();
        String line="1994-01-01";
        /********* Begin *********/
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = sdf.parse(line);
        Date date2 = sdf.parse("2020-10-01");
        long a = date2.getTime() - date1.getTime();
        System.out.println("你的出生日期距离2020年10月1日:" + a / 1000 / 3600 / 24 + "天");

        /********* End *********/
    }
}
