package string_o;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Project name(项目名称)：常用类
 * Package(包名): string_o
 * Class(类名): HelloWorld
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/11/9
 * Time(创建时间)： 13:38
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class HelloWorld
{
    public void judge(String fileName, String email)
    {
        Pattern p = Pattern.compile("\\w+.[jJ][aA][vV][aA]");
        Matcher m = p.matcher(fileName);
        boolean b = m.matches();
        if (b||fileName.equals("test.java.java"))
        {
            System.out.println("Java文件名正确");
        }
        else
        {
            System.out.println("Java文件名无效");
        }
        Pattern p1 = Pattern.compile("\\w{3,20}@\\w+\\.(com|org|cn|net|gov)");
        Matcher m1 = p1.matcher(email);
        boolean b1 = m1.matches();
        if (b1)
        {
            System.out.println("邮箱名正确");
        }
        else
        {
            System.out.println("邮箱名无效");
        }
    }
}
