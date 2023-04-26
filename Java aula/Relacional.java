/* Operadores Relacionais: >,<, >=, <=

    Operadores lógiocos: Booleanos

    E -> && (retorna verdadeiro se os dois lados forem verdadedeiros)
    OU -> || ((retorna verdadeiro se pelo menos um dos lados for verdadeiro))
    == -> Verifica se o número da esquerda é igual ao da direita
    != -> diferente Verifica se os números são diferentes
 */


public class Relacional {
    public static void main(String[] args) {
        int idadeDemaior = 18;
        int idadeProfessor = 31;
        int idadeAluno = 16;
        System.out.println("Professor é maior de idade? " + (idadeProfessor>idadeDemaior));
        System.out.println("Aluno é menor de idade? " + (idadeAluno<idadeDemaior));
        System.out.println(idadeDemaior==18 && idadeAluno !=16);
        System.out.println(idadeDemaior==18 || idadeAluno !=16);
        System.out.println(idadeDemaior==18 && idadeAluno ==16);
    }
}
