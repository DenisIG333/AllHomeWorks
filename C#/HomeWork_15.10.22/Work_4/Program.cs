// Задача 4: Напишите программу, которая принимает на вход три числа и выдаёт максимальное из этих чисел.

// 2, 3, 7 -> 7
// 44 5 78 -> 78
// 22 3 9 -> 22

Console.Write("Введите первое число ");
int number1 = int.Parse(Console.ReadLine());

Console.Write("Введите второе число ");
int number2 = int.Parse(Console.ReadLine());

Console.Write("Введите третье число ");
int number3 = int.Parse(Console.ReadLine());

int[] array = {number1, number2, number3};

int index = 0;
int max = array[index];

for(int i = 0; i < array.Length; i++)
{
    if(array[index] > max)
    {
        max = array[index];
    }
    index++;

}

Console.Write($"Максимальное число - {max}");
