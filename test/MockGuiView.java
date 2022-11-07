import imageview.View;
import java.awt.event.ActionListener;

/**
 * This class represents a text-based mock view used to handle a script.
 */
public class MockGuiView implements View {
  private final StringBuilder log;

  /**
   * Constructor only created to pass in the StreamBuilder.
   *
   * @param log the view to use
   */
  public MockGuiView(StringBuilder log) {
    this.log = log;
  }


  @Override
  public String getFile() {
    return "acbdeXYZ file name";
  }


  @Override
  public void setListener(ActionListener listener) {
    log.append("View: set action listener");
    log.append((System.lineSeparator()));
  }


  @Override
  public void displayImage(String pngFilePath) {
    log.append("View: display image ").append(pngFilePath);
    log.append((System.lineSeparator()));
  }


  @Override
  public void displayWindow() {
    log.append("View: display window");
    log.append((System.lineSeparator()));
  }


  @Override
  public void addEffect(String effect) {
    log.append("View: applying ").append(effect);
    log.append((System.lineSeparator()));
  }


  @Override
  public void createScript() {
    log.append("View: create the batch-script");
    log.append((System.lineSeparator()));
  }
}
