package yanevskyy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Polindrom extends ReadWrite implements Actions {

  public String performance() {
    StringBuilder word = new StringBuilder();
    writes("Введите слово из пяти букв");
    word.append(reads());
    boolean b = checkSymbol(word.toString());
    if (!checkSymbol(word.toString())
            || word.length() != 5) {
      return "Не корректные данные";
    } else {
      return word.toString().equalsIgnoreCase(word.reverse().toString()) ?
              "Это слово полиндром" : "Это слово НЕ полиндром";
    }
  }

    public boolean checkSymbol(String line){
        Pattern pattern = Pattern.compile("^[A-Za-zА-Яа-я]+$");
        Matcher matcher = pattern.matcher(line);
        return matcher.matches();
    }
}