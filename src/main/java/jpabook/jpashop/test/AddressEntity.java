package jpabook.jpashop.test;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ADDRESS")
public class AddressEntity {

    @Id
    @GeneratedValue
    private Long id;
    private TAddress TAddress;

    public AddressEntity(String a , String b  , String c) {
        this.TAddress = new TAddress(a,b,c);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TAddress getTAddress() {
        return TAddress;
    }

    public void setTAddress(TAddress TAddress) {
        this.TAddress = TAddress;
    }
}
