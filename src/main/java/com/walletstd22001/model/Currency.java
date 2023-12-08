package com.walletstd22001.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Currency {
    private long currencyId; // Utilisation de camelCase pour suivre les conventions Java
    private String currencyName;

    public long getCurrencyId() {
        return currencyId;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyId(long currencyId) {
        this.currencyId = currencyId;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public Currency(long currencyId, String currencyName) {
        this.currencyId = currencyId;
        this.currencyName = currencyName;
    }
}
