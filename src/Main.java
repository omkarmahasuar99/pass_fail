class Main
{
    public static void main(String[] args)
    {
        int p = 58;
        int c = 78;
        int m = 67;
        int o = 62;
        if (p<35)
        {
            System.out.println("Failed in Physics");
        }
        if (c<35)
        {
            System.out.println("Failed in Chemistry");
        }
        if (m<35)
        {
            System.out.println("Failed in Maths");
        }
        if (o<35)
        {
            System.out.println("Failed in Optional");
        }
        if (p>=35 && c>=35 && m>=35 && o>=35)
        {
            int total = p + c + m + o;
            double percentage = total / 400.0 * 100.0;
            System.out.println("PASS");
            if (percentage <= 59)
                System.out.println("Second Class");
            else if (percentage > 79)
                System.out.println("First Class");
            else
                System.out.println("Passed with Distinction");
        }
    }
}