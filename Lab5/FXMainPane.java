import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 * This panel is the basic panel, inside which other panels are placed.  
 * Before beginning to implement, design the structure of your GUI in order to 
 * understand what panels go inside which ones, and what buttons or other components
 * go in which panels.  
 * @author ralexander
 *
 */
//make the main panel's layout be a VBox
public class AbarcaOmar_FXMainPane extends VBox {

	//student Task #2:
	//  declare five buttons, a label, and a textfield
	TextField txt;
	Button button1;
	Button button2;
	Button button3;
	Button button4;
	Button button5;
	Label label;
	//  declare two HBoxes
	HBox hbox1;
	HBox hbox2;
	
	AbarcaOmar_FXMainPane() {
		//student Task #2:
		//  instantiate the buttons, label, and textfield
		button1 = new Button("Hello");
		button2 = new Button("Howdy");
		button3 = new Button("Chinese");
		button4 = new Button("Clear");
		button5 = new Button("Exit");
		label = new Label("Feedback");
		txt = new TextField();
		//  instantiate the HBoxes
		hbox1 = new HBox();
		hbox2 = new HBox();
		
		//student Task #4:
		//  instantiate the DataManager instance
		AbarcaOmar_DataManager = new AbarcaOmar_DataManager();
		//  set margins and set alignment of the components
		
		//student Task #3:
		//  add the label and textfield to one of the HBoxes
		hbox1.getChildren().addAll(label, txt);
		//  add the buttons to the other HBox
		hbox2.getChildren().addAll(button1, button2, button3, button4, button5);
		//  add the HBoxes to this FXMainPanel (a VBox)
		getChildren().addAll(hbox1, hbox2);	
	}
	
	//Task #4:
	//  create a private inner class to handle the button clicks
}
	
