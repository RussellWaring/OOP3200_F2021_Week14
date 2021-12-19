package ca.durhamcollege.oop3200_f2021_week14;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.kordamp.bootstrapfx.BootstrapFX;
import org.kordamp.bootstrapfx.scene.layout.Panel;

public class MainController
{
    private Integer one;
    private Integer two;

    @FXML
    private Label welcomeLabel;

    @FXML
    private Button clickMeButton;

    @FXML
    private TextField nameTextField;

    @FXML
    private Label nameLabel;

    @FXML
    protected void OnClickMeButton_Clicked() {
        welcomeLabel.setText("Welcome to Week 14!");
    }

    @FXML
    protected void OnNameTextField_Submitted()
    {
        // 2 things - text field to clear,
        //nameTextField.setText("");
        var text = nameTextField.getText();
        //welcomeLabel.setText(nameTextField.getText());
        welcomeLabel.setText(text);
        nameTextField.clear();

        String oneString = "1";
        String twoString ="2";
        var result = AddString(oneString, twoString);
        System.out.println("Result: " + result);

    }

    // Utility functions
    private int AddString(String lhs, String rhs)
    {
        return Integer.parseInt(lhs) + Integer.parseInt(rhs);
    }
}