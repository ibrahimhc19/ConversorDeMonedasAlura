package Conversor;

import javax.swing.JOptionPane;

public class Conversor {

    public static void main(String[] args) {

        CambioDePesos convertirPesos = new CambioDePesos();
        CambioApesos ConvertirMonedas = new CambioApesos();

        String[] monedas = {"Pesos Colombianos a Dólares", "Pesos Colombianos a Euros", "Pesos Colombianos a Libras Esterlinas", "Pesos Colombianos a Yenes", "Pesos Colombianos a Wons", "Dólares a Pesos Colombianos", "Euros a Pesos Colombianos", "Libras Esterlinas a Pesos Colombianos", "Yenes a Pesos Colombianos", "Wons a Pesos Colombianos"};

        String opcionSeleccionada = (String) JOptionPane.showInputDialog(null, "Selecciona el tipo de cambio que quieres hacer:", "Conversor de Monedas", JOptionPane.QUESTION_MESSAGE, null, monedas, monedas[0]);
       
        if (opcionSeleccionada == null) {
            JOptionPane.showMessageDialog(null, "Ha cancelado la conversión", "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        
        double entrada;
        
        while (true) {
            
            try {
                
                entrada = Double.parseDouble(JOptionPane.showInputDialog("Introduce cantidad de dinero a convertir"));
                break;
                
            } catch (NumberFormatException e) {
                
                JOptionPane.showMessageDialog(null, "Ingresa un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
            
            } catch (NullPointerException e) {
                
                JOptionPane.showMessageDialog(null, "Ha cancelado la conversión", "Error", JOptionPane.ERROR_MESSAGE);
            }
            System.exit(0);

        }

        switch (opcionSeleccionada) {
            case "Pesos Colombianos a Dólares" -> {
                convertirPesos.pesos_a_dolares(entrada);
                break;
            }
            case "Pesos Colombianos a Euros" -> {
                convertirPesos.pesos_a_euros(entrada);
                break;
            }
            case "Pesos Colombianos a Libras Esterlinas" -> {
                convertirPesos.pesos_a_libras(entrada);
                break;
            }
            case "Pesos Colombianos a Yenes" -> {
                convertirPesos.pesos_a_yen(entrada);
                break;
            }
            case "Pesos Colombianos a Wons" -> {
                convertirPesos.pesos_a_won(entrada);
                break;
            }
            case "Dólares a Pesos Colombianos" -> {
                ConvertirMonedas.dolares_a_pesos(entrada);
                break;
            }
            case "Euros a Pesos Colombianos" -> {
                ConvertirMonedas.euros_a_pesos(entrada);
                break;

            }
            case "Libras Esterlinas a Pesos Colombianos" -> {
                ConvertirMonedas.libras_a_pesos(entrada);
                break;

            }
            case "Yenes a Pesos Colombianos" -> {
                ConvertirMonedas.yen_a_pesos(entrada);
                break;

            }
            case "Wons a Pesos Colombianos" -> {
                ConvertirMonedas.won_a_pesos(entrada);
                break;
            }
        }

    }

}
