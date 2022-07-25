package edu.aluismarte.diplomado.project.week11.saga.step;

import edu.aluismarte.diplomado.project.week11.model.ExerciseResponse;
import edu.aluismarte.diplomado.project.week11.saga.model.SagaPayLoadKey;
import edu.aluismarte.diplomado.project.week11.saga.model.SagaStep;
import edu.aluismarte.diplomado.project.week11.saga.model.SagaStepCompensator;
import edu.aluismarte.diplomado.project.week11.saga.model.SagaStepHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;


@Component
@Slf4j
public class SagaWeek11Step1 implements SagaStep<ExerciseResponse> {

    @Override
    public String getName() {
        return "hello Step 1";
    }

    @Override
    public SagaStepHandler<ExerciseResponse> getHandler() {
        return sagaPayload -> {
            log.info("Running {} Handler", getName());
            System.out.println("Testing Demo Handler");
            sagaPayload.addProperty(new SagaPayLoadKey<>("1", String.class), "Juan");
        };
    }

    @Override
    public SagaStepCompensator<ExerciseResponse> getCompensator() {
        return sagaPayload -> {
            log.info("Running {} compensator", getName());
            log.info("Fallando epicamente!");
        };
    }
}
