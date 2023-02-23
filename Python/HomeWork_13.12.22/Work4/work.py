# Напишите программу, которая по заданному номеру четверти,
# показывает диапазон возможных координат точек в этой четверти (x и y).

def GetQuarter(numberQuarter):
    if numberQuarter == 1:
        print("X > 0 and Y > 0")
    if numberQuarter == 2:
        print("X < 0 and Y > 0")
    if numberQuarter == 3:
        print("X < 0 and Y < 0")
    if numberQuarter == 4:
        print("X > 0 and Y < 0")
    else:
        print("Выход из диапазона")


SetQuarter = int(input("Введите номер четверти: "))
GetQuarter(SetQuarter)

print("-" * 13)