import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println("Enter the number of terms for the sequence.");
        boolean loop = true;
        while (loop) {
            try {
                Scanner sc = new Scanner(System.in);
                int n = Integer.parseInt(sc.nextLine());

                if (!isValidInt(n)) {
                    System.out.println("Enter a valid number > 0.");
                    loop = true;
                }
                if (isValidInt(n)) {
                    series(n);
                    loop= false;
                }
            } catch (NumberFormatException e) {
                System.out.println("Integers only!");
                loop = true;

            }
        }
    }

    public static boolean isValidInt(int n) {
        return n > 0;
        }


    static void series(int num)
    {
        System.out.println("Fibonacci series is:");
        int i=0,j=1,next;
        for(int c=0;c<num;c++)
        {
            if(c<=1)
                next=c;
            else
            {
                next=i+j;
                i=j;
                j=next;
            }
            System.out.print(next+" ");
        }

    }
}
