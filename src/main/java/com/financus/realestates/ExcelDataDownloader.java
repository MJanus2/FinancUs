package com.financus.realestates;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Objects;

public class ExcelDataDownloader {

    public FileInputStream chooseFilePath() throws FileNotFoundException {
        //to edit
        return new FileInputStream(new File("C:\\Users\\majan" +
                "\\OneDrive\\Janus Global Investments\\Nieruchomości\\Analizy\\NBP\\ceny_mieszkan.xlsx"));
    }

    public void readNBPDataFromExcel(int idOfSheet, FileInputStream fileInputStream) throws IOException {

        Workbook workbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = workbook.getSheetAt(idOfSheet);
        for (Row row : sheet) {
            if (row.getRowNum() < 6) {
                continue;
            } else {
                System.out.println();
                for (Cell cell : row) {
                    Object value = printCellValue(cell, workbook);
                    System.out.print(value + " ");
                }
            }
        }
    }

    private static Object printCellValue(Cell cell, Workbook workbook) {
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

    public void createLodzPeriods(FileInputStream fileInputStream, int idOfSheet) throws IOException {
        Workbook workbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = workbook.getSheetAt(idOfSheet);
        for (Row row : sheet) {
            if (row.getRowNum() < 6) {
                continue;
            } else {
                    System.out.println();
                    for (Cell cell : row) {
                        if (printCellValue(cell, workbook).equals("Łódź"))
                        System.out.print(cell + " ");
                    }
                }
            }
        }


    }





