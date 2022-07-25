package edu.aluismarte.diplomado.week4;

import edu.aluismarte.diplomado.model.week4.IceScream;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

/**
 * Ice Scream maker
 * <p>
 * El objetivo es transformar esta función en la forma menos acoplada, pues tiene 2 lógicas juntas
 * - El cálculo del precio
 * - La mezcla de los sabores
 * - La construcción del nombre del nuevo helado
 *
 * @author aluis on 5/8/2022.
 */
public class Exercise1Week4 {

    /**
     * Cuando se combinan los helados, se toma el precio del helado más costoso y se usa como base
     * Una vez tienes el precio base, se le adiciona por cada sabor el porcentaje de combinaciones
     * <p>
     * Si tengo los siguientes helados el resultado es el siguiente:
     * <p>
     * Fresa 100 pesos, chocolate 150 pesos, chicle 50 y el porcentaje de combinación es 60%
     * <p>
     * Precio base 150 pesos, y sumo el 60% de 100 que serian 60 y el 60% 50 del helado de chicle
     * Resultado = 150 + 60 + 30 = 240 vale el nuevo helado
     * <p>
     * El nombre del helado se genera usando los sabores de los otros helados
     * Ejemplo, name = Helado de chocolate, Fresa y Chicle (el helado de menor valor va al final)
     * <p>
     * El sabor del helado será mixto.
     *
     * @param iceScreams      Helados a combinar
     * @param PercentageCombinationCost Porcentaje a usar como incremento según el costo de cada helado
     * @return El nuevo helado basado en el nombre del conjunto
     */
    public IceScream createIceScreamCombination(List<IceScream> iceScreams, Double PercentageCombinationCost) {
        return IceScream.builder()//Uso del patron builder para crear la combinacion
                .id("My ID")
                .name(generateIceScreamName(iceScreams))
                .flavor("MIXTO")
                .amount(calculateIceScreamPrice(iceScreams,PercentageCombinationCost))
                .build();

    }



    public BigDecimal calculateIceScreamPrice(List<IceScream> iceScreams, Double PercentageCombinationCost){

        iceScreams.sort((o1, o2) -> Double.compare(o2.getAmount().doubleValue(),o1.getAmount().doubleValue()));
        BigDecimal result = new BigDecimal(-1);
        for (IceScream iceScream : iceScreams){
            if (result.doubleValue() == -1){
                result = iceScream.getAmount();
            }else{
              BigDecimal decimalValueOfPercentage = new BigDecimal(PercentageCombinationCost)
                      .divide(new BigDecimal(100),2, RoundingMode.CEILING);
                        result = result.add(iceScream.getAmount().multiply(decimalValueOfPercentage));
            }
        }

        return result.setScale(2,RoundingMode.CEILING);
    }


    private String generateIceScreamName(List<IceScream> iceScreams) {
        iceScreams.sort((o1, o2) -> Double.compare(o2.getAmount().doubleValue(),o1.getAmount().doubleValue()));
        StringBuilder nameBuilder = new StringBuilder("Helado de ");
        for (int i = 0; i < iceScreams.size(); i++){
            IceScream iceScream = iceScreams.get(i);
            nameBuilder.append(iceScream.getName());
            if(i == iceScreams.size()-2){//-2 se elige para la penultima posicion de los helados
                nameBuilder.append(" y ");
            }
             else if (i < iceScreams.size() - 1){
                nameBuilder.append(", ");
            }
        }
        return  nameBuilder.toString();
    }



}
