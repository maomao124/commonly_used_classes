package string_o;

import java.util.Scanner;

/**
 * Project name(项目名称)：常用类
 * Package(包名): string_o
 * Class(类名): Test
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/11/9
 * Time(创建时间)： 13:38
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test
{
    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        Scanner sc = new Scanner(System.in);
        String fileName = sc.next();
        String email = sc.next();
        helloWorld.judge(fileName, email);
    }
}
