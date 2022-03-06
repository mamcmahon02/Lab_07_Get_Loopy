public class Output_for_loops {

    public static void main(String[] args)
    {
        System.out.println("Problem 5:");
        for(int row2 = 0; row2 < 5; row2++)
        {
            for(int col2 = 0; col2 <= row2; col2++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Problem 6:");
        for(int row3 = 0; row3 < 5; row3++)
        {
            for(int col3 = 5; col3 > row3; col3--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Problem 7:");
        for(int row1 = 0; row1 < 5; row1++)
        {
            for (int col1 = 0; col1 < 5; col1++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

