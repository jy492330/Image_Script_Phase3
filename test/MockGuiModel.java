import images.ImageModel;

/**
 * Implement of a mock to test the GUI controller.
 */
public class MockGuiModel implements ImageModel {
  private final StringBuilder log;

  /**
   * Constructor for the mock model.
   *
   * @param log the model to use
   */
  public MockGuiModel(StringBuilder log) {
    this.log = log;
  }


  @Override
  public void loadImage(String filename) throws IllegalArgumentException {
    log.append("Model: load an image ").append(filename);
    log.append((System.lineSeparator()));
  }


  @Override
  public void saveImage(String filename) throws IllegalArgumentException {
    log.append("Model: save an image ").append(filename);
    log.append((System.lineSeparator()));

  }


  @Override
  public void applyBlur() {
    log.append("Model: apply blur effect");
    log.append((System.lineSeparator()));
  }


  @Override
  public void applySharpen() {
    log.append("Model: apply sharpen effect");
    log.append((System.lineSeparator()));
  }


  @Override
  public void applyGrayscale() {
    log.append("Model: apply grayscale effect");
    log.append((System.lineSeparator()));
  }


  @Override
  public void applySepia() {
    log.append("Model: apply sepia effect");
    log.append((System.lineSeparator()));
  }


  @Override
  public void applyDither() {
    log.append("Model: apply dither effect");
    log.append((System.lineSeparator()));
  }


  @Override
  public void applyMosaic(int seeds) throws IllegalArgumentException {
    log.append("Model: apply mosaic effect ").append(seeds);
    log.append((System.lineSeparator()));
  }


  @Override
  public String getImage() {
    return "dummy image path";
  }
}
