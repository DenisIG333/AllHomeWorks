# Напишите программу, которая принимает на вход цифру,
# обозначающую день недели, и проверяет, является ли этот день выходным.

# Пример:

# - 6 -> да
# - 7 -> да
# - 1 -> нет

numberDay = int(input("Введите день недели: "))

if numberDay == 6 or numberDay == 7:
    print(f"{numberDay} день является выходным")
else:
    print(f"{numberDay} день не является выходным")
