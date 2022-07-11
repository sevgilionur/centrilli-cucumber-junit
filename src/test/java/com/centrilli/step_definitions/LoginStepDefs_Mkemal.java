package com.centrilli.step_definitions;

import com.centrilli.pages.LoginPage_MKemal;
import com.centrilli.utilities.Driver;
import com.centrilli.utilities.PropertyReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class LoginStepDefs_Mkemal {
    LoginPage_MKemal loginPage = new LoginPage_MKemal();
    @Given("I am on the login page_mks")
    public void iAmOnTheLoginPage_mks() {
        Driver.getDriver().get(PropertyReader.getProperty("url"));
    }

    @Then("I enter username and password_mks")
    public void iEnterUsernameAndPassword_mks() {
        loginPage.enterCridentials(" ", " ");

    }

    @When("I click enter I should be navigate to Dashboard_mks")
    public void iClickEnterIShouldBeNavigateToDashboard_mks() {
    }

    @Given("Write Excel")
    public void writeExcel() throws FileNotFoundException {



                XSSFWorkbook workbook = new XSSFWorkbook();
                XSSFSheet sheet = workbook.createSheet("Java Books");

                Object[][] bookData = {
                        {"Baslik ", "MKS", 85},
                        {"Effective Java", "Joshua Bloch", 36},
                        {"Clean Code", "Robert martin", 42},
                        {"Thinking in Java", "Bruce Eckel", 35},
                };

                int rowCount = 0;

                for (Object[] aBook : bookData) {
                    Row row = sheet.createRow(++rowCount);

                    int columnCount = 0;

                    for (Object field : aBook) {
                        Cell cell = row.createCell(++columnCount);
                        if (field instanceof String) {
                            cell.setCellValue((String) field);
                        } else if (field instanceof Integer) {
                            cell.setCellValue((Integer) field);
                        }
                    }

                }


                try (FileOutputStream outputStream = new FileOutputStream("JavaBooks.xlsx")) {
                    workbook.write(outputStream);
                } catch (IOException e) {
                    e.printStackTrace();
                }
    }

        }


