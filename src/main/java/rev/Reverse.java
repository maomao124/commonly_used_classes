package rev;

/**
 * Project name(项目名称)：常用类
 * Package(包名): rev
 * Class(类名): Reverse
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/11/9
 * Time(创建时间)： 14:06
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Reverse
{
    public static StringBuffer start(String data)
    {
        StringBuffer ans = new StringBuffer();
        /********** Begin *********/
        String[] str = data.split(" ");
        for (int i= str.length-1;i>=0;i--)
        {
            ans.append(str[i]).append(" ");
        }
        ans.reverse();

        /********** End *********/
        return ans;
    }
}
