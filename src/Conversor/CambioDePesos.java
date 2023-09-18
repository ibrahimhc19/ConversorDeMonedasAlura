package Conversor;

import javax.swing.JOptionPane;

public class CambioDePesos {
    
    double cambio;
            
    public void pesos_a_dolares(double cantidad){
        cambio = cantidad / 4063.20;
        cambio = (double) Math.round(cambio *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes " + cambio + " Dólares");
    }
    public void pesos_a_euros(double cantidad){
        cambio = cantidad / 4379.96;
        cambio = (double) Math.round(cambio *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes " + cambio + " Euros");
    }
    public void pesos_a_libras(double cantidad){
        cambio = cantidad / 5119.95;
        cambio = (double) Math.round(cambio *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes " + cambio + " Libras Esterlinas");
    }
    public void pesos_a_yen(double cantidad){
        cambio = cantidad / 27.67;
        cambio = (double) Math.round(cambio *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes " + cambio + " Yenes");
    }
    public void pesos_a_won(double cantidad){
        cambio = cantidad / 3.06;
        cambio = (double) Math.round(cambio *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes " + cambio + " Wons");
    }
}
