package imageview;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.nio.file.Path;
import  javax.swing.DefaultListModel;
import  javax.swing.ImageIcon;
import  javax.swing.JButton;
import  javax.swing.JCheckBox;
import  javax.swing.JFileChooser;
import  javax.swing.JFrame;
import  javax.swing.JLabel;
import  javax.swing.JList;
import  javax.swing.JMenu;
import  javax.swing.JMenuBar;
import  javax.swing.JMenuItem;
import  javax.swing.JPanel;
import  javax.swing.JScrollPane;
import  javax.swing.JTextField;
import  javax.swing.ListSelectionModel;
import  javax.swing.ScrollPaneConstants;


/**
 * This class represents the implementation of the GUI view.
 */
public class FrameView extends JFrame implements View {
  private static JList<String> options;
  private static JScrollPane optionPane;
  private static final long serialVersionUID = -7083924619099998893L;
  private JTextField input;
  private JPanel buttonPanel;
  private JLabel display;
  private JButton fileButton;
  private JButton exitButton;
  private JPanel optionPanel;
  private JCheckBox sharpenCheck;
  private JCheckBox blurCheck;
  private JCheckBox grayscaleCheck;
  private JCheckBox ditherCheck;
  private JCheckBox sepiaCheck;
  private JCheckBox mosaicCheck;
  private JLabel fileLabel;
  private JTextField fileField;
  private JButton displayButton;
  private JLabel optionLabel;
  private JPanel imagePanel;
  private ImageIcon icon;
  private JLabel imageLabel;
  private JPanel borderPanel;
  private JMenuBar menuBar;
  private JMenu mainMenu;
  private JMenuItem loadOption;
  private JMenuItem saveOption;
  private JMenuItem createScript;
  private JMenuItem runScript;
  private JMenuItem blur;
  private JMenuItem sharpen;
  private JMenuItem grayscale;
  private JMenuItem sepia;
  private JMenuItem dither;
  private JMenu mosaicOption;
  private JMenuItem mosaic1000;
  private JMenuItem mosaic4000;
  private JMenuItem mosaic8000;
  private JMenuItem mosaic15000;
  private JFrame scriptFrame;
  private JPanel scriptPanel;
  private JMenuBar scriptMenuBar;
  private JMenu scriptMainMenu;
  private DefaultListModel<String> listModel;
  private JList optionList;


