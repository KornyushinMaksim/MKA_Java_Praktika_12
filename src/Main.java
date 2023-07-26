public class Main {
    public static void main(String[] args) {

        final int size = 10;
        int[] arr = Tasks.massieRand(size);
        System.out.println(Tasks.show(arr) + "\n");

        //tsk1
//        Напишите метод, вычисляющий сумму элементов
//        массива. Массив передаётся в качестве параметра.
        System.out.println("tsk1");
        System.out.println(Tasks.sumElement(arr) + "\n");

        //tsk2
//        Напишите метод для нахождения максимума в массиве.
//        Массив передаётся в качестве параметра.
        System.out.println("tsk2");
        System.out.println(Tasks.maxValue(arr) + "\n");

        //tsk3
//        Напишите метод, определяющий количество чётных,
//        нечётных, положительных, отрицательных элементов
//        массива. Массив передаётся в качестве параметра.
        System.out.println("tsk3");
        System.out.println(Tasks.definitionOfNumber(arr) + "\n");

        //tsk4
//        Напишите метод, сортирующий массив по убыванию или возрастанию в зависимости от выбора
//        пользователя.
        System.out.println("tsk4");
        int[] arrTemp = Tasks.massiveSort(arr, 0);
        System.out.println(Tasks.show(arrTemp) + '\n');

        //tsk5
//        Напишите метод, переворачивающий содержимое
//        массива.
        System.out.println("tsk5");
        int[] arrTemp1 = Tasks.massiveRevers(arr);
        System.out.println(Tasks.show(arrTemp1) + "\n");

    }
}
