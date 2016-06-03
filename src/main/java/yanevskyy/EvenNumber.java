package yanevskyy;

/**
 * Checks integer. It is an even or not?
 */
public class EvenNumber extends ReadWrite implements Actions {
    private int evenNumber;
    private String string;

    /**
     * Gets data from console.
     * Checks integer. It is an even or not?
     */
    public String performance() {
        writes("Введите число");
        try {
            evenNumber = Integer.parseInt(reads());
        } catch (NumberFormatException e) {
            writes("Не верные данные");
        }
        return (evenNumber % 2)  == 0 ? "Чётное" : "Не чётное";
    }
}