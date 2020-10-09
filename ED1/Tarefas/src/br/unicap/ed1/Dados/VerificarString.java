package br.unicap.ed1.Dados;

public class VerificarString {
		public static boolean VerificarConta(String C) {
			if (C.length() != 11) {
				System.out.println("N�mero da conta inv�lido. Informe exatamente 6 caracteres");
				return false;
			} else if (VerificarContaNum(C) == false) {
				System.out.println("N�mero de conta inv�lido. Informe apenas d�gitos num�ricos.");
				return false;
			}
			return true;
		}

		public static boolean VerificarContaNum(String C) {
			int tam = C.length(), i;
			char num;
			boolean Resultado = true;

			for (i = 0; i < tam; i++) {
				num = C.charAt(i);
				if (Character.isDigit(num) == false) {
					Resultado = false;
					break;
				}
			}
			if (tam < 10 && tam > 1) {
				System.out.println("A prioridade deve ser de 1 � 10");	
				 return false;	
			}
			else {
				return true;
			}
		}
	}
