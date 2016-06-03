package yanevskyy;


public class BoardActions extends ReadWrite {
  public Actions[] actions;

  public BoardActions() {
    this.actions = new Actions[]{new EvenNumber(), new AddsIntegers(), new MinimalModule(), new Polindrom()};
  }

  public void startProgram() {
    System.out.println("Выбирите действие:");
    System.out.println("1 - Прворить, является ли число чётным");
    System.out.println("2 - Вывести сумму 2-х чисел");
    System.out.println("3 - Вывести меньшее по модулю из 3х чисел");
    System.out.println("4 - Проверить, является ли слово полиндромом?");

      String number = reads();

    switch (number){
      case "1": System.out.println(actions[0].performance());
        break;
      case "2": actions[1].performance();
        break;
      case "3": actions[2].performance();
        break;
      case "4": actions[3].performance();
        break;
      default:
        System.out.println("Не корректные данные");
    }
  }

  public static void main(String[] args) {
    BoardActions boardActions = new BoardActions();
      boardActions.startProgram();
  }
}