package model;

import api.PainScale;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.Duration;

@EqualsAndHashCode(callSuper = true)
@Data
public abstract class Service extends BaseEntity {
    private String name;
    private Double cost;
    private Duration duration;
    private PainScale painScale;
}
