package package_1;

public class PolyExample
{
    static class Travel
    {
        public void Go(String place)
        {
            System.out.println("Going to: " + place);
        }
        public void Go(String place, int time)
        {
            System.out.println("Going to: " + place + " At: " + time + " pm");
        }
        public void Go(String place, String method)
        {
            System.out.println("Going to: " + place + " by " + method);
        }
        public void Go(String place, double distance)
        {
            System.out.println("Going to: " + place + " distance: " + distance+"km");
        }
    }

    public static void main(String args[])
    {
        Travel t = new Travel();

        t.Go("delhi");
        t.Go("delhi", 9);
        t.Go("delhi", "flight");
        t.Go("delhi", 350.8);
    }
}
