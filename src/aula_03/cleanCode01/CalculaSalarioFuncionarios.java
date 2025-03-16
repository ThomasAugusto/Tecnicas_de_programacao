package aula_03.cleanCode01;
// alterar pacote se necessario



public class CalculaSalarioFuncionarios {
    
    Float ACRESCIMO_SALARIO_MAIOR_MIL = 0.2f;
    Float ACRESCIMO_SALARIO_MENOR_MIL = 0.1f;
    
   public float CalculaSalario(Funcionario funcionario) {
	   float salario = funcionario.getSalarioFuncionario();
	   if (salario < 1000) {
		   return salario + salario * ACRESCIMO_SALARIO_MENOR_MIL;
	   }
	   return salario + salario * ACRESCIMO_SALARIO_MAIOR_MIL;
   }       
    		    
}




       



