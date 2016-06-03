package yanevskyy;

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

    return "^[A-Za-zА-Яа-я]+$".matches(line);
  }
}