package GDPPE;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class pathSelect {

    String fileID = "D:\\Steam\\steamapps\\common\\Geometry Dash\\Resources\\";

    public pathSelect() {
        browseFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser chooser = new JFileChooser(new File(System.getProperty("user.home") + ""));
                chooser.setDialogTitle("Select your Steam folder (which should contain folder named 'steamapps')");
                chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                chooser.setAcceptAllFileFilterUsed(true);

                if (chooser.showSaveDialog(new JFileChooser()) == JFileChooser.APPROVE_OPTION)
                {
                    fileID = chooser.getSelectedFile().getPath() + "\\steamapps\\common\\Geometry Dash\\Resources\\";
                    filePath.setText(fileID);
                    System.out.println(fileID);

                    gdppeUI fpSelect = new gdppeUI();

                    fpSelect.setFilePath(fileID);
                }


            }
        });
    }

    static void run() {
        JFrame frame = new JFrame("Please select Steam file path");
        frame.setContentPane(new pathSelect().filePathWindow);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private JTextArea filePath;
    private JPanel filePathWindow;
    private JButton browseFile;
}
