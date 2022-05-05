package com.financus.realestates;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ExcelDataDownloader {

    public FileInputStream chooseFilePath() throws FileNotFoundException {
        //to edit
        return new FileInputStream(new File("C:\\Users\\majan" +
                "\\OneDrive\\Janus Global Investments\\Nieruchomości\\Analizy\\NBP\\ceny_mieszkan.xlsx"));
    }

    public FileInputStream getAdditionalStream() throws FileNotFoundException {
        return chooseFilePath();
    }

    private static Object takeCellValue(Cell cell, Workbook workbook) {
        if (Objects.isNull(cell)) {
            return "";
        }
        switch (cell.getCellType()) {
            case BOOLEAN:
                return cell.getBooleanCellValue();
            case STRING:
                return cell.getRichStringCellValue().getString();
            case NUMERIC:
                DataFormatter dataFormatter = new DataFormatter();
                if (DateUtil.isCellDateFormatted(cell)) {
                    return dataFormatter.formatCellValue(cell);
                } else {
                    String cellValue = String.valueOf(cell.getNumericCellValue());
                    if (cellValue.contains("E")) {
                        cellValue = BigDecimal.valueOf(cell.getNumericCellValue()).toPlainString();
                    }
                    return cellValue;
                }
            case FORMULA:
                FormulaEvaluator evaluator = workbook.getCreationHelper().createFormulaEvaluator();
                DataFormatter formatter = new DataFormatter();
                return formatter.formatCellValue(cell, evaluator);
            case ERROR:
                return cell.getErrorCellValue();
            case BLANK:
                return "";
            default:
                return "";
        }
    }

    public int getColumnIndexForCity(FileInputStream fileInputStream, int idOfSheet, String city) throws IOException {
        int columnIndex = 0;
        Workbook workbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = workbook.getSheetAt(idOfSheet);
        for (Row row : sheet) {
            if (row.getRowNum() >= 6) {
                for (Cell cell : row) {
                    if (takeCellValue(cell, workbook).equals(city)) {
                        return cell.getColumnIndex();
                    }
                }
            }
        }
        return columnIndex;
    }

    public List<Double> createCityPrices(FileInputStream firstFileInputStream, FileInputStream secondFileInputStream,
                                         int idOfSheet, String city) throws IOException {
        List<Double> cityPricesList = new ArrayList<>();
        int columnIndexByCity = getColumnIndexForCity(firstFileInputStream, idOfSheet, city);
        Workbook workbook = new XSSFWorkbook(secondFileInputStream);
        Sheet sheet = workbook.getSheetAt(idOfSheet);
        for (Row row : sheet) {
            if (row.getRowNum() >= 7) {
                for (Cell cell : row) {
                    if (cell.getColumnIndex() == columnIndexByCity && cell.getNumericCellValue() != 0) {
                        double cellToInteger = cell.getNumericCellValue();
                        cityPricesList.add(cellToInteger);
                    }
                }
            }
        }
        return cityPricesList;
    }

    public List<String> createCityPeriods(FileInputStream fileInputStream, int idOfSheet)
            throws IOException {
        List<String> cityPeriodList = new ArrayList<>();
        Workbook workbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = workbook.getSheetAt(idOfSheet);
        for (Row row : sheet) {
            if (row.getRowNum() >= 7) {
                for (Cell cell : row) {
                    if (cell.getColumnIndex() == 0) {
                        String cellToString = cell.toString();
                        cityPeriodList.add(cellToString);
                    }
                }
            }
        }
        return cityPeriodList;
    }

    public void showDates() throws IOException, ParseException {
        ConvertStringToData convertStringToData = new ConvertStringToData();
        for (Date date : convertStringToData.getPeriodsAsDates()) {
            System.out.println(date);
        }
    }

    private class ConvertStringToData {
        ExcelDataDownloader excelDataDownloader = new ExcelDataDownloader();

        private List<String> iteratePeriods(int partOfPeriod) throws IOException {
            List<String> listOfPeriods = new ArrayList<>();
            for (String period : excelDataDownloader
                    .createCityPeriods(excelDataDownloader.chooseFilePath(), 2)) {
                String[] quarter = period.split(" ");
                listOfPeriods.add(quarter[partOfPeriod]);
            }
            return listOfPeriods;
        }


        private List<String> getQuarters() throws IOException {
            List<String> quarters = new ArrayList<>();
            for (String quarter : iteratePeriods(0)) {
                if (quarter.equals("I")) {
                    quarters.add("01");
                } else if (quarter.equals("II")) {
                    quarters.add("04");
                } else if (quarter.equals("III")) {
                    quarters.add("07");
                } else {
                    quarters.add("10");
                }
            }
            return quarters;
        }

        private List<String> getYears() throws IOException {
            return iteratePeriods(1);
        }

        private List<Date> getPeriodsAsDates() throws IOException, ParseException {
            List<Date> dates = new ArrayList<>();
            for (int i = 0; i < excelDataDownloader
                    .createCityPeriods(excelDataDownloader.chooseFilePath(), 2).size(); i++) {
                String dateAsString = getQuarters().get(i) + getYears().get(i);
                Date date = new SimpleDateFormat("MMyyyy", Locale.ENGLISH).parse(dateAsString);
                dates.add(date);
            }
            return dates;
        }
    }
}








