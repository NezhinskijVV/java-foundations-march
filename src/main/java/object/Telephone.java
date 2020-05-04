package object;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Telephone {
    private String type;
    private int modelNumber;

   @Override
   public String toString(){
       return type + " " + modelNumber;
   }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Telephone telephone = (Telephone) o;

        if (modelNumber != telephone.modelNumber) return false;
        return type.equals(telephone.type);
    }

    @Override
    public int hashCode() {
        System.out.println("HashCode");
        return modelNumber;
    }
}