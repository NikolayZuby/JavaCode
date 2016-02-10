import java.io.*;
/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/
public class SortingThreeNumbers
{
   public static void main(String[] args)
   {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        //int d = Integer.parseInt(reader.readLine());
        int max;
        if (a < b)
        {
            max = a;
            a = b;
            b = max;
        }
        if (a < c)
        {
            max = a;
            a = c;
            c = max;
        }
        if (b < c)
        {
            max = b;
            b = c;
            c = max;
        }
        System.out.println(a + " " + b + " " + c);
    }    
}
