package yanevskyy;

import java.util.Map;

public class MinimalModule extends ReadWrite implements Actions {
  double[] numbers;
  double count;

  public MinimalModule() {
    this.numbers = new double[3];
    count = 0;
  }

  public String performance() {
    writes("Введите три числа");
    for (int i = 0; i < numbers.length; i++) {
      try {
        numbers[i] = (Double.parseDouble(reads()));
      } catch (NumberFormatException e) {
        writes("Не корректные данные");
        return "";
      }
        count = Math.abs(numbers[i]) < count ? count : numbers[i] ;
    }
    for (Double a : numbers) {
      count = count > Math.abs(a) ? a : count;
    }

    return count + "";
  }

}