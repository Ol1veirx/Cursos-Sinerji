package com.github.ol1veirx;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
// Classe configuration de Animal
@Configuration
public class AnimalConfiguration {
    // O Bean serve para informar que o método e  um configuration
    @Bean(name = "cachorro")
    public Animal cachorro(){
        return new Animal() {
            @Override
            public void fazerBarulho() {
                System.out.println("Au Au");
            }
        };
    }

    @Bean(name = "gato")
    public Animal gato(){
        return new Animal() {
            @Override
            public void fazerBarulho() {
                System.out.println("Miau");
            }
        };
    }
}
