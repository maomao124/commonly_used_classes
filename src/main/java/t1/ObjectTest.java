package t1;

import java.util.Scanner;

/**
 * Project name(项目名称)：常用类
 * Package(包名): t1
 * Class(类名): ObjectTest
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/11/9
 * Time(创建时间)： 13:29
 * Version(版本): 1.0
 * Description(描述)：
 * 输出结果：
 * Dog [age=20, name=jack]
 * Dog [age=20, name=jack]
 * 两个对象是相同的
 * equals() 和 == 的区别：
 * 在Java中，任何类型的数据都可以用 “==”进行比较是不是相等，一般用于基本数据类型的比较，比较器存储的值是否相等。
 * 但是如果用于引用类型的比较，则是比较所指向对象的地址是否相等，在这点上，跟object类提供的equals()方法的作用是一致的。
 * 对于equals()方法
 * 首先，不能用于基本数据类型的变量之间的比较相等；
 * 如果没有对equals方法进行重写，则比较的是引用类型的变量所指向的对象的地址；
 * 诸如String、Date等类都对equals方法进行了重写，比较的是所指向的对象的内容。
 * 请仔细阅读右侧代码，根据方法内的提示，在Begin - End区域内进行代码补充，具体任务如下：
 * Demo类和Person类已经写好，在测试类中创建Demo类对象d1，传入输入值num1， d1调用toString方法并打印输出该值；
 * 创建Demo类对象d2，同样传入输入值num1，打印判断d1和d2是否相等（实际是比较地址）；
 * 创建Person类对象p，传入输入值num2，打印判断d1和p是否相等（实际是比较地址）；
 * 测试说明
 * 补充完代码后，点击测评，平台会对你编写的代码进行测试，当你的结果与预期输出一致时，即为通过。
 * 测试输入：
 * 100
 * 100
 * 预期输出：
 * Demo:100
 * true
 * false
 */

public class ObjectTest
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        // 在测试类中创建Demo类对象d1，传入输入值num1， d1调用toString方法并打印输出该值
        // 创建Demo类对象d2，同样传入输入值num1，打印判断d1和d2是否相等（实际是比较地址）
        /********* Begin *********/
        Demo d1 = new Demo(num1);
        String str = d1.toString();
        System.out.println(str);
        Demo d2 = new Demo(num1);
        System.out.println(d1.equals(d2));
        /********* End *********/
        // 创建Person类对象p，传入输入值num2，打印判断d1和p是否相等（实际是比较地址）
        /********* Begin *********/
        Person p = new Person(num2);
        System.out.println(d1.equals(p));
        /********* End *********/
    }
}

class Demo
{
    private int num;

    public Demo(int num)
    {
        this.num = num;
    }

    public boolean equals(Object obj) // Object obj = new Demo()
    {
        if (!(obj instanceof Demo)) // 判断obj是否和Demo是同类
        {
            return false;
        }
        Demo d = (Demo) obj; // 将父类的引用(Object)向下转换为子类(Demo)
        return this.num == d.num;
    }

    public String toString()
    {
        return "Demo:" + num; // 返回对象的值（每一个对象都有自己的特定的字符串）
    }
}

class Person
{
    private int num;

    public Person(int num)
    {
        this.num = num;
    }
}