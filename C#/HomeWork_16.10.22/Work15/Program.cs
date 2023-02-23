/*
Задача 15: Напишите программу, которая принимает на вход цифру, обозначающую день недели, и проверяет, является ли этот день выходным.

6 -> да
7 -> да
1 -> нет
*/

int GetDay(string digit)
{
    Console.WriteLine(digit);
    int dayDigit = int.Parse(Console.ReadLine());
    return dayDigit;
}

int dayDigit = GetDay("Введитите день недели");

if(dayDigit == 6 || dayDigit == 7)
    Console.WriteLine($"День {dayDigit} является выходным");
else
    Console.WriteLine($"День {dayDigit} не является выходным");

if(dayDigit <= 0 || dayDigit >= 8)
    Console.WriteLine("Введите число от 1 до 7");






