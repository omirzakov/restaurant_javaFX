package controllers.adminControllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import mainClasses.Requests.RequestAndReply;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.URL;
import java.util.ResourceBundle;

public class EditStaffController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField id_field;

    @FXML
    private TextField newSalary_field;

    @FXML
    private TextField newPosition_field;

    @FXML
    private Button enter_button;

    @FXML
    void enter_btn(ActionEvent event) {
        try {
            Socket socket = new Socket("localhost", 12345);
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            Long id = Long.parseLong(id_field.getText());
            oos.writeObject(new RequestAndReply("EDIT_STAFF_REQUEST", id, newSalary_field.getText(),newPosition_field.getText()));
            RequestAndReply requestAndReply2 = (RequestAndReply) ois.readObject();
            System.out.println(requestAndReply2.getCode());
            oos.close();
            ois.close();
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void initialize() {


    }
}
