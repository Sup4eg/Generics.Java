public class TwoGen<T, V> {
    T obj1;
    V obj2;

    public TwoGen(T obj1, V obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public void showTypes() {
        System.out.println("Тип T: " + obj1.getClass().getName());
        System.out.println("Тип V: " + obj2.getClass().getName());
    }

    public T getObj1() {
        return obj1;
    }

    public V getObj2() {
        return obj2;
    }

    public static void main(String[] args) {
        TwoGen<Integer, String> tgObj = new TwoGen<>(88, "Обобщения");

        tgObj.showTypes();

        int v = tgObj.getObj1();
        System.out.println("Значение: " + v);

        String str = tgObj.getObj2();
        System.out.println("Значение: " + str);
    }
}
