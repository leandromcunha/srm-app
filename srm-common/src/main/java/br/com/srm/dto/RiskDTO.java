package br.com.srm.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class RiskDTO implements Serializable {

    private static final long serialVersionUID = 443905955598205014L;

    private Long riskId;

    private String description;

    private BigDecimal rate;

    public Long getRiskId() {
        return this.riskId;
    }

    public void setRiskId(final Long riskId) {
        this.riskId = riskId;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public BigDecimal getRate() {
        return this.rate;
    }

    public void setRate(final BigDecimal rate) {
        this.rate = rate;
    }
}
