package principal;

import model.PF;
import model.PJ;
import javax.swing.*;

public class principal {
    
    public static void main(String[] args) {
        int opc;
        PF pf = new PF();
        PJ pj = new PJ();
        opc = Integer.parseInt(JOptionPane.showInputDialog("Você deseja entrar como:\n1-PF\n2-PJ "));
        
        if(opc==1){
            pf.leitura();
            pf.imprimir();
        }
        if(opc==2) {
            pj.leitura();
            pj.imprimir();
        }
        if (opc>2) {
            JOptionPane.showMessageDialog(null,"Opçao invalida.");
        }
    }
}
