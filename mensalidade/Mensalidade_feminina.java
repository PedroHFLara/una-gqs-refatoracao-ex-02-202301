package mensalidade;

public class Mensalidade_feminina {
	private static double mensalidade;


    public static double calcularMensalidade_feminina(int idade, String sexo) {
        if (sexo.equalsIgnoreCase("F")) {
            if (idade <= 18) {
                setMensalidade(60.0);
            } else if (idade <= 25) {
                setMensalidade(90.0);
            } else if (idade <= 40) {
                setMensalidade(85.0);
            } else if (idade <= 50) {
                setMensalidade(65.0);
            } else {
                setMensalidade(50.0);
            }
        } else {
            System.out.println("Sexo inválido.");
            setMensalidade(0.0);
        }

        return getMensalidade();
    }


    public static double getMensalidade() {
        return mensalidade;
    }


    public static void setMensalidade(double mensalidade) {
        Mensalidade_feminina.mensalidade = mensalidade;
    }
    
    
}
