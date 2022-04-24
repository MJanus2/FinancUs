package com.financus.securities;

import javax.persistence.*;

@MappedSuperclass
public abstract class Security {

    protected enum TypeOfSecurity {
        SHARE, BOND, ETF;
    }

    @Id
    protected String ISIN;
    protected String name;
    @Column(name = "type_of_security")
    protected TypeOfSecurity typeOfSecurity;
    protected String exchange;

    public Security(TypeOfSecurity typeOfSecurity, String ISIN, String name, String exchange) {
        this.typeOfSecurity = typeOfSecurity;
        this.ISIN = ISIN;
        this.name = name;
        this.exchange = exchange;
    }
}
    @Entity
    @Table(name = "Shares")
    class Share extends Security {
        char classOfShare;

        public Share(TypeOfSecurity typeOfSecurity, String ISIN, String name, String exchange, char classOfShare) {
            super(typeOfSecurity, ISIN, name, exchange);
            this.classOfShare = classOfShare;
        }
    }

    @Entity
    @Table(name = "Bonds")
    class Bond extends Security {
        float rate;

        public Bond(TypeOfSecurity typeOfSecurity, String ISIN, String name, String exchange, float rate) {
            super(typeOfSecurity, ISIN, name, exchange);
            this.rate = rate;
        }
    }










