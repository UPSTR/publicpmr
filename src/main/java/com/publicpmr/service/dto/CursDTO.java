package com.publicpmr.service.dto;
import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.Objects;
import com.publicpmr.domain.enumeration.CurrencyName;

/**
 * A DTO for the {@link com.publicpmr.domain.Curs} entity.
 */
public class CursDTO implements Serializable {

    private Long id;

    @NotNull
    private Double purchase;

    @NotNull
    private Double sale;

    @NotNull
    private CurrencyName currency;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPurchase() {
        return purchase;
    }

    public void setPurchase(Double purchase) {
        this.purchase = purchase;
    }

    public Double getSale() {
        return sale;
    }

    public void setSale(Double sale) {
        this.sale = sale;
    }

    public CurrencyName getCurrency() {
        return currency;
    }

    public void setCurrency(CurrencyName currency) {
        this.currency = currency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        CursDTO cursDTO = (CursDTO) o;
        if (cursDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), cursDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "CursDTO{" +
            "id=" + getId() +
            ", purchase=" + getPurchase() +
            ", sale=" + getSale() +
            ", currency='" + getCurrency() + "'" +
            "}";
    }
}
