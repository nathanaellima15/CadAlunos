# CadAlunos
app para cadastro de alunos

### Fase 1

proposta de construir sistema de informação para cadastro dos alunos: 

- Nome,  
- sexo,  
- endereço,  
- cidade, 
- estado, 
- CEP,  
- telefone,  
- data de nascimento,  
- RG,  
- nome pai,  
- nome mae,  
- grau escolaridade. 

```mermaid   
classDiagram
 class Aluno{
    +String Nome,  
    +String sexo,  
    +String endereco,  
    +String cidade, 
    +String estado, 
    +int CEP,  
    +int telefone,  
    +int DayNascimento,  
    +int RG,  
    +String NomePai,  
    +String NomeMae,  
    +int GrauEscolar.
 }
 ```

## Fase 2

Atribuição de valores as variaveis

Usuário entra com valores para as variáveis


## Fase 3

Criação dos métodos Cadastro e Exibir, no metodo principal o Main chamamos o a função cadastrar e após, exibir os alunos cadastrados.

- Implementação para Cadastro de 50 alunos, significa repetir o algoritimo de entrada de dados 50 vezes.
- Temos uma repetição no metodo Main para o cadastro e outra para a exibição.
- No cadastro incluiu-se uma função para interromper o cadastro.
- Na hora de exibir o programa só vai mostrar os alunos que foram cadastrados.

```
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

```



