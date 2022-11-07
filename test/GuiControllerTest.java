import static org.junit.Assert.assertEquals;

import images.ImageModel;
import imageview.Controller;
import imageview.View;
import java.awt.event.ActionEvent;
import org.junit.Test;

/**
 * Test cases for the GUI controller, using model and view mocks to independently test
 * the controller.
 */
public class GuiControllerTest {

  @Test
  public void testLoadImage() {
    StringBuilder modelLog = new StringBuilder();
    ImageModel model = new MockGuiModel(modelLog);
    StringBuilder viewLog = new StringBuilder();
    View view = new MockGuiView(viewLog);
    Controller guiController = new Controller(model, view);
    guiController.actionPerformed(new ActionEvent(new Object(), 12345, "Load Image File"));

    String expectedModel = "Model: load an image acbdeXYZ file name" + System.lineSeparator();
    assertEquals(expectedModel, modelLog.toString());

    String expectedView = "View: set action listener" + System.lineSeparator()
        + "View: display window" + System.lineSeparator()
        + "View: display image res/acbdeXYZ file name" + System.lineSeparator();
    assertEquals(expectedView, viewLog.toString());
  }

  @Test
  public void testSaveImage() {
    StringBuilder modelLog = new StringBuilder();
    ImageModel model = new MockGuiModel(modelLog);
    StringBuilder viewLog = new StringBuilder();
    View view = new MockGuiView(viewLog);
    Controller guiController = new Controller(model, view);
    guiController.actionPerformed(new ActionEvent(new Object(), 12345, "Save Image File"));

    String expectedModel = "Model: save an image acbdeXYZ file name" + System.lineSeparator();
    assertEquals(expectedModel, modelLog.toString());
  }

  @Test
  public void testCreateScript() {
    StringBuilder modelLog = new StringBuilder();
    ImageModel model = new MockGuiModel(modelLog);
    StringBuilder viewLog = new StringBuilder();
    View view = new MockGuiView(viewLog);
    Controller guiController = new Controller(model, view);
    guiController.actionPerformed(new ActionEvent(new Object(), 12345, "Create Script"));

    String expectedView = "View: set action listener" + System.lineSeparator()
        + "View: display window" + System.lineSeparator()
        + "View: create the batch-script" + System.lineSeparator();
    assertEquals(expectedView, viewLog.toString());
  }

  @Test
  public void testBlur() {
    StringBuilder modelLog = new StringBuilder();
    ImageModel model = new MockGuiModel(modelLog);
    StringBuilder viewLog = new StringBuilder();
    View view = new MockGuiView(viewLog);
    Controller guiController = new Controller(model, view);
    guiController.actionPerformed(new ActionEvent(new Object(), 12345, "Blur Effect"));

    String expectedModel = "Model: apply blur effect" + System.lineSeparator();
    assertEquals(expectedModel, modelLog.toString());

    String expectedView = "View: set action listener" + System.lineSeparator()
        + "View: display window" + System.lineSeparator()
        + "View: applying blur" + System.lineSeparator()
        + "View: display image dummy image path" + System.lineSeparator();
    assertEquals(expectedView, viewLog.toString());
  }

  @Test
  public void testSharpen() {
    StringBuilder modelLog = new StringBuilder();
    ImageModel model = new MockGuiModel(modelLog);
    StringBuilder viewLog = new StringBuilder();
    View view = new MockGuiView(viewLog);
    Controller guiController = new Controller(model, view);
    guiController.actionPerformed(new ActionEvent(new Object(), 12345, "Sharpen Effect"));

    String expectedModel = "Model: apply sharpen effect" + System.lineSeparator();
    assertEquals(expectedModel, modelLog.toString());

    String expectedView = "View: set action listener" + System.lineSeparator()
        + "View: display window" + System.lineSeparator()
        + "View: applying sharpen" + System.lineSeparator()
        + "View: display image dummy image path" + System.lineSeparator();
    assertEquals(expectedView, viewLog.toString());
  }

  @Test
  public void testGrayscale() {
    StringBuilder modelLog = new StringBuilder();
    ImageModel model = new MockGuiModel(modelLog);
    StringBuilder viewLog = new StringBuilder();
    View view = new MockGuiView(viewLog);
    Controller guiController = new Controller(model, view);
    guiController.actionPerformed(new ActionEvent(new Object(), 12345, "Grayscale Effect"));

    String expectedModel = "Model: apply grayscale effect" + System.lineSeparator();
    assertEquals(expectedModel, modelLog.toString());

    String expectedView = "View: set action listener" + System.lineSeparator()
        + "View: display window" + System.lineSeparator()
        + "View: applying grayscale" + System.lineSeparator()
        + "View: display image dummy image path" + System.lineSeparator();
    assertEquals(expectedView, viewLog.toString());
  }

