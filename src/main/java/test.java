import rev.ReverseTest;
import string_o.Test;
import t6.MathTest;

import java.text.ParseException;

/**
 * Project name(项目名称)：常用类
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/11/9
 * Time(创建时间)： 15:02
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class test
{
    public static void main(String[] args)
    {
        System.out.println("t1:");
        t1.ObjectTest.main(null);
        System.out.println();
        System.out.println("t2");
        t2.WrapperTest.main(null);
        System.out.println();
        System.out.println("t3");
        t3.StringTest.main(null);
        System.out.println();
        System.out.println("t4");
        t4.RandomTest.main(null);
        System.out.println();
        System.out.println("t5:");
        try
        {
            t5.DateTest.main(null);
        }
        catch (ParseException e)
        {
            e.printStackTrace();
        }
        System.out.println();
        System.out.println("t6:");
        MathTest.main(null);
        System.out.println();
        System.out.println();
        Test.main(null);
        System.out.println();
        System.out.println();
        ReverseTest.main(null);
    }
}
