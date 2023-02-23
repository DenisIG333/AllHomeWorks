/* 
Задача 41: Пользователь вводит с клавиатуры M чисел.
Посчитайте, сколько чисел больше 0 ввёл пользователь.

0, 7, 8, -2, -2 -> 2

1, -7, 567, 89, 223-> 3 
*/

int GetNumber(string message)
{
    int numberMoreThan0 = 0;
    int countNumbers = 0;
    int result = 0;

    while(countNumbers < 5)
    {
        Console.WriteLine(message);
        result = int.Parse(Console.ReadLine());
        countNumbers++;
        
        if(result > 0)
        {
            numberMoreThan0++;
        }
    }

    Console.WriteLine($"Чисел больше 0 -> {numberMoreThan0}");
    return result;
    
}

int number = GetNumber("Введите число");



