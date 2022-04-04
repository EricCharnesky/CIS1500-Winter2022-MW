
package helloworldjavafx.netbeans;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


public class HelloController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private Button button;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void buttonClicked(ActionEvent event) {
        label.setText("Hello World!");
    }
    
}
