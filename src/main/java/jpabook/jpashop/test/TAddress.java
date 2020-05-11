package jpabook.jpashop.test;

import javax.persistence.Embeddable;
import java.util.Objects;

@Embeddable
public class TAddress {

    private String city;
    private String street;
    private String zipcode;

    public TAddress() {
    }

    public TAddress(String city, String street, String zipcode) {
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }

    public String getCity() {
        return city;
    }


    public String getStreet() {
        return street;
    }


    public String getZipcode() {
        return zipcode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TAddress TAddress = (TAddress) o;
        return Objects.equals(getCity(), TAddress.getCity()) &&
                Objects.equals(getStreet(), TAddress.getStreet()) &&
                Objects.equals(getZipcode(), TAddress.getZipcode());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCity(), getStreet(), getZipcode());
    }
}
