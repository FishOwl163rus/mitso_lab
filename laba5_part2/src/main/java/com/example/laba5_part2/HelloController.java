package com.example.laba5_part2;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

public class HelloController implements Initializable {

    @FXML
    TextField Name;

    @FXML
    TextField Date;

    @FXML
    TextField Amount;

    @FXML
    ListView<String> List;

    public void Add(ActionEvent actionEvent) throws IOException {
        if(Name.getText().equals("") || Date.getText().equals("") || Amount.getText().equals("")){
            Alert alert = new Alert(Alert.AlertType.WARNING,  "Нeверно введены данные!",
                    ButtonType.CLOSE, ButtonType.OK);
            alert.show();
            return;
        }

        File f1 = new File("abc.txt");
        if(!f1.exists()) {
            f1.createNewFile();
        }

        FileWriter fileWritter = new FileWriter(f1.getName(),true);
        BufferedWriter bw = new BufferedWriter(fileWritter);
        bw.write(Name.getText() + ";" + Date.getText() + ";" + Amount.getText() + "\n");
        List.getItems().add(Name.getText() + " " + Date.getText() + " " + Amount.getText());
        bw.close();
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        File f1 = new File("abc.txt");
        if(!f1.exists()) {
            try {
                f1.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        FileInputStream fis= null;
        try {
            fis = new FileInputStream("abc.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Scanner sc=new Scanner(fis);

        while(sc.hasNextLine())
        {
            var spl = sc.nextLine().split(";");
            List.getItems().add(String.join(" ", spl));
        }

        sc.close();     //closes the scanner
    }
}

class Item {

    public Item(String name, String date, String amount){
        Name = name;
        Date = date;
        Amount = amount;
    }

    public String Name;
    public String Date;
    public String Amount;
}