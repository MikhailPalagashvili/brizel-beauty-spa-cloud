package api;

import lombok.Data;

@Data
public class User {
    private Email email;
    private Password password;
    private Long patientId;
}
