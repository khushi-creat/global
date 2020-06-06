public class Global
{
    int a = 10;//global instanse variable
    int b =20;//global instense variable
    int ans;//global instence variable
    public void add ()//instance method
    {
       ans = a+b;
        System.out.println("a+b" +ans); //global instance variable
    }
    public static void main (String[] args)
    {
        Global global = new Global();//creat object
        global.add();//call instance method
    }

}

