package com.ita.edu.teachua.api.models.registration;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SuccessVerification {
    private Integer id;
    private Boolean status;
    private String message;
}
