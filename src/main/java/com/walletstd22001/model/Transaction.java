package com.walletstd22001.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Transaction {
    private long transactionId; // Utilisation de camelCase pour suivre les conventions Java
    private LocalDate transactionDate;
    private BigDecimal amount;
    private String description;
    private long accountId; // Utilisation de camelCase pour suivre les conventions Java

    public long getTransactionId() {
        return transactionId;
    }

    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }

    public long getAccountId() {
        return accountId;
    }

    public void setTransactionId(long transactionId) {
        this.transactionId = transactionId;
    }

    public void setTransactionDate(LocalDate transactionDate) {
        this.transactionDate = transactionDate;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public Transaction(long transactionId, LocalDate transactionDate, BigDecimal amount, String description, long accountId) {
        this.transactionId = transactionId;
        this.transactionDate = transactionDate;
        this.amount = amount;
        this.description = description;
        this.accountId = accountId;
    }
}