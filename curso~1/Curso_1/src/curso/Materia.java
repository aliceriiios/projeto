package curso;

import java.util.LinkedList;
import javax.swing.JOptionPane;

class Materia {

    LinkedList<String> mat = new LinkedList<>();

    void addMateria(String nome) {
        mat.add(nome);
    }

    void listaMateria() {
        String msg = "";
        for (String a : mat) {
            msg = msg + "\n" + a;
        }
        JOptionPane.showMessageDialog(null, msg);
    }

    public void buscaMat(String busca) {
        String msg = "A matéria '" + busca + "' \n !NÃO FOI ENCONTRADA!";
        for (String a : mat) {
            if (a.equals(busca)) {
                msg = "A matéria '" + busca + "' \n !FOI ENCONTRADA!";
            }
        }
        JOptionPane.showMessageDialog(null, msg);

    }

    void delMat(String deleta) {
        for (String a : mat) {
            if (a.equals(deleta)) {
                mat.remove(a);
                break;
            }

        }
    }
}
