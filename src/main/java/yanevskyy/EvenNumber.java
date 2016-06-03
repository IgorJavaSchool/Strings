package yanevskyy;

/**
 * Checks integer. It is an even or not?
 */
public class EvenNumber extends ReadWrite implements Actions {

    /**
     * Gets data from console.
     * Checks integer. It is an even or not?
     */
    public String performance() {
        writes("Введите число");
        try {
            return (Integer.parseInt(reads()) % 2)  == 0 ? "Чётное" : "Не чётное";
        } catch (NumberFormatException e) {
            writes("Не верные данные");
            return "";
        }
    }
}