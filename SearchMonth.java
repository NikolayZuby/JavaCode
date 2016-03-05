package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        //напишите тут ваш код
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String MonthName = reader.readLine();
        HashMap<String,Integer> mapMonths = new HashMap<String,Integer>();
        mapMonths.put("January", 1);
        mapMonths.put("February", 2);
        mapMonths.put("March", 3);
        mapMonths.put("April", 4);
        mapMonths.put("May", 5);
        mapMonths.put("June", 6);
        mapMonths.put("July", 7);
        mapMonths.put("August", 8);
        mapMonths.put("September", 9);
        mapMonths.put("October", 10);
        mapMonths.put("November", 11);
        mapMonths.put("December", 12);
        for (Map.Entry<String,Integer> pair : mapMonths.entrySet())
        {
            if (pair.getKey().contains(MonthName))
            {
                System.out.println(MonthName + " is " + pair.getValue() + " month");
            }
        }

    }

}
