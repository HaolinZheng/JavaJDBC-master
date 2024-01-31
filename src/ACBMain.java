import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;

public class ACBMain {

	public static void main(String[] args) throws SQLException, IOException {
		ACBMenu menu = new ACBMenu();
		
		ConnectionFactory connectionFactory = ConnectionFactory.getInstance();
		Connection c = connectionFactory.connect();

		ClassController classController = new ClassController(c);
		OperatorController operatorController = new OperatorController(c);
		SkillController skillController = new SkillController(c);

		int option = menu.mainMenu(), primary;
		while (option > 0 && option < 23) {
			switch (option) {
			case 1:
				classController.mostrarC();
				break;
			case 2:
				primary = menu.primaryMenu();
				switch (primary) {
					case 1 -> classController.buscarC(menu.casterMenu(primary));
					case 2 -> classController.buscarC(menu.defenderMenu(primary));
					case 3 -> classController.buscarC(menu.guardMenu(primary));
					case 4 -> classController.buscarC(menu.medicMenu(primary));
					case 5 -> classController.buscarC(menu.sniperMenu(primary));
					case 6 -> classController.buscarC(menu.specialistMenu(primary));
					case 7 -> classController.buscarC(menu.supporterMenu(primary));
					case 8 -> classController.buscarC(menu.vanguardMenu(primary));
					case 9 -> {}
				}
				break;
			case 3:
				classController.insertsTodoC();
				break;
			case 4:
				primary = menu.primaryMenu();
				switch (primary) {
					case 1 -> classController.borrarC(menu.casterMenu(primary));
					case 2 -> classController.borrarC(menu.defenderMenu(primary));
					case 3 -> classController.borrarC(menu.guardMenu(primary));
					case 4 -> classController.borrarC(menu.medicMenu(primary));
					case 5 -> classController.borrarC(menu.sniperMenu(primary));
					case 6 -> classController.borrarC(menu.specialistMenu(primary));
					case 7 -> classController.borrarC(menu.supporterMenu(primary));
					case 8 -> classController.borrarC(menu.vanguardMenu(primary));
					case 9 -> {}
				}
				break;
			case 5:
				classController.borrarTodoC();
				break;
			case 6:
				operatorController.mostrarO();
				break;
			case 7:
				operatorController.buscarO(menu.pedirO(),menu.pedir());
				break;
			case 8:
				operatorController.insertsTodoO();
				break;
			case 9:
				operatorController.modificarO(menu.pedirO(),menu.pedir(), menu.cambio());
				break;
			case 10:
				operatorController.borrarO(menu.pedirO(),menu.pedir());
				break;
			case 11:
				operatorController.borrarTodoO();
				break;
			case 12:
				skillController.mostrarS();
				break;
			case 13:
				skillController.buscarS(menu.pedirS(),menu.pedir());
				break;
			case 14:
				skillController.insertsTodoS();
				break;
			case 15:
				skillController.modificarS(menu.pedirS(),menu.pedir(), menu.cambio());
				break;
			case 16:
				skillController.borrarS(menu.pedirS(),menu.pedir());
				break;
			case 17:
				skillController.borrarTodoS();
				break;
			case 18:
				System.exit(0);
				break;
			default:
				System.out.println("Introdueixi una de les opcions anteriors");
				break;
			}
			option = menu.mainMenu();
		}
	}
}