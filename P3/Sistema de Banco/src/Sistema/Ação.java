package Sistema;
public class A��o {
	private Conta[]C;
	public static boolean VerificarC(String C) {
		int tam = C.length(),i;
		boolean Resultado = true;
        char num;
        
        for(i = 0;i < tam;i++){
            num = C.charAt(i);
            if(Character.isDigit(num) == false){
                Resultado = false;
                break;
            }
        }
        return Resultado;
	}
}
