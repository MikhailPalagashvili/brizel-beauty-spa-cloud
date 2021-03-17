package model;

import api.User;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Account extends BaseEntity {
    private User user;
}
