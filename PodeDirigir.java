import javax.swing.JOptionPane;

public class PodeDirigir {
    public static void main(String args[]){
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade: "));

        String podeDirigir;
        // if(idade >= 18){
        //     podeDirigir = "Sim, você pode dirigir!";
        // }else{
        //     podeDirigir = "Você não pode dirigir!";
        // }

        podeDirigir = idade >= 18 ? "Sim, você pode Dirigir!" : "Você não pode dirigir, por enquanto...";

        JOptionPane.showMessageDialog(null, podeDirigir);
    }
}
