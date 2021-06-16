public class Stats<T extends Number> {
    T[] nums;

    public Stats(T[] o) {
        nums = o;
    }

    public double average() {
        double sum = 0.0;

        for (T num : nums) {
            sum += num.doubleValue();
        }
        return sum / nums.length;
    }

    boolean saveAverage(Stats<?> ob) {
        return average() == ob.average();
    }

    private static class WildCardDemo {

        public static void main(String[] args) {
            Integer inums[] = {1, 2, 3, 4, 5};
            Stats<Integer> iob = new Stats<>(inums);
            double v = iob.average();
            System.out.println("Среднее значение iob равно " + v);

            Double dnums[] = {1.1, 2.2, 3.3, 4.4, 5.5};
            Stats<Double> dob = new Stats<>(dnums);
            double w = dob.average();
            System.out.println("Среднее значение dob равно " + w);

            Float fnums[] = {1.0F, 2.0F, 3.0F, 4.0F, 5.0F};
            Stats<Float> fob = new Stats<>(fnums);
            double x = fob.average();
            System.out.println("Среднее значение fob равно " + x);

            System.out.print("Cpeдниe значения iob и dob ");
            if (iob.saveAverage(dob)) {
                System.out.println("paвны.");
            }
            else {
                System.out.println("oтличaютcя.");
            }
            System.out.print("Cpeдниe iob и fob ");
            if (iob.saveAverage(fob)) {
                System.out.println("oдинaкoвы.");
            }
            else{
                System.out.println("oтличaютcя.");
            }
        }
    }
}
