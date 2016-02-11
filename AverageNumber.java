
import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class AverageNumber
{
    public static void main(String[] args)   throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        if(b < a && a < c){
            System.out.println(a);
        }
        if(a < b && b < c){
            System.out.println(b);
        }
        if(a < c && c < b){
            System.out.println(c);
        }
        if(c < a && a < b){
            System.out.println(a);
        }
        if(c < b && b < a){
            System.out.println(b);
        }
        if(b < c && c < a){
            System.out.println(c);
        }
    }
}
