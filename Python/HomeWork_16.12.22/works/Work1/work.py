# Напишите программу, которая принимает на вход вещественное
# число и показывает сумму его цифр.
# Пример:
# 6782 -> 23
# 0,56 -> 11

from decimal import Decimal

number = Decimal(input("Введите вещественное число: "))

number = abs(number)

while number != int(number):
    number *= 10

result = 0

while number > 0:
    result += int(number % 10)
    number /= 10

print(f"Сумма чисел вещественного числа = {result}")







