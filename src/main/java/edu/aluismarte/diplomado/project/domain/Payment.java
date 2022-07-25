package edu.aluismarte.diplomado.project.domain;

import edu.aluismarte.diplomado.project.week9.network.dto.EmployeeDTO;
import edu.aluismarte.diplomado.project.week9.network.dto.PaymentDTO;
import edu.aluismarte.diplomado.project.week9.network.request.UpdateEmployeeRequest;
import edu.aluismarte.diplomado.project.week9.network.request.UpdatePaymentRequest;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

/**
 * @author aluis on 6/12/2022.
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name = "payments")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column
    private BigDecimal amount;

    @Column
    private String createdBy;
    @Column
    private String updatedBy;
    @Column
    private LocalDateTime createdAt;
    @Column
    private LocalDateTime updatedAt;


    public PaymentDTO toDTO() {
        return PaymentDTO.builder()
                .id(id)
                .amount(amount)
                .build();
    }

    public void applyChanges(UpdatePaymentRequest updatePaymentRequest) {
        this.id = updatePaymentRequest.getId();
        this.amount = updatePaymentRequest.getAmount();
    }

}
