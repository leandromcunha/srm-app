package br.com.srm.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class CreditLineDTO implements Serializable {

    private static final long serialVersionUID = -3248390992908679165L;

    private Long creditLineId;
    private String customer;
    private BigDecimal creditLine;
    private RiskDTO risk;

    public String getCustomer() {
        return this.customer;
    }

    public void setCustomer(final String customer) {
        this.customer = customer;
    }

    public BigDecimal getCreditLine() {
        return this.creditLine;
    }

    public void setCreditLine(final BigDecimal creditLine) {
        this.creditLine = creditLine;
    }

    public RiskDTO getRisk() {
        return this.risk;
    }

    public void setRisk(final RiskDTO risk) {
        this.risk = risk;
    }

    public Long getCreditLineId() {
        return this.creditLineId;
    }

    public void setCreditLineId(final Long creditLineId) {
        this.creditLineId = creditLineId;
    }
}
