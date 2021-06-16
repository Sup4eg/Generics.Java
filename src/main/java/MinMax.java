public interface MinMax <T extends Comparable<T>>{
    T min();
    T max();
}

class MyClass<T extends Comparable<T>> implements MinMax<T> {
    T[] vals;

    public MyClass(T[] vals) {
        this.vals = vals;
    }

    @Override
    public T min() {
            T v = vals[0];
            for (T val : vals) {
                if (val.compareTo(v) < 0) {
                    v = val;
                }
            }
            return v;
    }

    @Override
    public T max() {
        T v = vals[0];
        for (T val : vals) {
            if (val.compareTo(v) > 0) {
                v = val;
            }
        }
        return v;
    }
}

class GenIFDemo {
    public static void main(String[] args) {
        Integer[] inums = {3, 6, 2, 8, 6};
        Character[] chs = {'b', 'r', 'p', 'w'};

        MyClass<Integer> iob = new MyClass<>(inums);
        MyClass<Character> cob = new MyClass<>(chs);

        System.out.println("Максимальное значение в массиве inums: " + iob.max());
        System.out.println("Минимальное значение в массиве inums: " + iob.min());
        System.out.println("Максимальное значение в массиве chs: " + cob.max());
        System.out.println("Минимальное значение в массиве chs: " + cob.min());
    }
}
