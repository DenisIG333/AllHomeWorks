// Задача 2: Напишите программу, которая на вход принимает два числа и выдаёт, какое число большее, а какое меньшее.

// a = 5; b = 7 -> max = 7
// a = 2 b = 10 -> max = 10
// a = -9 b = -3 -> max = -3

Console.Write("Введите первое число ");
int number = int.Parse(Console.ReadLine());

Console.Write("Введите второе число ");
int number2 = int.Parse(Console.ReadLine());

if(number > number2)
{
    Console.Write($"Число {number} больше числа {number2}");
}

if(number2 > number)
{
    Console.Write($"Число {number2} больше числа {number}");
}

if(number2 == number)
{
    Console.Write($"Число {number2} равно числу {number}");
}
