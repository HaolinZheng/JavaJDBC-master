import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.List;

public class ClassController {

	private Connection connection;

	public ClassController(Connection connection) {
		this.connection = connection;
	}

	/**
	 * Método para buscar todos los operator que tenga
	 * @param id Variable que sera el punto de busqueda
	 * @throws SQLException Para que no pete
	 */
	public void buscarC(String id) throws SQLException {

		Statement st = connection.createStatement();
		ResultSet rs;
		String booleanBonito;
		rs = st.executeQuery("SELECT operator.name,operator.position_op,operator.attack,operator.alter_op FROM class INNER JOIN operator ON class.id_combo=operator.class WHERE id_combo='" + id + "'");
		while (rs.next()) {
			booleanBonito = (rs.getString("alter_op").equals("t")) ? "Si" : "No";
			System.out.println("Nombre: " + rs.getString("name") + " " +
					"Tipo: " + rs.getString("position_op") + " " +
					"Tipo de ataque: " + rs.getString("attack") + " " +
					"Tiene Alters?: " + booleanBonito);
		}
		rs.close();
		st.close();
	}

	/**
	 * Método donde se leera el CSV y lo colocaran con INSERT a la clase correspondiente
	 * @throws SQLException Para que no pete
	 */
	void insertsTodoC() throws SQLException {
		String csvFile = "resources/ArknightsScraperClass.csv";
		String insertQuery = "INSERT INTO class VALUES (?, ?)";
		try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
			try (CSVReader csvReader = new CSVReader(new FileReader(csvFile))) {
			List<String[]> allData = csvReader.readAll();
			for (String[] row : allData) {
				preparedStatement.setInt(1, Integer.parseInt(row[0]));
				preparedStatement.setString(2, row[1]);
				preparedStatement.executeUpdate();
				}
			}
		} catch (IOException | CsvException e) {
			e.printStackTrace();
		}
	}

	void borrarTodoC() throws SQLException {
		String insertQuery = "DELETE FROM class";
		try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
			preparedStatement.executeUpdate();
		}
	}

	public void mostrarC() throws SQLException {

		Statement st = connection.createStatement();
		ResultSet rs;

		rs = st.executeQuery("SELECT * FROM class");
		while (rs.next()) {
			System.out.println("Nombre: " + rs.getString("primary_secondary"));
		}
		rs.close();
		st.close();
	}

	public void borrarC(String id) {
		String insertQuery = "DELETE FROM class WHERE id_combo='" + id + "'";
		try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
