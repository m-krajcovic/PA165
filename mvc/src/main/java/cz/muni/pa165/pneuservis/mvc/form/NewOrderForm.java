package cz.muni.pa165.pneuservis.mvc.form;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Michal Krajcovic <mkrajcovic@mail.muni.cz>
 */
public class NewOrderForm {

    @Min(1)
    private int tireQuantity;

    @NotNull
    private long tireId;

    @NotNull
    @Size(min = 5)
    private String address;


    @NotNull
    @Size(min = 5)
    private String phone;

    private List<Long> additionalServices = new ArrayList<>();


    public int getTireQuantity() {
        return tireQuantity;
    }

    public void setTireQuantity(int tireQuantity) {
        this.tireQuantity = tireQuantity;
    }

    public long getTireId() {
        return tireId;
    }

    public void setTireId(long tireId) {
        this.tireId = tireId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Long> getAdditionalServices() {
        return additionalServices;
    }

    public void setAdditionalServices(List<Long> additionalServices) {
        this.additionalServices = additionalServices;
    }

    @Override
    public String toString() {
        return "NewOrderForm{" +
                "tireQuantity=" + tireQuantity +
                ", tireId=" + tireId +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", additionalServices=" + additionalServices +
                '}';
    }
}
