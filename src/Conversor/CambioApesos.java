package Conversor;

import javax.swing.JOptionPane;

public class CambioApesos {
    
    double cambio;
    public void dolares_a_pesos(double cantidad){
        cambio = cantidad * 4063.20;
        cambio = (double) Math.round(cambio *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes " + cambio + " Pesos Colombianos");
    }
    public void euros_a_pesos(double cantidad){
        cambio = cantidad * 4379.96;
        cambio = (double) Math.round(cambio *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes " + cambio + " Pesos Colombianos");
    }
    public void libras_a_pesos(double cantidad){
        cambio = cantidad * 5119.95;
        cambio = (double) Math.round(cambio *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes " + cambio + " Pesos Colombianos");
    }
    public void yen_a_pesos(double cantidad){
        cambio = cantidad * 27.67;
        cambio = (double) Math.round(cambio *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes " + cambio + " Pesos Colombianos");
    }
    public void won_a_pesos(double cantidad){
        cambio = cantidad * 3.06;
        cambio = (double) Math.round(cambio *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes " + cambio + " Pesos Colombianos");
    }
}
