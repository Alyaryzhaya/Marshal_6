import java.io.IOException;

public class Start {

    public static void main(String[] args) throws IOException {

        char ch, answer = 'B';
        System.out.println("Какую букву я загадал?");
        System.out.print("Попытайтесь ее угадать: ");

        ch = (char) System.in.read(); //  присвоили переменной ch  знаение того, то сами введем на экран (по умоланию int, насильно char)

        if (ch == answer) {
            System.out.println("Ура!");
        } else if (ch > answer) {
            System.out.println("Тумаch");
        }else{
            System.out.println("Недо!");



        }



    }
}
