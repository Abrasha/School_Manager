/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school_manager.view;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;
import school_manager.MainApp;
import school_manager.helpers.MainReferenced;

/**
 * FXML Controller class
 *
 * @author bepa
 */
public class AdminMenuFragmentController implements Initializable, MainReferenced {

    MainApp mainApp;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   
    
    @Override
    public void setMainApp(MainApp mainApp){
        this.mainApp = mainApp;
    }
    
    
    @FXML
    public void buttonAddStudentClicked(){
        
        FXMLLoader loader = new FXMLLoader();
        
        try{
            
            loader.setLocation(getClass().getResource("AdminStudentInsertionFragment.fxml"));
            BorderPane pane = (BorderPane) loader.load();
            
            AdminStudentInsertionFragmentController studentInsertionController = loader.getController();
            studentInsertionController.setMainApp(mainApp);
            
            mainApp.setContent(pane);
            mainApp.setStatus("Setting student insertion form is set");
            
        }catch(IOException e){
            System.out.println(e.getMessage());
            mainApp.setStatus("Error setting student insertion form.");
        }
    }
    
    @FXML
    public void buttonAddTeacherClicked(){
        
        FXMLLoader loader = new FXMLLoader();
        
        try{
            
            loader.setLocation(getClass().getResource("AdminTeacherInsertionFragment.fxml"));
            BorderPane pane = (BorderPane) loader.load();
            
            AdminTeacherInsertionFragmentController teacherInsertionController = loader.getController();
            teacherInsertionController.setMainApp(mainApp);
            
            mainApp.setContent(pane);
            mainApp.setStatus("Setting teacher insertion form is set");
            
        }catch(IOException e){
            System.out.println(e.getMessage());
            mainApp.setStatus("Error setting teacher insertion form.");
        }
    }
}