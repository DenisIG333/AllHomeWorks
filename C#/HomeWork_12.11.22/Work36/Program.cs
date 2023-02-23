/*Задача 36: Задайте одномерный массив, заполненный случайными числами. Найдите сумму элементов,
стоящих на нечётных позициях.

[3, 7, 23, 12] -> 19

[-4, -6, 89, 6] -> */


int size = 9;
int[] numbers = new int[size];
RandomNumbers(numbers);
Console.WriteLine("массив: ");
Print(numbers);
int sum = 0;

for (int i = 0; i < numbers.Length; i +=2)
    sum = sum + numbers[i];

    Console.WriteLine($"сумма элементов cтоящих на нечётных позициях = {sum}");

void RandomNumbers(int[] numbers)
{
    for(int i = 0; i < numbers.Length; i++)
        {
            numbers[i] = new Random().Next(1,10);
        }
}

void Print(int[] numbers)
{
    Console.Write("[ ");
    for(int i = 0; i < numbers.Length; i++)
        {
            Console.Write(numbers[i] + " ");
        }
    Console.Write("]");
    Console.WriteLine();
}


