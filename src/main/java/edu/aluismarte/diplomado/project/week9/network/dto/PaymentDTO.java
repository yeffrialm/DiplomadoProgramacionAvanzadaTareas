package edu.aluismarte.diplomado.project.week9.network.dto;

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
