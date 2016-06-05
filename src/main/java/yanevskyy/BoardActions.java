package yanevskyy;

/**
 * Runs program and runs user-selected action.
 */
public class BoardActions extends ReadWrite {
  public Actions[] actions;

  public BoardActions() {
    this.actions = new Actions[]{new EvenNumber(), new AddsIntegers(), new MinimalModule(), new Polindrom()};
  }

  /**
   * Displays menu. Run user-selected action.
   */
  public void startProgram() {
    writes("Выбирите действие:");
    writes("1 - Прворить, является ли число чётным");
    writes("2 - Вывести сумму 2-х чисел");
    writes("3 - Вывести меньшее по модулю из 3х чисел");
    writes("4 - Проверить, является ли слово полиндромом?");

      String number = reads();

    switch (number){
      case "1": writes(actions[0].performance());
        break;
      case "2": writes(actions[1].performance());
        break;
      case "3": writes(actions[2].performance());
        break;
      case "4": writes(actions[3].performance());
        break;
      default:
        writes("Не корректные данные");
    }
  }

  public static void main(String[] args) {
    BoardActions boardActions = new BoardActions();
      boardActions.startProgram();
  }
}