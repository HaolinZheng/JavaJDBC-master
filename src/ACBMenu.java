import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ACBMenu {
	private int option;
	private String optionS;

	public ACBMenu() {
		super();
	}

	public int mainMenu() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		do {
			System.out.println(" \nMENU PRINCIPAL \n");
			System.out.println("1. Mostra clases");
			System.out.println("2. Buscar operator por clase");
			System.out.println("3. Crear nueva clases");
			System.out.println("4. Crear clases mediante CSV");
			System.out.println("5. Modificar clase por ID");
			System.out.println("6. Borrar clases por ID");
			System.out.println("7. Borrar todas las clases");
			System.out.println("8. Mostra operadores");
			System.out.println("9. Buscar operador");
			System.out.println("10. Crear nuevo operador");
			System.out.println("11. Crear operadores mediante CSV");
			System.out.println("12. Modificar operador");
			System.out.println("13. Borrar operador");
			System.out.println("14. Borrar todas los operadores");
			System.out.println("15. Mostra habilidades");
			System.out.println("16. Buscar habilidad");
			System.out.println("17. Crear nuevo habilidad");
			System.out.println("18. Crear habilidades mediante CSV");
			System.out.println("19. Modificar habilidad");
			System.out.println("20. Borrar habilidad");
			System.out.println("21. Borrar todas las habilidades");
			System.out.println("22. Salir");
			System.out.println("Elige: ");
			try {
				option = Integer.parseInt(br.readLine());
			} catch (NumberFormatException | IOException e) {
				System.out.println("valor no vàlid");
				e.printStackTrace();
			}
		} while (option != 1 && option != 2 && option != 3 && option != 4 && option != 5 && option != 6 && option != 7 && option != 8 && option != 9 && option != 10 && option != 11 && option != 12 && option != 13 && option != 14 && option != 15 && option != 16 && option != 17 && option != 18 && option != 19 && option != 20 && option != 21 && option != 22);
		return option;
	}

	public int primaryMenu() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do {
			System.out.println("1. Caster");
			System.out.println("2. Defender");
			System.out.println("3. Guard");
			System.out.println("4. Medic");
			System.out.println("5. Sniper");
			System.out.println("6. Specialist");
			System.out.println("7. Supporter");
			System.out.println("8. Vanguard");
			System.out.println("9. Es uno personalizado");
			System.out.println("10. Salir");
			System.out.println("Elige: ");
			try {
				option = Integer.parseInt(br.readLine());
			} catch (NumberFormatException | IOException e) {
				System.out.println("valor no vàlid");
				e.printStackTrace();
			}
		} while (option != 1 && option != 2 && option != 3 && option != 4 && option != 5 && option != 6 && option != 7 && option != 8 && option != 9);
		return option;
	}

	public String casterMenu(int idP) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do {
			System.out.println("1. AoE / Splash Caster");
			System.out.println("2. Burninator / Blast Caster");
			System.out.println("3. Chain Caster");
			System.out.println("4. Charge / Mystic Caster");
			System.out.println("5. Drone / Mech-Accord");
			System.out.println("6. Modal / Phalanx Caster");
			System.out.println("7. ST / Core Caster");
			System.out.println("8. Salir");
			System.out.println("Elige: ");
			try {
				option = Integer.parseInt(br.readLine());
			} catch (NumberFormatException | IOException e) {
				System.out.println("valor no vàlid");
				e.printStackTrace();
			}
		} while (option != 1 && option != 2 && option != 3 && option != 4 && option != 5 && option != 6 && option != 7 && option != 8);
		return idP + "" + option;
	}
	public String defenderMenu(int idP) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do {
			System.out.println("1. Arts Protector");
			System.out.println("2. Duelist");
			System.out.println("3. Enmity / Juggernaut");
			System.out.println("4. Fortress");
			System.out.println("5. Healing / Guardian");
			System.out.println("6. Normal / Protector");
			System.out.println("7. Sentinel Protector");
			System.out.println("8. Salir");
			System.out.println("Elige: ");
			try {
				option = Integer.parseInt(br.readLine());
			} catch (NumberFormatException | IOException e) {
				System.out.println("valor no vàlid");
				e.printStackTrace();
			}
		} while (option != 1 && option != 2 && option != 3 && option != 4 && option != 5 && option != 6 && option != 7 && option != 8);
		return idP + "" + option;
	}

	public String guardMenu(int idP) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do {
			System.out.println("1. Arts Fighter");
			System.out.println("2. AoE / Centurion");
			System.out.println("3. Brawler / Fighter");
			System.out.println("4. Crusher");
			System.out.println("5. Dualstrike / Swordmaster");
			System.out.println("6. Duelist / Dreadnought");
			System.out.println("7. Enmity / Musha");
			System.out.println("8. Liberator Guard");
			System.out.println("9. Ranged / Lord");
			System.out.println("10. Reaper Guard");
			System.out.println("11. Support / Instructor");
			System.out.println("12. Salir");
			System.out.println("Elige: ");
			try {
				option = Integer.parseInt(br.readLine());
			} catch (NumberFormatException | IOException e) {
				System.out.println("valor no vàlid");
				e.printStackTrace();
			}
		} while (option != 1 && option != 2 && option != 3 && option != 4 && option != 5 && option != 6 && option != 7 && option != 8 && option != 9 && option != 10 && option != 11 && option != 12);

		return idP + "" + option;
	}

	public String medicMenu(int idP) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do {
			System.out.println("1. AoE / Multi-target Medic");
			System.out.println("2. Chain Healer");
			System.out.println("3. Incantation");
			System.out.println("4. ST / Medic");
			System.out.println("5. Wandering Medic");
			System.out.println("6. Wide-Range / Therapist");
			System.out.println("7. Salir");
			System.out.println("Elige: ");
			try {
				option = Integer.parseInt(br.readLine());
			} catch (NumberFormatException | IOException e) {
				System.out.println("valor no vàlid");
				e.printStackTrace();
			}
		} while (option != 1 && option != 2 && option != 3 && option != 4 && option != 5 && option != 6 && option != 7);
		return idP + "" + option;
	}

	public String sniperMenu(int idP) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do {
			System.out.println("1. Aftershock / Flinger");
			System.out.println("2. Anti-Air / Marksman");
			System.out.println("3. AoE / Artilleryman");
			System.out.println("4. Boomstick / Spreadshooter");
			System.out.println("5. Close Range / Heavyshooter");
			System.out.println("6. Heavyweight / Besieger");
			System.out.println("7. Long-Range / Deadeye");
			System.out.println("8. Salir");
			System.out.println("Elige: ");
			try {
				option = Integer.parseInt(br.readLine());
			} catch (NumberFormatException | IOException e) {
				System.out.println("valor no vàlid");
				e.printStackTrace();
			}
		} while (option != 1 && option != 2 && option != 3 && option != 4 && option != 5 && option != 6 && option != 7 && option != 8);
		return idP + "" + option;
	}

	public String specialistMenu(int idP) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do {
			System.out.println("1. Ambusher");
			System.out.println("2. DP-Drain / Merchant");
			System.out.println("3. Fast-Redeploy / Executor");
			System.out.println("4. Puller / Hookmaster");
			System.out.println("5. Pusher / Push Stroker");
			System.out.println("6. Sacrificial / Geek");
			System.out.println("7. Substitute / Dollkeeper");
			System.out.println("8. Trapmaster");
			System.out.println("9. Salir");
			System.out.println("Elige: ");
			try {
				option = Integer.parseInt(br.readLine());
			} catch (NumberFormatException | IOException e) {
				System.out.println("valor no vàlid");
				e.printStackTrace();
			}
		} while (option != 1 && option != 2 && option != 3 && option != 4 && option != 5 && option != 6 && option != 7 && option != 8 && option != 9);
		return idP + "" + option;
	}

	public String supporterMenu(int idP) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do {
			System.out.println("1. Artificer");
			System.out.println("2. Aura / Bard");
			System.out.println("3. Buffer / Abjurer");
			System.out.println("4. Debuffer / Hexer");
			System.out.println("5. Slower / Decel Binder");
			System.out.println("6. Summoner");
			System.out.println("7. Salir");
			System.out.println("Elige: ");
			try {
				option = Integer.parseInt(br.readLine());
			} catch (NumberFormatException | IOException e) {
				System.out.println("valor no vàlid");
				e.printStackTrace();
			}
		} while (option != 1 && option != 2 && option != 3 && option != 4 && option != 5 && option != 6 && option != 7);
		return idP + "" + option;
	}

	public String vanguardMenu(int idP) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do {
			System.out.println("1. Agent");
			System.out.println("2. DP-On-Kill / Charger");
			System.out.println("3. Flagbearer / Standard Bearer");
			System.out.println("4. Skill-DP / Pioneer");
			System.out.println("5. Summoner / Tactician");
			System.out.println("6. Salir");
			System.out.println("Elige: ");
			try {
				option = Integer.parseInt(br.readLine());
			} catch (NumberFormatException | IOException e) {
				System.out.println("valor no vàlid");
				e.printStackTrace();
			}
		} while (option != 1 && option != 2 && option != 3 && option != 4 && option != 5 && option != 6);
		return idP + "" + option;
	}

	public String pedirO() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do {
			System.out.println("name");
			System.out.println("position_op");
			System.out.println("attack");
			System.out.println("alter_op");
			System.out.println("Escriba cualquier otra cosa para salir");
			System.out.println("Elige: ");
			try {
				optionS = br.readLine();
			} catch (NumberFormatException | IOException e) {
				System.out.println("valor no vàlid");
				e.printStackTrace();
			}
		} while (!optionS.equals("name") && !optionS.equals("position_op") && !optionS.equals("attack") && !optionS.equals("alter_op"));
		return optionS;
	}

	public String pedir() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Escriba lo quieres buscar");
		optionS = br.readLine();
		return optionS;
	}
}
