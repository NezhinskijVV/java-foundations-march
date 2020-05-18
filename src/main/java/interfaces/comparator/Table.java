package interfaces.comparator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Table implements Comparable<Table> {
    private double width;
    private double length;
    private double high;
    private String material;

    public final static double ACCURACY = 0.001;


    @Override
    public int compareTo(Table oTable) {
//        if (!(o instanceof Table)) {
//            throw new ClassCastException("Это не стол");
//        }
//
//        Table oTable = (Table) o;

        if (getVolume() - oTable.getVolume() > ACCURACY) {
            return 1;
        } else if (getVolume() - oTable.getVolume() < -ACCURACY) {
            return -1;
        }
        return 0;
    }

    private double getVolume() {
        return width * length * high;
    }

    @Override
    public String toString() {
        return "Table{" +
                "width=" + width +
                ", length=" + length +
                ", high=" + high +
                ", material='" + material + '\'' +
                '}';
    }
}
