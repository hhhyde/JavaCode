package a10_4;

public class Part
{
    public String toString()
    {
        return getClass().getSimpleName();
    }
    public static void main(String[] args)
    {
        System.out.println(new Part());
    }
}
