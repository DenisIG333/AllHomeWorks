/* Задача 66: Задайте значения M и N. Напишите программу, которая найдёт
сумму натуральных элементов в промежутке от M до N.

M = 1; N = 15 -> 120
M = 4; N = 8. -> 30
 */


int m = UserNumber("Введите M:");
int n = UserNumber("Введите N:");
Console.WriteLine($"Сумма натуральных элементов в промежутке от {m} до {n} = {NaturalSum(m, n)}");

int UserNumber(string output)
{
    Console.Write(output);
    return int.Parse(Console.ReadLine());
}

int NaturalSum(int m, int n)
{
    if (m == n)
        return n;
    return n + NaturalSum(m, n - 1);
}
