public class Gen <T>{
    T ob;

    public Gen(T o) {
        ob = o;
    }

    T getOb() {
        return ob;
    }

}

class Gen2<T, V> extends Gen<T> {
    V ob2;


    public Gen2(T o, V o2) {
        super(o);
        this.ob2 = o2;
    }

    public V getOb2() {
        return ob2;
    }
}

class HierDemo {
    public static void main(String[] args) {

        Gen2<String, Integer> x = new Gen2<>("Значение равно: ", 99);
        System.out.print(x.getOb());
        System.out.println(x.getOb2());
    }
}

