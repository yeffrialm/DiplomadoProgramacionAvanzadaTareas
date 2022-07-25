package edu.aluismarte.diplomado.project.week9.network.dto;

import edu.aluismarte.diplomado.model.project.EmployeeStateJson;
import edu.aluismarte.diplomado.model.project.EmployeeStateJson2;
import edu.aluismarte.diplomado.model.project.EmployeeStateJson3;
import lombok.*;

import java.math.BigDecimal;
import java.util.UUID;


@AllArgsConstructor
@Builder
@Getter
@Setter
@ToString

public class PaymentDTO {
    private UUID id;
    private BigDecimal amount;


}
