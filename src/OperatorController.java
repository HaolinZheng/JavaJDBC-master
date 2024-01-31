import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.List;

public class OperatorController {

	private Connection connection;

	public OperatorController(Connection connection) {
		this.connection = connection;
	}

	public void mostrarO() throws SQLException {

		Statement st = connection.createStatement();
		ResultSet rs;
		String booleanBonito;

		rs = st.executeQuery("SELECT operator.name,operator.position_op,operator.attack,operator.alter_op,class.primary_secondary FROM class INNER JOIN operator ON class.id_combo=operator.class");
		while (rs.next()) {
			booleanBonito = (rs.getString("alter_op").equals("t")) ? "Si" : "No";
			System.out.println("Nombre: " + rs.getString("name") + " " +
					"Tipo: " + rs.getString("position_op") + " " +
					"Tipo de ataque: " + rs.getString("attack") + " " +
					"Tiene Alters?: " + booleanBonito + " " +
					"Clase: " + rs.getString("primary_secondary"));
		}
		rs.close();
		st.close();
	}

	void insertsTodoO() throws SQLException {
		String csvFile = "resources/ArknightsScraperOperator.csv";
		String insertQuery = "INSERT INTO operator VALUES (?, ?, ?, ? ,?)";
		try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
			try (CSVReader csvReader = new CSVReader(new FileReader(csvFile))) {
				List<String[]> allData = csvReader.readAll();
				for (String[] row : allData) {
					preparedStatement.setString(1, row[0]);
					preparedStatement.setString(2, row[1]);
					preparedStatement.setString(3, row[2]);
					preparedStatement.setBoolean(4, Boolean.parseBoolean(row[3]));
					preparedStatement.setInt(5, Integer.parseInt(row[4]));
					preparedStatement.executeUpdate();
				}
			}
		} catch (IOException | CsvException e) {
			e.printStackTrace();
		}
	}

	void borrarTodoO() throws SQLException {
		String insertQuery = "DELETE FROM operator";
		try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
			preparedStatement.executeUpdate();
		}
	}

	public void buscarO(String columna, String pedir) throws SQLException {

		Statement st = connection.createStatement();
		ResultSet rs;
		String booleanBonito;

		rs = st.executeQuery("SELECT operator.name,operator.position_op,operator.attack,operator.alter_op,class.primary_secondary FROM class INNER JOIN operator ON class.id_combo=operator.class WHERE " + columna + "='" + pedir + "'");
		while (rs.next()) {
			booleanBonito = (rs.getString("alter_op").equals("t")) ? "Si" : "No";
			System.out.println("Nombre: " + rs.getString("name") + " " +
					"Tipo: " + rs.getString("position_op") + " " +
					"Tipo de ataque: " + rs.getString("attack") + " " +
					"Tiene Alters?: " + booleanBonito + " " +
					"Clase: " + rs.getString("primary_secondary"));
		}
	}

	public void borrarO(String columna, String pedir) {
		String insertQuery = "DELETE FROM operator WHERE " + columna + "='" + pedir + "'";
		try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void modificarO(String columna, String pedir, String replazo) {
		String insertQuery = "UPDATE operator " + "SET " + columna + " ='" + replazo + "' WHERE " + columna + " ='" + pedir + "'";
		try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
