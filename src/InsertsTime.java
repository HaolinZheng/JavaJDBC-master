import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

public class InsertsTime {

    private Connection connection;

    public InsertsTime(Connection connection) {
        this.connection = connection;
    }
    public void reponerInserts() throws SQLException, IOException {

        Statement st = connection.createStatement();
        ResultSet rs;
        String csvFile = "resources/ArknightsScraperOperator.csv";

        try (CSVReader csvReader = new CSVReader(new FileReader(csvFile))) {
            List<String[]> allData = csvReader.readAll();

            for (String[] row : allData) {
                for (String cell : row) {
                    System.out.print(cell + "\t");
                }
                System.out.println(); // Salto de línea después de cada fila
            }
        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }

    }
}