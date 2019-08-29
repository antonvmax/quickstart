package pro.antonmax;

/**
 * Hello world!
 */
public class App
{
    public static void main(String[] args)
    {
        System.out.println("Hello World!");

        App app = new App();
        System.out.println(app.helloMethod());
    }

    public String helloMethod()
    {
        return "Hi there!";
    }
}
