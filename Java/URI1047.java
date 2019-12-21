import java.io.IOException;
import java.util.Scanner;

public class URI1047 {

	public static void main(String[] args) throws IOException {
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int horaIni, minutoIni, horaFinal, minutoFinal, horas = 0, minutos = 0;

		horaIni = ler.nextInt();
		minutoIni = ler.nextInt();
		horaFinal = ler.nextInt();
		minutoFinal = ler.nextInt();

		if (horaIni > horaFinal && minutoIni > minutoFinal) {
			horas = 24 - (horaIni - horaFinal) - 1;
			minutos = 60 - (minutoIni - minutoFinal);
		} else if (horaIni == horaFinal && minutoIni == minutoFinal) {
			horas = 24;
		} else if (minutoIni > minutoFinal && horaIni == horaFinal) {
			horas = 24 - 1;
			minutos = (minutoFinal - minutoIni) + 60;
		} else if (minutoIni > minutoFinal && horaIni != horaFinal) {
			horas = (horaFinal - horaIni) - 1;
			minutos = (minutoFinal - minutoIni) + 60;
		} else {
			horas = horaFinal - horaIni;
			minutos = minutoFinal - minutoIni;
		}

		System.out.println("O JOGO DUROU " + horas + " HORA(S) E " + minutos + " MINUTO(S)");

	}
}