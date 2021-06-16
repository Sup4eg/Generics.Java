public class GenCons {
    private double val;

    public <T extends Number> GenCons(T arg) {
        this.val = arg.doubleValue();
    }

    public void showVal() {
        System.out.println("val: " + val);
    }
}

class GenConsDemo {
    public static void main(String[] args) {
        GenCons test = new GenCons(100);
        GenCons test2 = new GenCons(123.5F);

        test.showVal();
        test2.showVal();
    }
}
