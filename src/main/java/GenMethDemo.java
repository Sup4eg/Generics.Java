public class GenMethDemo {

    public static <T extends Comparable<T>, V extends T> boolean isIn(T x, V[] y) {
        for (V v : y) {
            if (x.equals(v)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Integer nums[] = {1, 2, 3, 4, 5};

        if (isIn(2, nums)) {
            System.out.println("Число 2 содержится в массиве nums");
        }
        if(!isIn(7, nums)) {
            System.out.println("Число 7 отсуствует в массиве nums");
        }
        System.out.println();

        //для символьных строк

        String strs[] = {"один", "два", "три", "четыре", "пять"};

        if (isIn("два", strs)) {
            System.out.println("два содержится в массиве strs");
        }

//        GenMethDemo.<Integer, Integer>isIn(2, nums);
    }
}
