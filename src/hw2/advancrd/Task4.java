package hw2.advancrd;

//Задача №4
//В слове "Hello world!" заменить l на r, сделать все буквы заглавными, выбрать первые 8 символов

public class Task4 {
    public static void main(String[] args) {
        String str = "Hello world!";
        String strReplace = str.replace('l', 'r');
        String strUpperCase = str.toUpperCase();
        String strSubStr = str.substring(0, 7);

        // не совсем понял , отдельно нужно или все сразу
        String strAll = str.replace('l', 'r').toUpperCase().substring(0, 7);

        System.out.println(strReplace);
        System.out.println(strUpperCase);
        System.out.println(strSubStr);

        System.out.println(strAll);

    }
}
