package br.com.srm.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="TBL_CREDIT_LINE")
@SequenceGenerator(name = "sqr_credit_line", initialValue = 1, allocationSize = 1, sequenceName = "sqr_credit_line")
public class CreditLine {


    private Long creditLineId;
    private String customer;
    private BigDecimal creditLine;
    private Risk risk;
    private Date dateCreation;

    //    @Digits(integer=6, fraction=3)
    //    @Column( name="PC_RATE")
    //    public BigDecimal getRate() {
    //        return this.risk.getRate();
    //    }

    //    public void setRate( final BigDecimal rate ) {
    //        this.risk.setRate(rate);
    //    }

    @Id
    @Column(name = "CREDIT_LINE_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sqr_credit_line")
    public Long getCreditLineId() {
        return this.creditLineId;
    }

    public void setCreditLineId(final Long creditLineId) {
        this.creditLineId = creditLineId;
    }

    @Column(name="CUSTOMER", nullable=false)
    public String getCustomer() {
        return this.customer;
    }

    public void setCustomer(final String customer) {
        this.customer = customer;
    }

    @Column(name="CREDIT_LINE", nullable=false)
    public BigDecimal getCreditLine() {
        return this.creditLine;
    }

    public void setCreditLine(final BigDecimal creditLine) {
        this.creditLine = creditLine;
    }

    @OneToOne(fetch = FetchType.LAZY, cascade = {CascadeType.DETACH})
    @JoinColumn(name = "RISK_ID")
    public Risk getRisk() {
        return this.risk;
    }

    public void setRisk(final Risk risk) {
        this.risk = risk;
    }

    @Column(name="DATE_CREATION", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP",nullable=false,insertable=false)
    @Temporal(TemporalType.TIMESTAMP)
    public Date getDateCreation() {
        return this.dateCreation;
    }

    public void setDateCreation(final Date dateCreation) {
        this.dateCreation = dateCreation;
    }
}