import javafx.application.Application;
import javafx.stage.Stage;

public class Javafxapp extends Application {
    public static void main(String []args){
    launch(args);
    }

 
    @Override 
    public void start(Stage primaryStage) throws Exception {
         primaryStage.setTitle("editeur d'image");
         BorderPane borderPaneRoot =new BorderPane();
         Scene scene=new scene (borderPaneRopt,800,600);
         primaryStage.setScene(scene);
         primaryStage.show();
     }
 }        