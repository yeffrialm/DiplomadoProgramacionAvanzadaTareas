package edu.aluismarte.diplomado.project.week9.network.request;

import lombok.*;

import javax.persistence.Column;
import java.math.BigDecimal;
import java.time.LocalDate;
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
