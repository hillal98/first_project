public static WritableImage grayscale(Image image){

         int width = (int)image.getWidth(); 
         int height = (int)image.getHeight(); 

         WritableImage wImage = new WritableImage(width, height); 
         
         //Reading color from the loaded image 
         PixelReader pixelReader = image.getPixelReader(); 
      
         //getting the pixel writer 
         PixelWriter writer = wImage.getPixelWriter();  

         for(int y = 0; y < height; y++) { 
             for(int x = 0; x < width; x++) { 
                //Retrieving the color of the pixel of the loaded image   
                Color color = pixelReader.getColor(x, y); 
                int r = (int) (color.getRed() * 255);
                int g = (int) (color.getGreen() * 255);
                int b = (int) (color.getBlue() * 255);
                int gray = (int)(0.212671 * r + 0.715160*g + 0.072169*b);
                Color color2 = color.rgb(gray,gray,gray);
                writer.setColor(x, y, color2);            
              }
         }

         return wImage; 
   }
public static WritableImage negatif(Image image){

         int width = (int)image.getWidth(); 
         int height = (int)image.getHeight(); 

         WritableImage wImage = new WritableImage(width, height); 
         
         //Reading color from the loaded image 
         PixelReader pixelReader = image.getPixelReader(); 
      
         //getting the pixel writer 
         PixelWriter writer = wImage.getPixelWriter();  

         for(int y = 0; y < height; y++) { 
             for(int x = 0; x < width; x++) { 
                //Retrieving the color of the pixel of the loaded image   
                Color color = pixelReader.getColor(x, y); 
                int r = (int) (color.getRed() * 255);
                int g = (int) (color.getGreen() * 255);
                int b = (int) (color.getBlue() * 255);
                Color color2 = color.rgb(255-r,255-g,255-b);
                writer.setColor(x, y, color2);            
              }
         }
         @Override 
   public void start(Stage stage) {


      Label contrastLabel = new Label("Contrast:");
      Label hueLabel = new Label("Hue:");
      Label saturationLabel = new Label("Saturation:");
      Label brightnessLabel = new Label("luminosite:");
      Label wi = new Label("redimenssionner avec ratio:");
      Label rd = new Label("redimenssionner sans ratio:");
      Label svlabel = new Label("nom image a sauvegarder: " );
      Label flabel = new Label("intensite du flou: ");
 
      Slider contrastSlider = this.createSlider(ADJUST_TYPE_CONTRAST);
      Slider hueSlider = this.createSlider(ADJUST_TYPE_HUE);
      Slider saturationSlider = this.createSlider(ADJUST_TYPE_SATURATION);
      Slider brightnessSlider = this.createSlider(ADJUST_TYPE_BRIGHTNESS);


      contrastSlider.setStyle("-fx-background-color:  CHOCOLATE;"+"-fx-background-radius: 30;"+"-fx-background-insets: 0;"+"-fx-text-fill:WHITE;");
      hueSlider.setStyle("-fx-background-color:CYAN;"+"-fx-background-radius: 30;"+"-fx-background-insets: 0;"+"-fx-text-fill:WHITE;");
      saturationSlider.setStyle("-fx-background-color:CORAL;"+"-fx-background-radius: 30;"+"-fx-background-insets: 0;"+"-fx-text-fill:WHITE;");
      brightnessSlider.setStyle("-fx-background-color:   CORNFLOWERBLUE;"+"-fx-background-radius: 30;"+"-fx-background-insets: 0;"+"-fx-text-fill:WHITE;");

      sv.setStyle("-fx-background-color:LIMEGREEN;"+"-fx-background-radius: 30;"+"-fx-background-insets: 0;"+"-fx-text-fill:BLACK;");
      fl.setStyle("-fx-background-color:OLIVEDRAB;"+"-fx-background-radius: 30;"+"-fx-background-insets: 0;"+"-fx-text-fill:BLACK;");

      wd.setStyle("-fx-background-color:  PALETURQUOISE;"+"-fx-background-radius: 30;"+"-fx-background-insets: 0;"+"-fx-text-fill:BLACK;");
      wd2.setStyle("-fx-background-color: PALETURQUOISE;"+"-fx-background-radius: 30;"+"-fx-background-insets: 0;"+"-fx-text-fill:BLACK;");
      hei.setStyle("-fx-background-color: PALETURQUOISE;"+"-fx-background-radius: 30;"+"-fx-background-insets: 0;"+"-fx-text-fill:BLACK;");

GridPane gw = new GridPane () ;
       gw.setVgap (5) ;
       gw.setHgap (5) ;
       gw.setPadding (new Insets (1,1,1,1)) ;


       gw.add(wi, 0 , 0 ) ;
       gw.add(wd,0,1 ) ;
       gw.add(wid,1,1 ) ;
       gw.add(car,2,1 ) ;


       gw.setStyle("-fx-background-color:DARKGREY ;"+"-fx-padding: 10;" + "-fx-border-style: solid inside;"
        + "-fx-border-width: 2;" + "-fx-border-insets: 5;"
        + "-fx-border-radius: 5;" + "-fx-border-color: KHAKI;");


      GridPane rdm = new GridPane () ;
       rdm.setVgap (0) ;
       rdm.setHgap (5) ;
       rdm.setPadding (new Insets (1,1,1,1)) ;


       rdm.add(rd, 0 , 0 ) ;
       rdm.add(wd2,0,1 ) ;
       rdm.add(hei,0,3 ) ;
       rdm.add(redim,1,2 );
       rdm.add(csr,2,2 );

       rdm.setStyle("-fx-background-color:DARKGREY ;"+"-fx-padding: 10;" + "-fx-border-style: solid inside;"
        + "-fx-border-width: 2;" + "-fx-border-insets: 5;"
        + "-fx-border-radius: 5;" + "-fx-border-color: KHAKI;");



      GridPane grid = new GridPane () ;
      grid.setVgap (5) ;
      grid.setHgap (5) ;
      grid.setPadding (new Insets (1,1,1,1)) ;


      grid.add(flabel, 0 , 0 ) ;
      grid.add(fl,0,1 ) ;
      grid.add(dark,1,1 ) ;
      grid.add(cf,2,1 ) ;


      grid.setStyle("-fx-background-color:DARKGREY ;"+"-fx-padding: 10;" + "-fx-border-style: solid inside;"
        + "-fx-border-width: 2;" + "-fx-border-insets: 5;"
        + "-fx-border-radius: 5;" + "-fx-border-color: KHAKI;");

      GridPane grid2 = new GridPane () ;
      grid2.setVgap (5) ;
      grid2.setHgap (5) ;
      grid2.setPadding (new Insets (1,1,1,1)) ;

      grid2.setStyle("-fx-background-color:DARKGREY ;"+"-fx-padding: 10;" + "-fx-border-style: solid inside;"
        + "-fx-border-width: 2;" + "-fx-border-insets: 5;"
        + "-fx-border-radius: 5;" + "-fx-border-color: KHAKI;");


      grid2.add(svlabel , 0 , 0 ) ;
      grid2.add(sv,0,1 ) ;
      grid2.add(saveButton,1,1 ) ;
      grid2.add(csave,2,1 ) ;

      GridPane grid3 = new GridPane () ;
      grid3.setVgap (5) ;
      grid3.setHgap (5) ;
      grid3.setPadding (new Insets (1,1,1,1)) ;

      grid3.setStyle("-fx-background-color:DARKGREY ;"+"-fx-padding: 10;" + "-fx-border-style: solid inside;"
        + "-fx-border-width: 2;" + "-fx-border-insets: 5;"
        + "-fx-border-radius: 5;" + "-fx-border-color: KHAKI;");
      grid3.add(crot,0,0 ) ;
      grid3.add(rot,1,0 ) ;

      GridPane grid4 = new GridPane () ;
      grid4.setVgap (5) ;
      grid4.setHgap (5) ;
      grid4.setPadding (new Insets (1,1,1,1)) ;

      grid4.setStyle("-fx-background-color:DARKGREY ;"+"-fx-padding: 10;" + "-fx-border-style: solid inside;"
        + "-fx-border-width: 2;" + "-fx-border-insets: 5;"
        + "-fx-border-radius: 5;" + "-fx-border-color: KHAKI;");

      grid4.add(contrastLabel,0,0 ) ;
      grid4.add(contrastSlider,0,1 ) ;
      grid4.add(hueLabel,0,2 ) ;
      grid4.add(hueSlider,0,3 ) ;
      grid4.add(saturationLabel,0,4 ) ;
      grid4.add(saturationSlider,0,5 ) ;
      grid4.add( brightnessLabel,0,6 ) ;
      grid4.add(brightnessSlider,0,7 ) ;
 
         close.setOnAction(event -> {
         Platform.exit();
         });
         car.setOnAction(event -> {
            wd.clear();
         });
         csr.setOnAction(event -> {
            wd2.clear();
            hei.clear();
         });
         cf.setOnAction(event -> {
            fl.clear();
         });
         csave.setOnAction(event -> {
            sv.clear();
         });
            Scanner clavier = new Scanner(System.in);
         System.out.print("entrez le nom de votre image qui se trouve dans le repertoire courant: "); 
         s=clavier.nextLine();
         

         Image image = new Image(s); 
         ImageView iv1 = new ImageView();
         
         iv1.setImage(image);
         
         colorAdjust = new ColorAdjust();
iv1.setEffect(colorAdjust);
        
         ori.setOnAction(event -> {
            contrastSlider.setValue(0);
            hueSlider.setValue(0);
            brightnessSlider.setValue(0);
            saturationSlider.setValue(0);
            BoxBlur boxBlur = new BoxBlur();
            boxBlur.setWidth(0);
            boxBlur.setHeight(0);
            boxBlur.setIterations(0);
            iv1.setEffect(boxBlur);
            iv1.setRotate(0);
            iv1.setFitWidth(image.getWidth());
            iv1.setFitHeight(image.getHeight());
            iv1.setPreserveRatio(false);
            iv1.setSmooth(true);
            iv1.setCache(true);
            iv1.setImage(image);
            iv1.setEffect(colorAdjust);
         });
         neg.setOnAction(event -> {
            iv1.setImage(negatif(image));
         });

         grr.setOnAction(event -> {
            iv1.setImage(grayscale(image));
         }); 

         wid.setOnAction(event -> {
              iv1.setFitWidth(Integer.valueOf(wd.getText()));
              iv1.setPreserveRatio(true);
              iv1.setSmooth(true);
              iv1.setCache(true);
         }); 

         redim.setOnAction(event -> {
              iv1.setFitWidth(Integer.valueOf(wd2.getText()));
              iv1.setFitHeight(Integer.valueOf(hei.getText()));
              iv1.setPreserveRatio(false);
              iv1.setSmooth(true);
              iv1.setCache(true);
         });
         dark.setOnAction(event -> {
            BoxBlur boxBlur = new BoxBlur();
 
             boxBlur.setWidth(Integer.valueOf(fl.getText()));
             boxBlur.setHeight(Integer.valueOf(fl.getText()));
             boxBlur.setIterations(3);
             iv1.setEffect(boxBlur);
         });
         crot.getItems().addAll( "0" , "90" , "180" , "270") ;
         rot.setOnAction(event -> {
            if (crot.getValue() == "0") 
                iv1.setRotate(0);
            else if (crot.getValue() == "90") 
                iv1.setRotate(90);
            else if (crot.getValue() == "180") 
                iv1.setRotate(180);
            else if (crot.getValue() == "270")
                iv1.setRotate(270);
         });


    
    saveButton.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent arg0) {
        try {
          
          File output = new File(String.valueOf(sv.getText()) + ".png");
          
          ImageIO.write(SwingFXUtils.fromFXImage(iv1.snapshot(null, null), null), "png", output);


        } catch (IOException ex) {
          System.out.println("save faileds " + ex);
        }
      }
    });



         Group root = new Group();
         Scene scene = new Scene(root);
         scene.setFill(Color.GRAY);
         HBox box = new HBox();
         VBox bo = new VBox();
         bo.setStyle("-fx-background-color:DARKGREY ;"+"-fx-padding: 10;" + "-fx-border-style: solid inside;"
        + "-fx-border-width: 2;" + "-fx-border-insets: 5;"
        + "-fx-border-radius: 5;" + "-fx-border-color: KHAKI;");
         bo.setSpacing(5);

         ori.setStyle("-fx-background-color:GOLDENROD;"+"-fx-background-radius: 30;"+"-fx-background-insets: 0;"+"-fx-text-fill:WHITE;");
         neg.setStyle("-fx-background-color: #000000, linear-gradient(#7ebcea, #2f4b8f),linear-gradient(#426ab7, #263e75),linear-gradient(#395cab, #223768);"+"-fx-background-radius: 30;"+"-fx-background-insets: 0;"+"-fx-text-fill: white;");
         grr.setStyle("-fx-background-color: #090a0c,linear-gradient(#38424b 0%, #1f2429 20%, #191d22 100%),linear-gradient(#20262b, #191d22),radial-gradient(center 50% 0%, radius 100%, rgba(114,131,148,0.9), rgba(255,255,255,0));"+"-fx-background-radius: 30;"+"-fx-background-insets: 0;"+"-fx-text-fill: white;");
         saveButton.setStyle("-fx-background-color:OLIVEDRAB;"+"-fx-background-radius: 30;"+"-fx-background-insets: 0;"+"-fx-text-fill:WHITE;");
         dark.setStyle("-fx-background-color:LIMEGREEN;"+"-fx-background-radius: 30;"+"-fx-background-insets: 0;"+"-fx-text-fill:WHITE;");
         rot.setStyle("-fx-background-color:LIMEGREEN;"+"-fx-background-radius: 30;"+"-fx-background-insets: 0;"+"-fx-text-fill:WHITE;");
         crot.setStyle("-fx-background-color:GREENYELLOW;"+"-fx-background-radius: 30;"+"-fx-background-insets: 0;"+"-fx-text-fill:WHITE;");
         redim.setStyle("-fx-background-color:NAVY;"+"-fx-background-radius: 30;"+"-fx-background-insets: 0;"+"-fx-text-fill:WHITE;");
         wid.setStyle("-fx-background-color:NAVY;"+"-fx-background-radius: 30;"+"-fx-background-insets: 0;"+"-fx-text-fill:WHITE;");
         cf.setStyle("-fx-background-color:LIMEGREEN;"+"-fx-background-radius: 30;"+"-fx-background-insets: 0;"+"-fx-text-fill:WHITE;");
         car.setStyle("-fx-background-color:NAVY;"+"-fx-background-radius: 30;"+"-fx-background-insets: 0;"+"-fx-text-fill:WHITE;");
         csr.setStyle("-fx-background-color:NAVY;"+"-fx-background-radius: 30;"+"-fx-background-insets: 0;"+"-fx-text-fill:WHITE;");
         csave.setStyle("-fx-background-color:OLIVEDRAB;"+"-fx-background-radius: 30;"+"-fx-background-insets: 0;"+"-fx-text-fill:WHITE;");
         close.setStyle("-fx-background-color: linear-gradient(#ff5400, #be1d00);"+"-fx-background-radius: 30;"+"-fx-background-insets: 0;"+"-fx-text-fill: white;");

         bo.getChildren().add(ori);
         bo.getChildren().add(grr);
         bo.getChildren().add(neg);
         bo.getChildren().add(gw);
         bo.getChildren().add(rdm);
         bo.getChildren().add(grid);
         
         bo.getChildren().add(grid3);
         bo.getChildren().add(grid4);

         bo.getChildren().addAll(contrastLabel, contrastSlider, //
            hueLabel, hueSlider, //
            saturationLabel, saturationSlider, //
            brightnessLabel, brightnessSlider);
            

         bo.getChildren().add(grid2);
         
         bo.getChildren().add(close);
         box.getChildren().add(bo);
         box.getChildren().add(iv1);


         root.getChildren().add(box);
 
         stage.setTitle("ImageView");
         stage.setWidth(600);
         stage.setHeight(500);
         stage.setScene(scene); 
         stage.sizeToScene(); 
         stage.show(); 
     }
   private Slider createSlider(final int adjustType) {
      Slider slider = new Slider();
      slider.setMin(-1);
      slider.setMax(1);
      slider.setBlockIncrement(0.1);
      slider.setValue(0);
            
      slider.valueProperty().addListener(new ChangeListener<Number>() {
 
         @Override
         public void changed(ObservableValue<? extends Number> observable, //
               Number oldValue, Number newValue) {
            switch (adjustType) {
            case ADJUST_TYPE_HUE:
               colorAdjust.setHue(newValue.doubleValue());
               break;
            case ADJUST_TYPE_CONTRAST:
               colorAdjust.setContrast(newValue.doubleValue());
               break;
            case ADJUST_TYPE_SATURATION:
               colorAdjust.setSaturation(newValue.doubleValue());
               break;
            case ADJUST_TYPE_BRIGHTNESS:
               colorAdjust.setBrightness(newValue.doubleValue());
               break;
            }
         }
      });
      return slider;
   }

     public static void main(String[] args) {
         Application.launch(args);
     }
 }
