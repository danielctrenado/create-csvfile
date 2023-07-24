package org.danielctrenado.utilities.commons.csv;

public class CreateCsvFileMainApplication {

    public static void main(String[] args) {
        System.out.println("Create csv file");
        long numberOfRecords = 1000000;
        String csvFile = "persons_" + numberOfRecords + ".csv";
        String[] headers = {"id", "firstName", "lastName", "birthdate", "nationality", "sex",
                "ssn", "email", "cellular", "address1", "address2", "state", "city", "zip"};
        try {
            new CreateCsvFileImpl().createCsvFile(csvFile, headers, numberOfRecords);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
