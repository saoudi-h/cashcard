/* (C)2023 */
package com.saoudi.cashcard;

import org.springframework.data.annotation.Id;

public record CashCard(@Id Long id, Double amount) {}
