import javax.swing.*;

public class gdppeUI {

    public static void main(String[] args) {
        JFrame frame = new JFrame("gdppeUI");
        frame.setContentPane(new gdppeUI().gdppeWindow);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    private JPanel gdppeWindow;
    private JLabel title;
    private JSlider dragSlider;
    private JSlider shipSlider;
    private JSlider landSlider;
    private JSlider swingSlider;
    private JSlider burstSlider;
    private JRadioButton noParticle;
    private JRadioButton defualtParticle;
}
