/* 
Задача 25: Напишите цикл, который принимает на вход два числа (A и B) и возводит число A в натуральную степень B.

3, 5 -> 243 (3⁵)
2, 4 -> 16
*/


int raiseToPow()
{
    Console.WriteLine("Введите число А");
    int numberA = int.Parse(Console.ReadLine());

    Console.WriteLine("Введите число B");
    int numberB = int.Parse(Console.ReadLine());

    int result = 1;

    for (int i=1; i <= numberB; i++)
    {
        result = result*numberA;
    }
    return(result);
}

int res = raiseToPow();
Console.WriteLine($"число A в натуральной степени B = {res}");