package com.joaobraga.hrpayrool.entities;

import lombok.*;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Worker implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;

    private String name;
    private Double dailyIncome;
}
