import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MainController {
    @FXML
    private Label result;
    @FXML
    private Label out;
    private long number1=0;
    private String operator="";
    private boolean start=true;
    calculate calc=new calculate();
    @FXML
    public void processNumbers(ActionEvent event){
        if(start){
            result.setText("");
            out.setText("");
            start=false;
        }
        String value=((Button)event.getSource()).getText();
        out.setText(out.getText()+value);
        result.setText(result.getText()+value);
    }
    @FXML
    public void processOperators(ActionEvent event){
        String value=((Button)event.getSource()).getText();
        if(!value.equals("=")){
            if(!operator.isEmpty()){
                return;
            }
            operator=value;
            number1=Long.parseLong(out.getText());
            out.setText("");
            result.setText(result.getText()+value);
        }
        else{
            if(operator.isEmpty()){
                return;
            }
            long number2=Long.parseLong(out.getText());
            float res=calc.calculator(number1, number2, operator);
            result.setText("");
            result.setText(String.valueOf(res));
            operator="";
            start=true;
        }
    }
}
