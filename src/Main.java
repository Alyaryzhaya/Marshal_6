public class Main {

    // КОНСТРУКЦИЯ SWITCH CАSE - когда мы знаем, какие могут быть варианты ответа. В зависимости от вариантов ответа  - выполняем блок кода


    public static void main(String[] args) {

        int month = 3;
        String monthString;


        switch (month) { //  в скобках мб выражение, операция, переменная итд)

            case 1: monthString = "Январь";
                break;   // прекратить выполнение этой проверки, если true

            case 2: monthString = "Февраль";
                break;


            case 3: monthString = "Март";
                break;

            case 4: monthString = "Апрель";
                break;


            default: monthString = "Not exist"; // деолтное знаение. Если ни одно из выведенных знаений не сработает
                break;


        }
        System.out.println(monthString);


    }
}
