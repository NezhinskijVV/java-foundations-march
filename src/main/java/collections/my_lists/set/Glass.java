package collections.my_lists.set;

import lombok.AllArgsConstructor;

import java.util.Objects;

@AllArgsConstructor
public class Glass {
    private final String material;
    private final double mls;

    @Override
    public String toString() {
        return "Glass{" +
                "material='" + material + '\'' +
                ", mls=" + mls +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Glass)) return false;
        Glass glass = (Glass) o;
        return Double.compare(glass.mls, mls) == 0 &&
                Objects.equals(material, glass.material);
    }

    @Override
    public int hashCode() {
        return Objects.hash(material, mls);
    }
}