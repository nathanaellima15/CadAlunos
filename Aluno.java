
import java.util.Scanner;

public class Aluno {

    public String Nome, sexo,endereco, cidade, estado, NomePai, NomeMae;
    public int CEP,telefone, DayNascimento, RG, GrauEscolar;
    
    public static void main(String[] args) {
        
        Aluno aluno1 = new Aluno();
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        for (int i=1; i<=50; i++){
            System.out.println("Informe os dados do aluno "+ i);
            Cadastro(aluno1, scanner);
            System.out.println("digite 0 pra sair e 1 para continuar:");
            a = i;
            int quest = scanner.nextInt(); 
            if (quest == 0){
                break;
            }
        }
        for (int i=1; i<=a; i++){
            System.out.println("Dados do aluno "+ i);
            Exibir(aluno1);
        }
        
    }    
    public static void Cadastro(Aluno aluno1, Scanner scanner){  
        
        System.out.print("Nome: ");
        aluno1.Nome = scanner.next();
        System.out.print("Sexo: ");
        aluno1.sexo = scanner.next();
        System.out.print("Endereço: ");
        aluno1.endereco = scanner.next();
        System.out.print("Cidade: ");
        aluno1.cidade = scanner.next();
        System.out.print("Estado: ");
        aluno1.estado = scanner.next();
        System.out.print("Pai: ");
        aluno1.NomePai = scanner.next();
        System.out.print("Mae: ");
        aluno1.NomeMae = scanner.next();
        System.out.print("CEP: ");
        aluno1.CEP = scanner.nextInt();
        System.out.print("Fone: ");
        aluno1.telefone = scanner.nextInt();
        System.out.print("Data de nascimento: ");
        aluno1.DayNascimento = scanner.nextInt();
        System.out.print("RG: ");
        aluno1.RG = scanner.nextInt();
        System.out.print("Grau Escolar: ");
        aluno1.GrauEscolar = scanner.nextInt();
    }    
    
    public static void Exibir(Aluno aluno1){
        System.out.println("Nome: "+ aluno1.Nome);
        System.out.println("Sexo: "+ aluno1.sexo);
        System.out.println("Endereço: "+ aluno1.endereco);
        System.out.println("Cidade: "+ aluno1.cidade);
        System.out.println("Estado: "+ aluno1.estado);
        System.out.println("Pai: "+ aluno1.NomePai);
        System.out.println("Mae: "+ aluno1.NomeMae);
        System.out.println("CEP: "+ aluno1.CEP);
        System.out.println("Fone: "+ aluno1.telefone);
        System.out.println("Data de nascimento: "+ aluno1.DayNascimento);
        System.out.println("RG: "+ aluno1.RG);
        System.out.println("Grau Escolar: "+ aluno1.GrauEscolar);
        
    }
}
