package yanevskyy;

/**
 * Adds two integers.
 */
public class AddsIntegers extends ReadWrite implements Actions {

  /**
   * Gets two integers from console.
   * Adds two integers.
   */
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