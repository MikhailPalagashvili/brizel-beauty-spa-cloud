package model;

import api.Phonenumber;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Patient extends BaseEntity {
    private String name;
    private Integer age;
    private String city;
    private String state;
    private String zipCode;
    private String street;
    private String birthday;
    private String birthMonth;
    private String birthYear;
    private Phonenumber phonenumber;
}
