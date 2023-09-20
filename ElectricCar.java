package edu.dccc.topelectriccars.topelectriccars;

import java.text.NumberFormat;

public class ElectricCar {
    String model;
    String epaFuelEconomy;
    double basePrice;
    int epaMaxRange;
    int rank;
    String imgSrc;

    public ElectricCar(String model, String imgSrc, double basePrice, int epaMaxRange, String epaFuelEconomy,   int rank) {
        this.model = model;
        this.epaFuelEconomy = epaFuelEconomy;
        this.basePrice = basePrice;
        this.epaMaxRange = epaMaxRange;
        this.rank = rank;
        this.imgSrc = imgSrc;
    }

    public String getFormattedBasePrice() {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        return formatter.format(basePrice);
    }

    public String getModel() {
        return model;
    }

    public String getEpaFuelEconomy() {
        return epaFuelEconomy;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public int getEpaMaxRange() {
        return epaMaxRange;
    }

    public int getRank() {
        return rank;
    }

    public String getImgSrc() {
        return imgSrc;
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "model='" + model + '\'' +
                ", epaFuelEconomy='" + epaFuelEconomy + '\'' +
                ", basePrice=" + basePrice +
                ", epaMaxRange=" + epaMaxRange +
                ", rank=" + rank +
                ", imgSrc='" + imgSrc + '\'' +
                '}';
    }
}