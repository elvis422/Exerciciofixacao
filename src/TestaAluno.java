
public class TestaAluno {
    
    
    public static void main (String [] args)
    {
        Aluno a1 = new Aluno();
        
        a1.nome = "Elvis Douglas ";
        a1.CPF = "000.000.000-00";
        
        Data d1 = new Data();
        d1.dia = 22;
        d1.mes = 11;
        d1.ano = 1994;
        a1.dataDeNascimento = d1;
        
        String dados = a1.imprimir();     
        System.out.println(dados);
    
        
    }
  
    
}
