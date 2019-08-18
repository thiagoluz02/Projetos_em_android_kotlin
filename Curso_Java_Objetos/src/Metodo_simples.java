import javax.swing.JOptionPane;

public class Metodo_simples {
    
    static double valor1 =0, valor2=0, soma = 0;
    
    public static void man(String arg[]){
        
        valor1 = Double.parseDouble(JOptionPane.showInputDialog(null,"A soma dos valores e :"+soma));
        valor2 =Double.parseDouble(JOptionPane.showInputDialog(null,"A soma dos valores e :"+soma));
         
        somar_valores();
        
        JOptionPane.showMessageDialog(null,"A soma dos valores é :"+ soma);
    }

    private static void somar_valores() {
        
        soma =valor1 +valor2;
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}