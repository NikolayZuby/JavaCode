import java.util.Random;

/**
 * Created by Николай on 01.02.2016.
 * Прогамма моделирующая броски кубиков на базе паттерна "Фабричный метод"
 * Program simulating dice pattern-based "Factory Method"
 *
 */

interface Throwing
{
    void move();
}
interface ThrowingFactory
{
    Throwing getThrowing();
}
public class ThrowingBones implements Throwing
{

    public void move()
    {
        double[] teor = { 0, 0, (double)1 / 36, (double)1 / 18,
                         (double)1 / 12, (double)1 / 9, (double)5 / 36,
                         (double)1 / 6, (double)5 / 36, (double)1 / 9,
                         (double)1 / 12, (double)1 / 18, (double)1 / 36 };
        int[] a = new int[13];
        int sum;
        Random random = new Random();
        for (int i = 0; i < 36000; i++)
        {
            sum = 0;
            sum = random.nextInt(7);
            sum += random.nextInt(7);
            a[sum]++;
        }
        System.out.println("Cумма | Колличество сумм | Вероятность | Теоретическая вероятность");
        for (int i = 2; i < 11; i++)
            System.out.printf("%d\t  |\t\t%d\t\t |  %f   |\t\t%f\n", i, a[i], (double)a[i] / 36000, teor[i]);
    }
}
class ThrowingBonesFactory implements ThrowingFactory
{
    public Throwing getThrowing()
    {
        return new ThrowingBones();
    }
}
class AppEngine
{
    public static void throwing(ThrowingFactory throwingFactory)
    {
        Throwing throwing = throwingFactory.getThrowing();
        throwing.move();
    }
    public static void main(String[] args)
    {
        throwing(new ThrowingBonesFactory());
    }
}
