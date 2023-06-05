package com.example.user01;





import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class OrganizatorController {


    public Button Aaa;

    public OrganizatorController() throws IOException {

    }

    public void onClick(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("a-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("А");
        stage.setScene(scene);
        stage.show();
        Stage thisStage = (Stage) Aaa.getScene().getWindow();
        thisStage.close();
    }

}
