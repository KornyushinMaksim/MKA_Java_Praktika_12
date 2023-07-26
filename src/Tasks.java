public class Tasks {

    public static int[] massieRand(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 50);
        }
        return arr;
    }

    public static String show(int[] arr) {
        String str = new String();
        for (int var : arr) {
            str += var + " ";
        }
        return str;
    }

    public static int sumElement(int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            res += arr[i];
        }
        return res;
    }

    public static int maxValue(int[] arr) {
        int max = 0;
        for (int var : arr) {
            if (max < var) {
                max = var;
            }
        }
        return max;
    }

    public static String definitionOfNumber(int[] arr) {
        String str = new String();
        int evenNumberPlus = 0;
        int evenNumberMinus = 0;
        int oddNumberPlus = 0;
        int oddNumberMinus = 0;
        for (int var : arr) {
            if (var < 0 && var % 2 == 0) {
                evenNumberMinus++;
            } else if (var > 0 && var % 2 == 0) {
                evenNumberPlus++;
            } else if (var < 0 && var % 2 != 0) {
                oddNumberMinus++;
            } else if (var > 0 && var % 2 != 0) {
                oddNumberPlus++;
            }
        }
        str += "чётное положительное: " + evenNumberPlus + "\nчётное отрицательное: " + evenNumberMinus +
                "\nнечётное положительное: " + oddNumberPlus + "\nнечётное отрицательное: " + oddNumberMinus;
        return str;
    }

    public static int[] massiveSort(int[] arr, int side) {
        int[] arrTemp = new int[arr.length];
        System.arraycopy(arr, 0, arrTemp, 0, arr.length);
        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            if (side == 1) {       //возрастание
                for (int i = 0; i < arrTemp.length - 1; i++) {
                    if (arrTemp[i] > arrTemp[i + 1]) {
                        isSorted = false;

                        buf = arrTemp[i];
                        arrTemp[i] = arrTemp[i + 1];
                        arrTemp[i + 1] = buf;
                    }
                }
            }
            if (side == 0) {       //убывание
                for (int i = 0; i < arrTemp.length - 1; i++) {
                    if (arrTemp[i] < arrTemp[i + 1]) {
                        isSorted = false;

                        buf = arrTemp[i];
                        arrTemp[i] = arrTemp[i + 1];
                        arrTemp[i + 1] = buf;
                    }
                }
            }
        }
        return arrTemp;
    }

    public static int[] massiveRevers(int[] arr) {
        int[] arrTemp = new int[arr.length];
        for (int i = 0, j = arr.length - 1; i < arr.length; ){
            arrTemp[j--] = arr[i++];
        }
        return arrTemp;
    }
}
