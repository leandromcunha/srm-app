package br.com.srm.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Digits;

@Entity
@Table(name="TBL_RISK")
@SequenceGenerator(name = "sqr_risk", initialValue = 1, allocationSize = 1, sequenceName = "sqr_risk")
public class Risk implements Serializable {

    private static final long serialVersionUID = 5219311133885585527L;


    public Risk() {
    }

    public Risk(final String decription) {
        this(decription, null);
    }

    public Risk(final String decription, final BigDecimal rate ) {
        this.rate = rate;
        this.description = decription;
    }

    @Id
    @Column(name = "RISK_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sqr_risk")
    private Long riskId;

    @Column(name = "DESCRIPRION", length = 200, nullable = false)
    private String description;


    @Digits(integer=6, fraction=3)
    @Column(name = "PC_RATE")
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
