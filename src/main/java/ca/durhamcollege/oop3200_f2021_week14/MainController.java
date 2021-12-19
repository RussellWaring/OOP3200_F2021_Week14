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
    private Label titleLabel;

    @FXML
    private Label firstNumberLabel;

    @FXML
    private Label secondNumberLabel;

    @FXML
    private Label resultLabel;

    @FXML
    private Button computeButton;

    @FXML
    private TextField firstNumberTextField;

    @FXML
    private TextField secondNumberTextField;

    @FXML
    private TextField resultTextField;

    @FXML
    protected void OnComputeButton_Clicked()
    {
        // When the compute button is clicked it will read the values from the first and second textFields
        // Passes into the String, get the result
        var firstString = firstNumberTextField.getText();
        var secondString = secondNumberTextField.getText();
        var result = AddString(firstString, secondString);

        firstNumberTextField.clear();
        secondNumberTextField.clear();

        resultTextField.setText("" + result);
    }

    @FXML
    protected void OnClearButton_Clicked()
    {
        firstNumberTextField.clear();
        secondNumberTextField.clear();
        resultTextField.clear();

        firstNumberTextField.requestFocus(); // sets focus back to first input textfield
    }

    // Utility functions
    private int AddString(String lhs, String rhs)
    {
        return Integer.parseInt(lhs) + Integer.parseInt(rhs);
    }
}