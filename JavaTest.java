class alpha
{
    String a="Manasi";
    public void fun()
    {
        System.out.println("This is fun"+a);
    }
}
class Beta extends alpha
{
    String b="pushkar";
    public void fun_1()
    {
        System.out.println("This is also fun "+b);
    }
}
/**
 * JavaTest
 */
public class JavaTest {

    public static void main(String[] args) {
        Beta b=new Beta();
        b.fun();
        b.fun_1();
}
}