package com.example.os_monitor;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    ImageView marx = new ImageView();
    @FXML
    ImageView socrate = new ImageView();
    @FXML
     ImageView qiu = new ImageView();
    @FXML
     ImageView plato = new ImageView();
    @FXML
     ImageView aristo = new ImageView();

    @FXML
     ImageView f1;
    @FXML
     ImageView f2;
    @FXML
     ImageView f3;
    @FXML
     ImageView f4;
    @FXML
     ImageView f5;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
//        String filePath = "D:\\Dowloads_D\\OS_monitor\\src\\main\\java\\com\\example\\os_monitor\\plato.jpg";
//        Path path = FileSystems.getDefault().getPath(filePath);
//        String currentWorkingDir = System.getProperty("user.dir");
//        System.out.println("Current Working Directory: " + currentWorkingDir);
//        if (Files.exists(path)) {
//            System.out.println("File path exists: " + filePath);
//        } else {
//            System.out.println("File path does not exist: " + filePath);
//        }
//        System.out.println("Resolved Path: " + path.toAbsolutePath());
//        System.out.println("Exists: " + Files.exists(path));
        File file = new File("D:/Downloads_D/OS_monitor/src/main/java/com/example/os_monitor/plato.jpg");
//       D:\Dowloads_D\OS_monitor\src\main\java\com\example\os_monitor\plato.jp

        // Convert the file to a URL and create an Image
        Image image;
        try {
            image = new Image(file.toURI().toURL().toString());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
//        System.out.println();
//        aristo.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("aristotle.jpg"))));
//        marx.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("mar.png"))));
//        socrate.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("Socrate_du_Louvre.jpg"))));
//        qiu.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("qiu.png"))));
    }
}