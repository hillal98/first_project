import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
 
public class ColorAdjustEffectExample extends Application {
 
   private static final int ADJUST_TYPE_HUE = 1;
   private static final int ADJUST_TYPE_CONTRAST = 2;
   private static final int ADJUST_TYPE_SATURATION = 3;
   private static final int ADJUST_TYPE_BRIGHTNESS = 4;
 
   private ColorAdjust colorAdjust;
 
   @Override
   public void start(Stage stage) {
 
      Label contrastLabel = new Label("Contrast:");
      Label hueLabel = new Label("Hue:");
      Label saturationLabel = new Label("Saturation:");
      Label brightnessLabel = new Label("Brightness:");
 
      Slider contrastSlider = this.createSlider(ADJUST_TYPE_CONTRAST);
      Slider hueSlider = this.createSlider(ADJUST_TYPE_HUE);
      Slider saturationSlider = this.createSlider(ADJUST_TYPE_SATURATION);
      Slider brightnessSlider = this.createSlider(ADJUST_TYPE_BRIGHTNESS);
 
      String imageUrl = "//o7planning.org/templates/o7planning/resources/images/favi.png";
      Image image = new Image(imageUrl);
 
      ImageView imageView = new ImageView(image);
 
      // Create the ColorAdjust
      colorAdjust = new ColorAdjust();
 
      // Applying ColorAdjust effect to the ImageView node
      imageView.setEffect(colorAdjust);
 
      VBox root = new VBox();
      root.setPadding(new Insets(10));
 
      root.getChildren().addAll(contrastLabel, contrastSlider, //
            hueLabel, hueSlider, //
            saturationLabel, saturationSlider, //
            brightnessLabel, brightnessSlider, imageView);
 
      Scene scene = new Scene(root, 450, 320);
      stage.setTitle("JavaFX ColorAdjust Effect (o7planning.org)");
      stage.setScene(scene);
      stage.show();
   }
 
   // Create Slider to Adjust Color

 
   public static void main(String args[]) {
      launch(args);
   }
 
}   
