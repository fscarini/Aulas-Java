import javax.swing.JOptionPane;

public class SwitchCase {
    public static void main(String args[]){
        int nota;
        String nomeAluno;
        nomeAluno = JOptionPane.showInputDialog("Digite o nome do aluno: ");
        nota = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota do aluno " + nomeAluno + ": "));

        switch(nota){
            case 10:
                JOptionPane.showMessageDialog(null, String.format("Parabéns, %s! Conceito A+!", nomeAluno));
                break;
            case 9:
                JOptionPane.showMessageDialog(null, "Parabéns, " + nomeAluno + "! Conceito A!");
                break;
            case 8:
                JOptionPane.showMessageDialog(null, "Parabéns, " + nomeAluno + "! Conceito B");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "Parabéns, " + nomeAluno + "! Conceito C");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Reprovado. Boa sorte da próxima vez, " + nomeAluno + "!");  
                
        }

    }
}
