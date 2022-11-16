package hw1.expert;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {
        String temp = "<client>(Какие то данные)<data>79991113344;test@yandex.ru;Иванов Иван Иванович</data></client>";
        String temp2 = "<client>(Какие то данные)<data></data></client><client>(Какие то данные)<data>Иванов Иван Иванович;79991113344</data></client>";
        String temp3 = "<client>(Какие то данные)<data></data></client>";

        System.out.println(disguise(temp));
        System.out.println(disguise(temp2));
        System.out.println(disguise(temp3));
    }

    public static String disguise(String str) {
        StringBuilder strBuilder = new StringBuilder(str);
        String rezult = "";

        Pattern patternFio = Pattern.compile("[А-Я][а-я]+\\s[А-Я][а-я]+\\s[А-Я][а-я]+");
        Matcher matcherFio = patternFio.matcher(strBuilder);

        while (matcherFio.find()) {
            String fio = matcherFio.group();
            String[] arrayFio = fio.split(" ");
            StringBuilder familiya = new StringBuilder(arrayFio[0]);
            StringBuilder otchestvo = new StringBuilder(arrayFio[2]);
            int sizeFamiliiReplace = familiya.length() - 2;
            int endFamilii = 1;
            while (sizeFamiliiReplace > 0) {
                familiya.replace(1, familiya.length() - endFamilii, "*");
                sizeFamiliiReplace -= 1;
                endFamilii += 1;
            }
            strBuilder.replace(matcherFio.start(), matcherFio.start() + familiya.length(), familiya.toString());
            strBuilder.replace((matcherFio.end() - otchestvo.length()),
                    matcherFio.end(), otchestvo.replace(1, otchestvo.length(), ".").toString());
        }

        Pattern patternTel = Pattern.compile("\\d{11}");
        Matcher matcherTel = patternTel.matcher(strBuilder);
        while (matcherTel.find()) {
            strBuilder.replace(matcherTel.start() + 4, matcherTel.end() - 4,
                    "***");
        }


        Pattern patternEmail = Pattern.compile("\\w+@\\w+\\.[a-z]{2,3}");
        Matcher matcherEmail = patternEmail.matcher(strBuilder);
        while (matcherEmail.find()) {
            String email = matcherEmail.group();
            String[] arrayEmail = email.split("@");
            StringBuilder emailName = new StringBuilder(arrayEmail[0]);
            StringBuilder emailHost = new StringBuilder(arrayEmail[1]);
            emailName.replace(emailName.length() - 1, emailName.length(), "*");
            strBuilder.replace(matcherEmail.start(),
                    (matcherEmail.end() - (emailHost.length() + 1)), emailName.toString());
            String[] arrayHost = emailHost.toString().split("\\.");
            StringBuilder host = new StringBuilder(arrayHost[0]);
            StringBuilder domen = new StringBuilder(arrayHost[1]);
            String hostReplace = host.toString().replaceAll("\\w", "*");
            strBuilder.replace((matcherEmail.start() + (emailName.length() + 1)),
                    matcherEmail.end() - domen.length() - 1, hostReplace);
        }

        rezult = strBuilder.toString();

        return rezult;
    }
}
