package com.javarush.test.level07.lesson12.home03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Максимальное и минимальное числа в массиве
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++)
        {
            int number = Integer.parseInt(reader.readLine());
            arrayList.add(number);
        }
        int  maximum = arrayList.get(0);
        int  minimum = arrayList.get(0);

        //напишите тут ваш код
        for (int i = 1; i < arrayList.size(); i++)
        {
            if (arrayList.get(i) > maximum) maximum = arrayList.get(i);
            else if (arrayList.get(i) < minimum) minimum = arrayList.get(i);
        }


        System.out.println(maximum + " " + minimum);
    }
}
