package yanevskyy;

public class AddsIntegers extends ReadWrite implements Actions {

  public String performance() {
    writes("Введите два числа");
    try {
      return Integer.parseInt(reads()) + Integer.parseInt(reads()) + "";
    } catch (NumberFormatException e) {
      writes("Не корректные данные");
      return "";
    }
  }
}