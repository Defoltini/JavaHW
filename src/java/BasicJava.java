public class BasicJava {
    public static void main(String[] args) {
//Применение арифметических операций ( + , -, * , /) над двумя примитивами типа int
int a = 5;
int b = 10;

System.out.println("Результат сложения:" + (a + b));
System.out.println("Результат вычитания:" + (a - b));
System.out.println("Результат деления:" + (a / b));
System.out.println("Результат умножения:" + (a * b));

//Применение арифметических операций над int и double в одном выражении
int aInt = 5;
double aDouble = 0.005;
System.out.println("Результат сложения:" + (aInt + aDouble));
System.out.println("Результат вычитания:" + (aInt - aDouble));
System.out.println("Результат деления:" + (aInt / aDouble));
System.out.println("Результат умножения:" + (aInt * aDouble));

//Применение логических операций ( < , >, >=, <= )
if ( a < b )
    System.out.println(a +" "+ "меньше"+" " + b);
if ( b < a )
    System.out.println(b +" "+ "больше"+" " + a);

int c , d;
  c = 5;
  d = 5;

  if ( c == d )
    System.out.println(c +" "+ "равно"+" " + d);
  if ( (c - d) <= d )
      System.out.println("Разница чисел"+" "+c+" " + "и" + " " +d+ " "+ "меньше или равна"+ " "+d);
  if ( (c + d) >= d)
      System.out.println("Сумма чисел"+" "+c+" " + "и"+ " "+d+ " "+ "больше или равна"+ " "+d);

//прочитать про диапазоны типов данных для вещественных / чисел с плавающей точкой (какие максимальные и минимальные значения есть, как их получить) и переполнение
/*
float

Размер: 32 бита (4 байта)
Максимальное положительное значение: примерно 3.4028235E38
Минимальное отрицательное значение: примерно -3.4028235E38
 */

//Для получения предельных значений в Java можно использовать следующие константы:
System.out.println("Float MAX: " + Float.MAX_VALUE);
System.out.println("Float MIN: " + Float.MIN_VALUE);

/*
double

Размер: 64 бита (8 байт)
Максимальное положительное значение: примерно 1.7976931348623157E308
Минимальное отрицательное значение: примерно -1.7976931348623157E308
*/
//для получения предельных значений double в Java можно использовать:

System.out.println("Double MAX: " + Double.MAX_VALUE);
System.out.println("Double MIN: " + Double.MIN_VALUE);

/*
Переполнение
Переполнение происходит, когда вычисление превышает максимальные или минимальные значения, которые может принимать тип данных.
 */
float largeValue = Float.MAX_VALUE;
float overflowedValue = largeValue * 2;

System.out.println("Overflowed Value: " + overflowedValue);

        }
    }

