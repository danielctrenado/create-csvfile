package org.danielctrenado.utilities.commons.csv;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class CreateCsvFileImpl implements CreateCsvFile {
    @Override
    public void createCsvFile(String csvFile, String[] headers, long numberOfRecords) throws IOException {
        CSVFormat csvFormat = CSVFormat.DEFAULT.builder().setHeader(headers).build();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        try (final CSVPrinter printer = new CSVPrinter(new FileWriter(csvFile), csvFormat)) {
            for (int index = 1; index <= numberOfRecords; index++) {
                printer.printRecord(index, "Name" + index, "LastName" + index, formatter.format(date),
                        "Nationality" + index, "M", "000-00-0000", index + "mail@mail.com", "111-111-1111",
                        "AddressLine1", "AddressLine2", "TX", "Plano", "75024");
            }
        }

    }
}
