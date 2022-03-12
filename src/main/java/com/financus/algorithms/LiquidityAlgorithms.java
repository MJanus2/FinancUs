package com.financus.algorithms;


public class LiquidityAlgorithms {
    LiquidityService liquidityService = new LiquidityService();
    public float getCurrentFinancialLiquidityRatio(){
        return (liquidityService.getAmountOfAllSalaries() - liquidityService.getAmountOfAllLivingCosts())
                / liquidityService.getAnnualRealEstatesServicingCost();

    }


}
