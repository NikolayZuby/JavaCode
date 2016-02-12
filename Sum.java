import java.io.*;
/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        while(true)
        {
            String s = reader.readLine();
            if (s.equals("сумма")) break;
            else sum += Integer.parseInt(s);
        }
        System.out.println(sum);
    }
}
