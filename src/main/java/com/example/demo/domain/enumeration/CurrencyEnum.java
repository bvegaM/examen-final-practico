package com.example.demo.domain.enumeration;

import lombok.Getter;

@Getter
public enum CurrencyEnum {
    EUR("Euro"),
    USD("United States Dollar"),
    GBP("British Pound Sterling"),
    JPY("Japanese Yen"),
    AUD("Australian Dollar"),
    CAD("Canadian Dollar"),
    CHF("Swiss Franc"),
    CNY("Chinese Yuan Renminbi"),
    SEK("Swedish Krona"),
    NZD("New Zealand Dollar");

    private final String description;

    CurrencyEnum(String description) {
        this.description = description;
    }
}
