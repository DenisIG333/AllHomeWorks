# Напишите программу, которая принимает на вход координаты точки
# (X и Y), причём X ≠ 0 и Y ≠ 0 и выдаёт номер четверти плоскости,
# в которой находится эта точка (или на какой оси она находится).

# Пример:

# - x=34; y=-30 -> 4
# - x=2; y=4-> 1
# - x=-34; y=-30 -> 3


def GetQuarter(x, y):

    if x > 0 and y > 0:
        return 1

    if x < 0 and y > 0: 
        return 2
        
    if x < 0 and y < 0:
        return 3

    if x > 0 and y < 0:
        return 4
    

setX = int(input("введите координату X: "))
setY = int(input("введите координату Y: "))
quarter = GetQuarter(setX,setY)

if quarter != None:
    print(f"Точка с координатами ({setX}, {setY}) находится в {quarter} четверти")
else:
    print("Введите число не равное 0")


