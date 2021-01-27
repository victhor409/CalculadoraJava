package views;

import Model.ModelCalculadora;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class CalcController {

	@FXML
	private Text output;
	
	private String operador = "";
	private double numero = 0.0;
	private double resultado;
	private boolean start = true;
	private boolean numberValue = false;
	private ModelCalculadora modelCalculadora = new ModelCalculadora();
	
	@FXML
	private void processNumber(ActionEvent event) {
		
		if (start) {
			output.setText("");
			start = false;
			
		}
		String value = ((Button) event.getSource()).getText();
		output.setText(output.getText()+value);
		numberValue = true;
		
	}

    @FXML
    private void processOperator(ActionEvent event) {

        String value = ((Button) event.getSource()).getText();

       if (!"=".equals(value)) {
    	   if (!operador.isEmpty()) {
    		   if (operador.equals("-") && numberValue == true) {
    			   operador = value;
    			   numero = Double.parseDouble(output.getText());
    			   output.setText("");
    		   }
    		   
    		   return;
    	   }
    	   
    	   if (value.equals("-")) {
    		   if (numberValue == true) {
    			   operador = value;
    			   numero = Double.parseDouble(output.getText());
    			   output.setText("");
    			   return;
    		   }
    		   else {
    			   output.setText(output.getText()+value);
    			   start = false;
    			   operador = value;
    		   }
    		   return;
    	   }
    	   
    	   if(!numberValue) {
    		   return;
    	   }
    	   
    	   operador = value;
    	   numero = Double.parseDouble(output.getText());
    	   output.setText("");
    	   
       }
       else {
    	   if (operador.isEmpty() || numberValue == false) {
    		   return;
    	   }
    	   
    	   if(operador.equals("/")) {
    		   resultado = modelCalculadora.calculate(numero, 0, operador);
    	   }
    	   
          else {
    		   resultado=modelCalculadora.calculate(numero, Double.parseDouble(output.getText()), operador);
    	   }
    	   
    	   
    	   output.setText(String.valueOf(resultado));
   		start = true ;
   		operador = "";
   		numberValue = false;
       }
        
    }	
		
        

	
	@FXML
	private void porcessClean(ActionEvent event) {
		
		numero = 0.0;
		operador = "";
		output.setText("");
		numberValue = false;
		
		
	}
	
}
