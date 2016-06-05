package yanevskyy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *Checks word. It is polindrom or not?
 */
public class Polindrom extends ReadWrite implements Actions {


  /**
   * Gets data from console.
   *Checks word. It is polindrom or not?
   */
  public String performance() {
    StringBuilder word = new StringBuilder();
    writes("Введите слово из пяти букв");
    word.append(reads());
    if (!checkSymbol(word.toString())
            || word.length() != 5) {
      return "Не корректные данные";
    } else {
      return word.toString().equalsIgnoreCase(word.reverse().toString()) ?
              "Это слово полиндром" : "Это слово НЕ полиндром";
    }
  }

  /**
   * Checks line. Is it contains only letters.
   * @param line The word that yuo wont to check.
   * @return
     */
    public boolean checkSymbol(String line){
        Pattern pattern = Pattern.compile("^[A-Za-zА-Яа-я]+$");
        Matcher matcher = pattern.matcher(line);
        return matcher.matches();
    }
}