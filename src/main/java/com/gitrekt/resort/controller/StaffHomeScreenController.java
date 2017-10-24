package com.gitrekt.resort.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class for the staff home screen.
 */
public class StaffHomeScreenController implements Initializable {

    @FXML
    private Button registryButton;
    
    @FXML
    private Button viewReportsButton;
    
    @FXML
    private Button editPricesButton;
    
    @FXML
    private Button manageStaffAccountsButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    public void onRegistryButtonClicked() {
        // TODO
    }
    
    public void onViewReportsButtonClicked() throws IOException {
        Stage mainStage = (Stage) viewReportsButton.getScene().getWindow();
        Parent viewReportsScreenRoot = FXMLLoader.load(
            getClass().getResource("/fxml/ReportsHomeScreen.fxml")
        );
        Scene viewReportsScreen = new Scene(viewReportsScreenRoot);
        mainStage.setScene(viewReportsScreen);
    }
    
    public void onEditPricesButtonClicked() {
        // TODO
    }
    
    public void onManageStaffAccountsButtonClicked() {
        // TODO
    }
}
