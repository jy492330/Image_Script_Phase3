package imageview;

import java.awt.event.ActionListener;

/**
 * The interface for the interactive view class.
 */
public interface View {

  /**
   * Set the label that is showing what the model stores.
   *
   * @return the string type file name
   */
  String getFile();


  /**
   * Set the listener for any actions.
   * 
   * @param listener the listener to use
   */
  void setListener(ActionListener listener);


  /**
   * Display this image view.
   *
   * @param pngFilePath the file path of the png file
   */
  void displayImage(String pngFilePath);

  /**
   * Display this window view.
   */
  void displayWindow();


  /**
   * Apply image manipulation effect to the image.
   *
   * @param effect this image effect to be applied
   */
  void addEffect(String effect);


  /**
   * Create an interactively user-defined script.
   */
  void createScript();

}
