package zimmerman_3_javafxintro;
 
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
 
public class Zimmerman_3_Methodmadness extends Application {
 
    public static void main(String[] args) {
        launch(args);
    }
 
   // @Override
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Drawing Operations Test");       
        Group root = new Group();
        Canvas canvas = new Canvas(1680,1050 );
        GraphicsContext gc = canvas.getGraphicsContext2D();
        drawSomeBackgrounds(gc, 0, 0, 1680, 1680);
        for (int i= 5; i <1000; i++) {
        drawSomeCircle(gc, (int) (Math.random() * i),(int) (Math.random() * i) , 100); 
        drawSomeRectangles(gc, (int) (Math.random() * i)+2,(int) (Math.random() * i) +2,(int) (Math.random() * i)+2,(int) (Math.random() * i)+2); 
       drawSomeTriangles(gc, (int) (Math.random() * i)+2,(int) (Math.random() * i) +2,(int) (Math.random() * i)+2); 
        drawSomeTriangles(gc, (int) (Math.random() * (1680- i))+2,(int) (Math.random() * i) +2,(int) (Math.random() * i)+2); 
       drawMoreTriangles(gc, (int) (Math.random() * i)+2,(int) (Math.random() * i) +2,(int) (Math.random() * i)+2); 
       drawEvenMoreTriangles(gc, (int) (Math.random() * i)+2,(int) (Math.random() * i) +2,(int) (Math.random() * i)+2);
       drawEvenMoreTriangles(gc,800,850,900); 
       drawMoreTriangles(gc, 1200,800,1000); 
        drawSomeRectangles(gc, 50, 50, 50, 50);
        drawSomeTriangles(gc, 800, 850, 900);
        }
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        
    }
    private void drawSomeBackgrounds(GraphicsContext gc, double x, double y, double w, double h){
    gc.setFill(Color.BLACK);
    gc.fillRect(x, y, w, h);
   
    }
    private void drawSomeTriangles(GraphicsContext gc, int x, int y, int z){
        gc.setFill(Color.MAGENTA);
        gc.fillPolygon(new double[]{x, y, z},
                         new double[]{x+50, y+100, z-50}, 3);
        //gc.fillPolyline(new double[]{110, 140, 110, },
          //                new double[]{210, 210, 240, }, 3);
    } 
    
    private void drawEvenMoreTriangles(GraphicsContext gc, int x, int y, int z){
        gc.setFill(Color.BLUE);
        gc.fillPolygon(new double[]{x, y, z},
                         new double[]{x+50, y+100, z-50}, 3);
    
    }
      private void drawMoreTriangles(GraphicsContext gc, int x, int y, int z){
        gc.setFill(Color.STEELBLUE);
       // for (int down = 1600; down > 1600; down -=100 ){
        for (x = 1680; x >0; x -= 100){      
      
                
                for ( y=0; y<1680; y += 100){
                           
                         gc.fillPolygon(new double[]{x - 20 , x , x + 20},new double[]{y, y - 20, y}, 3); 
                }
        }
      
      }
    
    private void drawSomeCircle(GraphicsContext gc, int x, int y, int d) {
   // gc.setStroke(Color.web("BLUE",.02));
    gc.setFill(Color.web("BLACK",.55));
    gc.fillOval(x, y, d, d);
    
    //gc.strokeOval(x, y, d, d);
    }

    private void drawSomeRectangles(GraphicsContext gc, double x , double y, double w, double h){
        //gc.setFill(Color.PURPLE);    
        //gc.fillRect( x, y, w, h );
        gc.setStroke(Color.GREEN);
        gc.strokeRect( x, y, w, h); 
    }
    /*private void drawShapes(GraphicsContext gc) {
        gc.setFill(Color.CORAL);
        gc.setStroke(Color.TURQUOISE);
        gc.setLineWidth(5);
        gc.strokeLine(40, 10, 10, 40);
        gc.fillOval(50, 50, 50, 50);
        gc.strokeOval(100, 100, 30, 30);
        gc.fillRoundRect(110, 60, 30, 30, 10, 10);
        gc.strokeRoundRect(160, 60, 30, 30, 10, 10);
        gc.fillArc(10, 110, 30, 30, 45, 240, ArcType.OPEN);
        gc.fillArc(60, 110, 30, 30, 45, 240, ArcType.CHORD);
        gc.fillArc(110, 110, 30, 30, 45, 240, ArcType.ROUND);
        gc.strokeArc(10, 160, 30, 30, 45, 240, ArcType.OPEN);
        gc.strokeArc(60, 160, 30, 30, 45, 240, ArcType.CHORD);
        gc.strokeArc(110, 160, 30, 30, 45, 240, ArcType.ROUND);
        gc.fillPolygon(new double[]{10, 40, 10, 40},
                       new double[]{210, 210, 240, 240}, 4);
        gc.strokePolygon(new double[]{60, 90, 60, 90},
                         new double[]{210, 210, 240, 240}, 4);
        gc.strokePolyline(new double[]{110, 140, 110, 140},
                          new double[]{210, 210, 240, 240}, 4);
    }*/

//    @Override
//    public void start(Stage primaryStage) throws Exception {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    
}