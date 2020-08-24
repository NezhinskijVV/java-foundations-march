package annotations.lecture.myjunit;

import lombok.SneakyThrows;

import java.lang.reflect.Method;

public class MyJUnitRunner {

    @SneakyThrows
    public static void main(String[] args) {
        // 1. Создать две переменные passed и failed (счетчики упавших и прошедших тестов)
        // 2. Запустить все методы по очереди ( Используя Reflection из класса достать все методы. Выполнить их.)
        // 3. Инкерементировать нужный счетчик (try-catch блок)

        int failed = 0;
        int passed = 0;

        final Class<?> testClazz = Class.forName("annotations.lecture.myjunit.MyBeautifulTest");

        Method[] methods = testClazz.getMethods();
        MyBeautifulTest test = new MyBeautifulTest();

        for (Method method : methods) {
            try {
                if (method.isAnnotationPresent(Test.class)) {
                    method.invoke(test);
                    passed++;
                    System.out.println(method.getName() + " успешно прошел");
                }
            } catch (Throwable throwable) {
                System.err.println(method.getName() + " упал");
                failed++;
            }
        }

        System.out.println("__________ \n Количество пройденных тестов : "
                + passed + "\n Количество упавших тестов : " + failed + "\n__________ ");
    }
}
