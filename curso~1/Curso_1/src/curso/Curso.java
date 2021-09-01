package curso;

import javax.swing.JOptionPane;

public class Curso {

    public static void main(String[] args) {

        Materia a = new Materia();

        int qtd = Integer.parseInt(JOptionPane.showInputDialog("Quantas matérias deseja cadastrar?"));
        for (int i = 0; i < qtd; i++) {
            String nome_mat = JOptionPane.showInputDialog((i+1) + "º matéria para ser adicionada: ");

            a.addMateria(nome_mat);
        }
        
        a.listaMateria();
        
        String busca_mat = JOptionPane.showInputDialog("Qual matéria deseja buscar?");
        a.buscaMat(busca_mat);
        
        String deleta = JOptionPane.showInputDialog("Qual matéria deseja deletar?");
        a.delMat(deleta);
        
        a.listaMateria();
    }

}
