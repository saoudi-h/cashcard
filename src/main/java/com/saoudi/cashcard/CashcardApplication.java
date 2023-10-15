/* (C)2023 */
package com.saoudi.cashcard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CashcardApplication {

    public static void main(String[] args) {

        String test = "foo";
        System.out.println(test);

        SpringApplication.run(CashcardApplication.class, args);
    }
}
