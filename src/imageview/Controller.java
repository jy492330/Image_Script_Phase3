package imageview;

import images.ImageModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * Implementation of the controller for the model image.
 */
public class Controller implements ActionListener {
  private ImageModel model;
  private View view;

  /**
   * Constructor.
   *
   * @param m the model to use
   * @param v the view to use
   */
  public Controller(ImageModel m, View v) {
    model = m;
    view = v;
    view.setListener((ActionListener) this);
    view.displayWindow();
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    String path = "";
    switch (e.getActionCommand()) {

      case "Load Image File":
        path = view.getFile();
        if (path != null) {
          System.out.println("File: " + path);
          model.loadImage(path);
          view.displayImage("res/" + path);
        }
        break;

      case "Save Image File":
        path = view.getFile();
        if (path != null) {
          model.saveImage(path);
        }
        break;

      case "Create Script":
        view.createScript();
        break;

      case "Run Script":
        // attach the listModel in the FrameView to the ConcreteTextController  ?
        break;

      case "Blur Effect":
        view.addEffect("blur");
        model.applyBlur();
        view.displayImage(model.getImage());
        break;

      case "Sharpen Effect": //
        view.addEffect("sharpen");
        model.applySharpen();
        view.displayImage(model.getImage());
        break;

      case "Grayscale Effect": //
        view.addEffect("grayscale");
        model.applyGrayscale();
        view.displayImage(model.getImage());
        break;

      case "Sepia Effect": //
        view.addEffect("sepia");
        model.applySepia();
        view.displayImage(model.getImage());
        break;

      case "Dither Effect": //
        view.addEffect("dither");
        model.applyDither();
        view.displayImage(model.getImage());
        break;

      case "Seeds: 1000": //
        view.addEffect("mosaic 1000");
        model.applyMosaic(1000);
        view.displayImage(model.getImage());
        break;

      case "Seeds: 4000": //
        view.addEffect("mosaic 4000");
        model.applyMosaic(4000);
        view.displayImage(model.getImage());
        break;

      case "Seeds: 8000": //
        view.addEffect("mosaic 8000");
        model.applyMosaic(8000);
        view.displayImage(model.getImage());
        break;

      case "Seeds: 15000": //
        view.addEffect("mosaic 15000");
        model.applyMosaic(15000);
        view.displayImage(model.getImage());
        break;

      case "Exit":
        System.exit(0);
        break;

      default:
        throw new IllegalStateException("Error: unknown input");
    }
  }

}
