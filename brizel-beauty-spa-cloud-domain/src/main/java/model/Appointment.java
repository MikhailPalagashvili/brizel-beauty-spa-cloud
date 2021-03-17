package model;

import api.DiscountBehavior;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.sql.Time;

@EqualsAndHashCode(callSuper = true)
@Data
public class Appointment extends BaseEntity {
    private Patient patientId;
    private Time startTime;
    private Time endTime;
    private Double priceExpected;
    private DiscountBehavior discountBehavior;
    private Double finalPrice;
    private Boolean isCanceled;
    private String cancelReason;
}
