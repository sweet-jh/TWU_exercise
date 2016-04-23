/**
 * Created by hjing on 4/16/16.
 */
public class Exercise {
    public static void main(String[] args) {
        easiest_exercise_ever();
        Draw_a_horizontal_line();
        Draw_a_vertical_line();
        Draw_a_right_triangle();
        Isosceles_Triangle();
        Diamond();
        Diamond_with_Name();
        FizzBuzz_Exercise();
        Prime_Factors_Exercise();
    }

    public static void easiest_exercise_ever() {
        System.out.println("*");
    }

    public static void Draw_a_horizontal_line() {
        int N=8;
        for(int i=0;i<N;i++) {
            System.out.print("*");
        }
        System.out.println('\n');
    }

    public static void Draw_a_vertical_line() {
        int N=3;
        for(int i=0;i<N;i++) {
            System.out.println("*");
        }
        System.out.println('\n');
    }

    public static void Draw_a_right_triangle() {
        int N=3;
        for(int i=0;i<N;i++) {
            for(int j=0;j<=i;j++) {
                System.out.print("*");
            }
            System.out.print('\n');
        }
    }

    public static void Isosceles_Triangle() {
        int N = 3;
        for(int i=0; i<N; i++) {
            for(int j=N-i-1; j>0; j--) {
                System.out.print(" ");
            }
            for(int j=0; j<=2*i; j++) {
                System.out.print("*");
            }
            for(int j=N-i-1; j>0; j--) {
                System.out.print(" ");
            }
            System.out.print('\n');
        }
    }

    public static void Diamond() {
        int N = 5;
        int i,j;
        for(i=1; i<=N; i++)
        {
            for(j=1; j<=N-i; j++)
            {
                System.out.print(" ");
            }
            for(j=N-i+1; j<N+i; j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for(i=N-1; i>=1; i--)
        {
            for(j=1; j<=(N-i); j++)
            {
                System.out.print(" ");
            }
            for(j=N-i+1; j<N+i; j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public static void Diamond_with_Name() {
        int N = 5;
        int i,j;
        for(i=1; i<N; i++)
        {
            for(j=1; j<=N-i; j++)
            {
                System.out.print(" ");
            }
            for(j=N-i+1; j<N+i; j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.println("Bill");
        for(i=N-1; i>=1; i--)
        {
            for(j=1; j<=(N-i); j++)
            {
                System.out.print(" ");
            }
            for(j=N-i+1; j<N+i; j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }

    public static void FizzBuzz_Exercise() {
        int N=15;
        for(int i=1;i<=N;i++) {
            if(i%3 == 0 && i%5 != 0) {
                System.out.println("Fizz");
            }
            else if(i%5 == 0 && i%3 != 0) {
                System.out.println("Bizz");
            }
            else if(i%3 == 0 && i%5 == 0) {
                System.out.println("FizzBizz");
            }
            else {
                System.out.println(i);
            }
        }
    }

    public static void Prime_Factors_Exercise() {

        int N = 280;
        int C = N;

        for(int i=2;i<C;i++) {
            if(C%i == 0)
            {
                System.out.println(i);
                C = C/i;
                i=1;
            }
        }
        if(C!=N) {
            System.out.print(C);
        }
    }


}

