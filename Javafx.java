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

         HBox hBox1=new HBox();
         hBox1.setPandding(new Insets(10));
         hBox1.setSpacing(10);
         Label labelNom=new Label("editeur d'image:");
         labelNom.setPandding(new Insets(5));
         TextField textFieldNom=new TextField();
         Button buttonAdd=new Button ("ajouter");
         hBox1.getChildren().addAll(labelNom,textFieldNom,buttonAdd);

         VBox vBox1=new VBox();
         ListView<String>listView1=new ListView<>();
         listView1.getItems().addALL("effet","flou");
         vBox1.getChildren().add(listView1);
         borderPaneRoot.setCenter(vBox1);


         borderPaneRoot.setTop(hBox1);
         primaryStage.show();
     }
 }        