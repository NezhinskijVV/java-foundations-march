package strings;

public class StringPractice {
    public static void main(String[] args) {
        String name = "Vitaliy";
        String nameCopy = "Vitaliy";

        System.out.println("name == nameCopy " + (name == nameCopy));

        String nameConstructor = new String("Vitaliy");

        System.out.println("name == nameConstructor " + (name == nameConstructor));

        String internName = nameConstructor.intern();
        System.out.println("name == internName " + (name == internName));


        String favoriteStr = "I'm favorite string!";

        System.out.println(favoriteStr.substring(4));
        System.out.println(favoriteStr);

        System.out.println(favoriteStr.substring(4, 12));
        System.out.println(favoriteStr.length());


        System.out.println("Begin cycle");
        StringBuilder sb = new StringBuilder(favoriteStr);
        for (int i = 0; i < 100_000_000; i++) {
//            favoriteStr = favoriteStr + "!";
            sb.append('!');
        }

        System.out.println("End cycle");


        String str = "Я классная строка, поиграйся со мной!";

        System.out.println("A теперь я посчитаю твою длину" + str.length());
        System.out.println("Подстрока без последнего символа");


    }
}


//HW:
// 1.  Поиграться с методами класса String. (кроме CodePoint lines)
// String str = "Я классная строка, поиграйся со мной!"
// 2. Pattern Matcher Регулярные выражения. Написать регулярное выражение для email и телефон.
//asdsadsfgdfg
