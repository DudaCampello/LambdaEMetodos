package com.dio.StreamApi.Arrays;

import com.sun.source.doctree.SeeTree;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ExerciciosStreamAPI {

    public static void main(String[] args) {

        List<String> numerosaleatorios =
                Arrays.asList("1","0","4","1","2","3","9","9","6","5");

        System.out.println("Imprima todos os elementos dessa lista de String: ");
        numerosaleatorios.forEach(System.out::println);

        System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set: ");
        numerosaleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println);//so imprime 4 porque SET nao aceita repetidos

        /*se não precisar imprimir
        Set<String> collectSet = numerosaleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet());*/

        System.out.println("Transforme esta lista de String em uma lista de numeros inteiros");
        List<Integer> numerosAleatoriosInteger = numerosaleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        //.forEach(System.out::println);

        System.out.println("Pegue os numeros pares e maiores que 2 e coloque em uma lista");
        List<Integer> listParesMaioresQue2 = numerosaleatorios.stream()
                .map(Integer::parseInt)
                .filter(i -> (i % 2 == 0 && i > 2))
                .collect(Collectors.toList());
        System.out.println(listParesMaioresQue2);

        System.out.println("Mostre a media dos numeros: ");
        numerosaleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);

        System.out.println("Remova os valores impares");
        numerosAleatoriosInteger.removeIf(i ->(i %2 !=0));
        System.out.println(numerosAleatoriosInteger);
        }
    }



