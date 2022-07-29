package edu.aluismarte.diplomado.project.week9.network.request;

import lombok.*;

import java.math.BigDecimal;
import java.util.UUID;

/**
 * @author aluis on 6/26/2022.
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class CreatePaymentRequest {

    private UUID id;

    private BigDecimal amount;
}
