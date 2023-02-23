/* 
Задача 27: Напишите программу, которая принимает на вход число и выдаёт сумму цифр в числе.

452 -> 11

82 -> 10

9012 -> 12
*/


int SummDigit()
{
    Console.WriteLine("Введите число");
    int digit = int.Parse(Console.ReadLine());

    int result = 0;
    for (int i = 0; digit > 0; i++)
    {
        result = result + digit % 10;
        digit = digit / 10;
    }

    return result;
}

int res = SummDigit();
Console.WriteLine($"сумма цифр = {res}");
