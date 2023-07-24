package org.danielctrenado.utilities.commons.csv;

import java.io.IOException;

public interface CreateCsvFile {

    void createCsvFile(String csvFile, String[] headers, long numberOfRecords) throws IOException;

}
