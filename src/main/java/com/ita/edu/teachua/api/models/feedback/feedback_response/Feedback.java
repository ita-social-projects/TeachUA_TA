package com.ita.edu.teachua.api.models.feedback.feedback_response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Feedback {
    private Integer id;
    private Double rate;
    private String text;
    private List<Integer> date;
    private User user;
    private Club club;
}
