import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.List;

public class SkillController {

	private Connection connection;

	public SkillController(Connection connection) {
		this.connection = connection;
	}

	void insertsTodoS() throws SQLException {
		String csvFile = "resources/ArknightsScraperSkills.csv";
		String insertQuery = "INSERT INTO skill VALUES (?, ?, ?, ? ,? ,?, ?)";
		try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
			try (CSVReader csvReader = new CSVReader(new FileReader(csvFile))) {
				List<String[]> allData = csvReader.readAll();
				for (String[] row : allData) {
					preparedStatement.setString(1, row[0]);
					preparedStatement.setString(2, row[1]);
					preparedStatement.setString(3, row[2]);
					preparedStatement.setString(4, row[3]);
					preparedStatement.setInt(5, Integer.parseInt(row[4]));
					preparedStatement.setInt(6, Integer.parseInt(row[5]));
					preparedStatement.setBoolean(7, Boolean.parseBoolean(row[6]));
					preparedStatement.executeUpdate();
				}
			}
		} catch (IOException | CsvException e) {
			e.printStackTrace();
		}
	}

	void borrarTodoS() throws SQLException {
		String insertQuery = "DELETE FROM skill";
		try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
			preparedStatement.executeUpdate();
		}
	}

	public void mostrarS() throws SQLException {

		Statement st = connection.createStatement();
		ResultSet rs;
		String booleanBonito;

		rs = st.executeQuery("SELECT * FROM skill");
		while (rs.next()) {
			booleanBonito = (rs.getString("auto").equals("t")) ? "si" : "no";
			System.out.println("Operador: " + rs.getString("operator_name") + " " +
					"Nombre: " + rs.getString("name") + " " +
					"Tipo de recarga: " + rs.getString("charge") + " " +
					"Duracion: " + rs.getString("duration") + " " +
					"Coste: " + rs.getString("cost") + " " +
					"Coste inicial: " + rs.getString("initial") + " " +
					"Automatico?: " + booleanBonito);
		}
		rs.close();
		st.close();
	}
}
