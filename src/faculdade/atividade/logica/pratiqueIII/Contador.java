package faculdade.atividade.logica.pratiqueIII;

import java.util.ArrayList;
import java.util.List;

public class Contador {
    public static void main(String[] args) {

            System.out.println("Contador de 0 a 100 e separação de números pares e impares!");
            System.out.println();

            List<Integer> listaPar = new ArrayList<>();
            List<Integer> listaImpar = new ArrayList<>();

            for (int contador = 0; contador<=100; contador++){

                System.out.println(contador);

                if (contador % 2 == 0){
                    listaPar.add(contador);
                } else {
                    listaImpar.add(contador);
                }

            }
            System.out.println();
            System.out.println("Números Pares: " + listaPar);
            System.out.println("Números Impares: " + listaImpar);
    }
}

