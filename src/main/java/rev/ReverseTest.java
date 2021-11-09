package rev;

import java.util.Scanner;

/**
 * Project name(项目名称)：常用类
 * Package(包名): rev
 * Class(类名): ReverseTest
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/11/9
 * Time(创建时间)： 14:05
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class ReverseTest
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        //String data = scanner.nextLine();
        String data="oT eb ro ton ot eb";
        StringBuffer ans = new StringBuffer(Reverse.start(data));
        System.out.println(ans);
    }
}
