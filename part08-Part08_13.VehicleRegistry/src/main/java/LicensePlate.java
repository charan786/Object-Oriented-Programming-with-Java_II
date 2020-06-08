
import java.util.Objects;

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.liNumber);
        hash = 17 * hash + Objects.hashCode(this.country);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        LicensePlate other = (LicensePlate) obj;
         // if the instance variables of the objects are the same, so are the objects
        if (this.country.equals(other.country) &&
            this.liNumber.equals(other.liNumber)) {
            return true;
        }

        // otherwise, the object's aren't the same
        return false;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

}
