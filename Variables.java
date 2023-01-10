public class Variables {
    public static void main(String[] args) {
        // щбъявление переменных
        short x;
        byte a = 1;
        int b = a + 2;
        String c = "123";
        x = 10;

        //разные типы данных
        boolean enabled = false;
        enabled = true;

        char at = '@';
        float number = 1.5F;
        String text_text = "Vasya";
        String textText;

        //константы
        final byte num = 1;

        //математические операции
        ++x;
        x++;

        int res = x * num - 5 /2 -4;
        double res1 = x * num - 5 / 2.0 -4;

        byte y = -1 % 10;
        y = 19 % 4;

        System.out.println(res);
        System.out.println(res1);
        System.out.println(y);

        double res2= x++ * num - 5 / 2.0 -4;
        System.out.println(res2);
        double res3 = ++x * num - 5 / 2.0 -4;
        System.out.println(res3);

        //преобразование
        System.out.println((int) res3);
        System.out.println((double) res);

        // консоль

        System.out.print("Hello world!\n");
        System.out.println("Hello world!");
        System.out.printf("Hello, %s!", text_text);
    }
}
