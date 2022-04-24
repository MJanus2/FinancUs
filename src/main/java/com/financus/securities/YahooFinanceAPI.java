package com.financus.securities;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;

import java.io.IOException;
import java.math.BigDecimal;

public class YahooFinanceAPI {

    public void showAllSecurityData(Security security) throws IOException {
        Stock stock = YahooFinance.get(security.getTicker());
        stock.print();
    }

    public BigDecimal getCurrentPrice(Security security) throws IOException {
        Stock stock = YahooFinance.get(security.getTicker());
        BigDecimal price = stock.getQuote(true).getPrice();
        return price;
    }

    public BigDecimal getCurrentDividendInformation(Security security) throws IOException {
        Stock stock = YahooFinance.get(security.getTicker());
        BigDecimal dividend = stock.getDividend().getAnnualYieldPercent();
        return dividend;
    }
}
