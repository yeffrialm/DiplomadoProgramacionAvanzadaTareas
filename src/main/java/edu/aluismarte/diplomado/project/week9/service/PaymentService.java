package edu.aluismarte.diplomado.project.week9.service;


import edu.aluismarte.diplomado.project.domain.Payment;
import edu.aluismarte.diplomado.project.repositories.PaymentRepository;
import edu.aluismarte.diplomado.project.week9.FactoryPattern;
import edu.aluismarte.diplomado.project.week9.network.dto.PaymentDTO;
import edu.aluismarte.diplomado.project.week9.network.request.CreatePaymentRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service

public class PaymentService {
    private final PaymentRepository paymentRepository;

    public List<PaymentDTO> getPayment() {
        return paymentRepository.findAll().stream().map(FactoryPattern.PaymentDTOFactory::toPaymentDTO).collect(Collectors.toList());
    }

    public PaymentDTO createPayment(CreatePaymentRequest createPaymentRequest) {
        Payment payment = FactoryPattern.PaymentFactory.toPayment(createPaymentRequest);
        paymentRepository.save(payment);
        return payment.toDTO();
    }


}
