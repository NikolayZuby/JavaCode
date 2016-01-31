import java.util.*;
/**
 * Created by Николай on 01.02.2016.
 * Программа моделирующая броски монеты (Орел и решка) на базе паттерна "Фабричный метод"
 */
interface Throw
{
    void move();
}
interface ThrowFactory
{
    Throw getThrow();
}
class ThrowOrelReshka implements  Throw
{
    int orel = 0;
    int reshka = 0;
    public void move()
    {
        for(int i = 0; i < 11; i++)
        {
            Random random = new Random();
            int a = random.nextInt(2);
            if(a == 0)
            {
                orel++;
                System.out.println("Орел");
            }
            else
            {
                reshka++;
                System.out.println("Решка");
            }
        }
        System.out.printf("Орел выпал %d , а решка выпала %d раз", orel, reshka);
    }
}
class ThrowOrelReshkaFactory implements ThrowFactory
{
    public Throw getThrow()
    {
        return new ThrowOrelReshka();
    }
}
public class OrelReshka
{
    public static void throwCoin(ThrowFactory throwFactory)
    {
        Throw t = throwFactory.getThrow();
        t.move();
    }
    public static void main(String[] args)
    {
        throwCoin(new ThrowOrelReshkaFactory());
    }
}
