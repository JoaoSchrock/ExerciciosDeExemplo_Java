package com.company.vetores;

/*
Repare nos vetores abaixo:
Double[] semanaUm = new Double[]{ 1000.0, 1500.0, 1250.0, 2100.0, 1350.0, 970.0, 0.0 };
Double[] semanaDois = new Double[]{ 1050.0, 2500.0, 3250.0, 1100.0, 1430.0, 900.0, 0.0 };
Double[] semanaTres = new Double[]{ 1700.0, 1300.0, 1450.0, 2000.0, 1390.0, 800.0, 0.0 };
Double[] semanaQuatro = new Double[]{ 2100.0, 1600.0, 1850.0, 2100.0, 1220.0, 998.0, 0.0 };

Double[][] mes = new Double[][] { semanaUm, semanaDois, semanaTres, semanaQuatro };

Os quatro primeiros vetores estão guardando o faturamento diário de cada semana e o último
vetor, que é de 2 dimensões,
guarda o faturamento mensal separado por semanas.


Crie um algoritmo que encontre qual a semana teve o maior faturamento.

No final mostre qual foi essa semana e de quanto
foi esse faturamento.
 */

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double[] semanaUm = new Double[]{ 1000.0, 1500.0, 1250.0, 2100.0, 1350.0, 970.0, 0.0 };
        Double[] semanaDois = new Double[]{ 1050.0, 2500.0, 3250.0, 1100.0, 1430.0, 900.0, 0.0 };
        Double[] semanaTres = new Double[]{ 1700.0, 1300.0, 1450.0, 2000.0, 1390.0, 800.0, 0.0 };
        Double[] semanaQuatro = new Double[]{ 2100.0, 1600.0, 1850.0, 2100.0, 1220.0, 998.0, 0.0 };

        Double[][] mes = new Double[][] { semanaUm, semanaDois, semanaTres, semanaQuatro };

        for (int i = 1; i < mes.length ; i++){
            if (mes[0] > semanaDois){
                
            }
        }
    }
}
// double somasemanaUM = mes[0][0] + mes[0][1] + mes[0][2] + mes[0][3] + mes[0][4] + mes[0][5];