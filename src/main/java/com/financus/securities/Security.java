package com.financus.securities;

public abstract class Security {

    private enum TypeOfSecurity {
        SHARE, BOND, ETF;
    }

    protected String ISIN;
    protected String name;
    protected TypeOfSecurity typeOfSecurity;
    protected String exchange;

    public Security(TypeOfSecurity typeOfSecurity, String ISIN, String name, String exchange) {
        this.typeOfSecurity = typeOfSecurity;
        this.ISIN = ISIN;
        this.name = name;
        this.exchange = exchange;
    }


    class Share extends Security {
        char classOfShare;

        public Share(TypeOfSecurity typeOfSecurity, String ISIN, String name, String exchange, char classOfShare) {
            super(typeOfSecurity, ISIN, name, exchange);
            this.classOfShare = classOfShare;
        }
    }

    class Bond extends Security {
        float rate;

        public Bond(TypeOfSecurity typeOfSecurity, String ISIN, String name, String exchange, float rate) {
            super(typeOfSecurity, ISIN, name, exchange);
            this.rate = rate;
        }
    }


}