  @Test
  public void testSepia() {
    StringBuilder modelLog = new StringBuilder();
    ImageModel model = new MockGuiModel(modelLog);
    StringBuilder viewLog = new StringBuilder();
    View view = new MockGuiView(viewLog);
    Controller guiController = new Controller(model, view);
    guiController.actionPerformed(new ActionEvent(new Object(), 12345, "Sepia Effect"));

    String expectedModel = "Model: apply sepia effect" + System.lineSeparator();
    assertEquals(expectedModel, modelLog.toString());

    String expectedView = "View: set action listener" + System.lineSeparator()
        + "View: display window" + System.lineSeparator()
        + "View: applying sepia" + System.lineSeparator()
        + "View: display image dummy image path" + System.lineSeparator();
    assertEquals(expectedView, viewLog.toString());
  }

  @Test
  public void testDither() {
    StringBuilder modelLog = new StringBuilder();
    ImageModel model = new MockGuiModel(modelLog);
    StringBuilder viewLog = new StringBuilder();
    View view = new MockGuiView(viewLog);
    Controller guiController = new Controller(model, view);
    guiController.actionPerformed(new ActionEvent(new Object(), 12345, "Dither Effect"));

    String expectedModel = "Model: apply dither effect" + System.lineSeparator();
    assertEquals(expectedModel, modelLog.toString());

    String expectedView = "View: set action listener" + System.lineSeparator()
        + "View: display window" + System.lineSeparator()
        + "View: applying dither" + System.lineSeparator()
        + "View: display image dummy image path" + System.lineSeparator();
    assertEquals(expectedView, viewLog.toString());
  }

  @Test
  public void testMosaic1000() {
    StringBuilder modelLog = new StringBuilder();
    ImageModel model = new MockGuiModel(modelLog);
    StringBuilder viewLog = new StringBuilder();
    View view = new MockGuiView(viewLog);
    Controller guiController = new Controller(model, view);
    guiController.actionPerformed(new ActionEvent(new Object(), 12345, "Seeds: 1000"));

    String expectedModel = "Model: apply mosaic effect 1000" + System.lineSeparator();
    assertEquals(expectedModel, modelLog.toString());

    String expectedView = "View: set action listener" + System.lineSeparator()
        + "View: display window" + System.lineSeparator()
        + "View: applying mosaic 1000" + System.lineSeparator()
        + "View: display image dummy image path" + System.lineSeparator();
    assertEquals(expectedView, viewLog.toString());
  }

  @Test
  public void testMosaic4000() {
    StringBuilder modelLog = new StringBuilder();
    ImageModel model = new MockGuiModel(modelLog);
    StringBuilder viewLog = new StringBuilder();
    View view = new MockGuiView(viewLog);
    Controller guiController = new Controller(model, view);
    guiController.actionPerformed(new ActionEvent(new Object(), 12345, "Seeds: 4000"));

    String expectedModel = "Model: apply mosaic effect 4000" + System.lineSeparator();
    assertEquals(expectedModel, modelLog.toString());

    String expectedView = "View: set action listener" + System.lineSeparator()
        + "View: display window" + System.lineSeparator()
        + "View: applying mosaic 4000" + System.lineSeparator()
        + "View: display image dummy image path" + System.lineSeparator();
    assertEquals(expectedView, viewLog.toString());
  }

  @Test
  public void testMosaic8000() {
    StringBuilder modelLog = new StringBuilder();
    ImageModel model = new MockGuiModel(modelLog);
    StringBuilder viewLog = new StringBuilder();
    View view = new MockGuiView(viewLog);
    Controller guiController = new Controller(model, view);
    guiController.actionPerformed(new ActionEvent(new Object(), 12345, "Seeds: 8000"));

    String expectedModel = "Model: apply mosaic effect 8000" + System.lineSeparator();
    assertEquals(expectedModel, modelLog.toString());

    String expectedView = "View: set action listener" + System.lineSeparator()
        + "View: display window" + System.lineSeparator()
        + "View: applying mosaic 8000" + System.lineSeparator()
        + "View: display image dummy image path" + System.lineSeparator();
    assertEquals(expectedView, viewLog.toString());
  }

  @Test
  public void testMosaic15000() {
    StringBuilder modelLog = new StringBuilder();
    ImageModel model = new MockGuiModel(modelLog);
    StringBuilder viewLog = new StringBuilder();
    View view = new MockGuiView(viewLog);
    Controller guiController = new Controller(model, view);
    guiController.actionPerformed(new ActionEvent(new Object(), 12345, "Seeds: 15000"));

    String expectedModel = "Model: apply mosaic effect 15000" + System.lineSeparator();
    assertEquals(expectedModel, modelLog.toString());

    String expectedView = "View: set action listener" + System.lineSeparator()
        + "View: display window" + System.lineSeparator()
        + "View: applying mosaic 15000" + System.lineSeparator()
        + "View: display image dummy image path" + System.lineSeparator();
    assertEquals(expectedView, viewLog.toString());
  }

}
