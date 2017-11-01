package sample;

import javafx.beans.Observable;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyEvent;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class Controller implements Initializable {
    public TableView tbl;
    private ObservableList<Persona> listapersonas;
    public TextField buscarbtn;
    public TableColumn clNombre;
    public TableColumn clApellido;
    public TableColumn clEdad;

    public void buscar(KeyEvent keyEvent) {
        try {
            System.out.println(Persona.buscarNombre(buscarbtn.getText()));
            borrarConsola();
        } catch (NullPointerException e) {
            System.out.println(".....");
        }

    }


    public static void mostrar() {

    }

    private void borrarConsola() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {



        Persona.getLista();

    }
}
