package t4;

import java.util.Random;
import java.util.Scanner;

/**
 * Project name(项目名称)：常用类
 * Package(包名): t4
 * Class(类名): RandomTest
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/11/9
 * Time(创建时间)： 14:40
 * Version(版本): 1.0
 * Description(描述)：
 * 设计一个密码的自动生成器：密码由大写字母/小写字母/数字组成，生成六位随机密码。
 * 分别以1、2、3作为种子数创建Random对象，生成六位随机密码进行测试。
 * 具体输出要求请看测试说明。
 * 测试说明
 * 补充完代码后，点击测评，平台会对你编写的代码进行测试，当你的结果与预期输出一致时，即为通过。
 * 测试输入：
 * 1
 * 预期输出：
 * NAvZuG
 */

public class RandomTest
{
    public static void main(String[] args)
    {
        // 定义一个字符型数组
        char[] pardStore = new char[62];
        // 把所有的大写字母放进去 把所有的小写字母放进去 把0到9放进去
        /********* Begin *********/
        for (int i = 0; i < 26; i++)
        {
            pardStore[i] = (char) ('A' + i);
            pardStore[26 + i] = (char) ('a' + i);
        }
        for (int i = 0; i < 10; i++)
        {
            pardStore[52 + i] = (char) ('0' + i);
        }
        /********* End *********/
        // 分别以1、2、3作为种子数 生成6位随机密码
        Scanner sc = new Scanner(System.in);
        int seed = sc.nextInt();
        /********* Begin *********/
        Random random = new Random(seed);
        int[] arr = random.ints(6, 0, 62).toArray();//生成六个0~62范围的整数
        String str = "";
        for (int i = 0; i < 6; i++)
        {
            str += pardStore[arr[i]];
        }
        System.out.print(str);
        /********* End *********/
    }
}
