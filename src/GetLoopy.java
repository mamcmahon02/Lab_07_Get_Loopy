public class GetLoopy {

    public static void main(String[] args) {
        System.out.print("Problem 1: ");
        for(int x1 = 0; x1 <= 30; x1++)
        {
            System.out.printf("%3d", x1);
        }
        System.out.println();
        System.out.print("Problem 2: ");
        for(int x2 = 30; x2 >= 0; x2--)
        {
            System.out.printf("%3d", x2);
        }
        System.out.println();
        System.out.print("Problem 3: ");
        for(int x3 = 0; x3 <= 18; x3 += 3)
        {
            System.out.printf("%3d", x3);
        }
        System.out.println();
        System.out.print("Problem 4: ");
        for(int x4 = 10; x4 >= 0; x4 -= 2)
        {
            System.out.printf("%3d", x4);
        }

    }
}