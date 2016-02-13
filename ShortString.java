import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самая короткая строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class ShortString
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++)
        {
            String s = reader.readLine();
            list.add(s);
        }
        int s = list.get(0).length();
        for (int i = 0; i < 4; i++){
             if (s > list.get(i + 1).length()){
                 s = list.get(i + 1).length();
             }
        }
        for (int i = 0; i < 5; i++){
             if (s == list.get(i).length()){
                 System.out.println(list.get(i));
                 
             }
    }
}
