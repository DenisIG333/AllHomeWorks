# Напишите программу, которая найдёт произведение пар чисел списка.
# Парой считаем первый и последний элемент, второй и предпоследний и т.д.

# Пример:
# [2, 3, 4, 5, 6] => [12, 15, 16];
# [2, 3, 5, 6] => [12, 15]

my_list = [2, 3, 4, 5, 6]
count_plus = 0
count_minus = len(my_list)-1
sum = 0

for i in range(len(my_list)-2):
    result = my_list[count_plus] * my_list[count_minus]
    count_plus += 1
    count_minus -= 1
    print(result)