  /**
   * Constructor.
   * 
   * @param caption the value of the caption
   */
  public FrameView(String caption) {
    super(caption);
    borderPanel = new JPanel(new BorderLayout());
    setSize(500, 300);
    setLocation(200, 200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    menuBar = new JMenuBar();
    mainMenu = new JMenu("Menu Options");
    loadOption = new JMenuItem("Load Image File");
    saveOption = new JMenuItem("Save Image File");
    createScript = new JMenuItem("Create Script");
    runScript = new JMenuItem("Run Script");

    mainMenu.add(loadOption);
    mainMenu.add(saveOption);
    mainMenu.add(createScript);
    mainMenu.add(runScript);
    menuBar.add(mainMenu);
    setJMenuBar(menuBar);
    display = new JLabel("To be displayed");
    input = new JTextField(10);
    fileLabel = new JLabel("To be displayed");
    fileField = new JTextField(10);

    optionPanel = new JPanel();
    optionPanel.setLayout(new GridLayout(7, 1));
    optionLabel = new JLabel("Select One or More Image Effects");
    optionPanel.add(optionLabel);
    sharpenCheck = new JCheckBox("Sharpen");
    sharpenCheck.setMnemonic(KeyEvent.VK_C);
    sharpenCheck.setSelected(false);
    optionPanel.add(sharpenCheck);

    blurCheck = new JCheckBox("Blur");
    blurCheck.setMnemonic(KeyEvent.VK_G);
    blurCheck.setSelected(false);
    optionPanel.add(blurCheck);

    sepiaCheck = new JCheckBox("Sepia");
    sepiaCheck.setMnemonic(KeyEvent.VK_H);
    sepiaCheck.setSelected(false);
    optionPanel.add(sepiaCheck);

    grayscaleCheck = new JCheckBox("Grayscale");
    grayscaleCheck.setMnemonic(KeyEvent.VK_H);
    grayscaleCheck.setSelected(false);
    optionPanel.add(grayscaleCheck);

    ditherCheck = new JCheckBox("Dither");
    ditherCheck.setMnemonic(KeyEvent.VK_T);
    ditherCheck.setSelected(false);
    optionPanel.add(ditherCheck);

    mosaicCheck = new JCheckBox("Mosaic");
    mosaicCheck.setMnemonic(KeyEvent.VK_T);
    mosaicCheck.setSelected(false);
    optionPanel.add(mosaicCheck);

    buttonPanel = new JPanel();
    buttonPanel.setLayout(new GridLayout(1, 3));

    fileButton = new JButton("File");
    fileButton.setActionCommand("File Button");
    buttonPanel.add(fileButton);

    exitButton = new JButton("Exit");
    exitButton.setActionCommand("Exit Button");
    buttonPanel.add(exitButton);

    displayButton = new JButton("Display");
    displayButton.setActionCommand("Display Button");
    buttonPanel.add(displayButton);

    imagePanel = new JPanel();
    imagePanel.setPreferredSize(new Dimension(700, 300));
    imagePanel.setBackground(Color.BLACK);
    JScrollPane jscrollPane = new JScrollPane(borderPanel,
        ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
        ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
    jscrollPane.setPreferredSize(new Dimension(500, 400));

    ImageIcon icon = new ImageIcon();
    imageLabel = new JLabel();
    imageLabel.setIcon(icon);
    imagePanel.add(imageLabel);
    borderPanel.add(imagePanel, BorderLayout.CENTER);
    borderPanel.add(buttonPanel, BorderLayout.SOUTH);
    this.getContentPane().add(jscrollPane);
    scriptFrame = new JFrame("Script");
    scriptFrame.setBackground(Color.BLACK);
    scriptFrame.setVisible(false);
    scriptMenuBar = new JMenuBar();
    scriptMainMenu = new JMenu("Script Options");
    blur = new JMenuItem("Blur Effect");
    blur.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {

      }
    });
    sharpen = new JMenuItem("Sharpen Effect");
    grayscale = new JMenuItem("Grayscale Effect");
    sepia = new JMenuItem("Sepia Effect");
    dither = new JMenuItem("Dither Effect");
    mosaicOption = new JMenu("Mosaic Effect");
    mosaic1000 = new JMenuItem("Seeds: 1000");
    mosaic4000 = new JMenuItem("Seeds: 4000");
    mosaic8000 = new JMenuItem("Seeds: 8000");
    mosaic15000 = new JMenuItem("Seeds: 15000");

    scriptMainMenu.add(blur);
    scriptMainMenu.add(sharpen);
    scriptMainMenu.add(grayscale);
    scriptMainMenu.add(sepia);
    scriptMainMenu.add(dither);
    scriptMainMenu.add(mosaicOption);
    mosaicOption.add(mosaic1000);
    mosaicOption.add(mosaic4000);
    mosaicOption.add(mosaic8000);
    mosaicOption.add(mosaic15000);
    scriptMenuBar.add(scriptMainMenu);
    scriptFrame.setJMenuBar(scriptMenuBar);

    scriptPanel = new JPanel(new BorderLayout());
    scriptPanel.setVisible(true);
    optionPane = new JScrollPane();
    optionPane.setVisible(true);
    listModel = new DefaultListModel();
    optionList = new JList(listModel);
    optionList.setVisible(true);
    optionList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
    optionList.setLayoutOrientation(JList.HORIZONTAL_WRAP);
    optionPane = new JScrollPane(optionList);
    optionPane.setVisible(true);
    optionPane.setPreferredSize(new Dimension(250, 200));
    scriptFrame.setPreferredSize(new Dimension(300, 400));
    optionPane.setViewportView(options);
    scriptFrame.add(optionList);
    scriptPanel.setVisible(true);
    optionPane.setVisible(true);
    scriptFrame.pack();
    pack(); // to pack all the components on the JFrame components
  }

  @Override
  public void displayWindow() {
    setVisible(true);
  }

  @Override
  public void displayImage(String pngFilePath) {
    ImageIcon i = new ImageIcon(pngFilePath);
    imageLabel.setIcon(i);
  }

  @Override
  public void createScript() {
    scriptFrame.setVisible(true);
  }

  @Override
  public void setListener(ActionListener listener) {
    fileButton.addActionListener(listener);
    exitButton.addActionListener(listener);
    loadOption.addActionListener(listener);
    saveOption.addActionListener(listener);
    createScript.addActionListener(listener);
    runScript.addActionListener(listener);
    blur.addActionListener(listener);
    sharpen.addActionListener(listener);
    grayscale.addActionListener(listener);
    sepia.addActionListener(listener);
    dither.addActionListener(listener);
    mosaic1000.addActionListener(listener);
    mosaic4000.addActionListener(listener);
    mosaic8000.addActionListener(listener);
    mosaic15000.addActionListener(listener);
  }

  @Override
  public String getFile() {
    final JFileChooser fc = new JFileChooser(Path.of("res").toAbsolutePath().toString());
    int returnVal = fc.showOpenDialog(null);
    //fc.getFileView().getName(fc.getSelectedFile());
    if (returnVal == JFileChooser.APPROVE_OPTION) {
      return fc.getSelectedFile().getName();
    }
    return null;
  }

  @Override
  public void addEffect(String effect) {
    listModel.addElement(effect);
    scriptFrame.repaint();
  }
}
