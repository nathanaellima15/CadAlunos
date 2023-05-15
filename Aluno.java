public class Aluno {

    public String Nome, sexo,endereco, cidade, estado, NomePai, NomeMae;
    public int CEP,telefone, DayNascimento, RG, GrauEscolar;
    
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.Nome = "André Martins";
        aluno1.sexo = "masculino";
        aluno1.endereco = "Rua x, 890";
        aluno1.cidade = "Mapassê";
        aluno1.estado = "Ceara";
        aluno1.NomePai = "Josá Martin";
        aluno1.NomeMae = "Ana Martinha";
        aluno1.CEP =102456827;
        aluno1.telefone = 2344565;
        aluno1.DayNascimento =07022005;
        aluno1.RG = 345644334;
        aluno1.GrauEscolar = 2;
        
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
