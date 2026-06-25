import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

public class DLG extends JDialog {
    private JPanel contentPane;
    private JTextField TFFirst;
    private JTextField TFSecond;
    private JTextField TFResult;
    private JButton JBAdd;
    private JButton JBSub;
    private JButton JBMul;
    private JButton JBDiv;
    public JMenuBar MenuBar;
    private JMenu MHelp;
    private JMenuItem About;
    private JMenuItem Tools;
    private JButton JBSin;
    private JButton JBCos;
    private JButton JBTan;
    private JButton JBPi;
    private JButton JBExp;
    private JButton JBLog;
    private JButton JBLogAB;
    private JButton JBE;
    private JButton JBPow;
    private JButton JBSqrt;
    private JButton JBHex;
    private JButton JBClear;


    public DLG() {
        setContentPane(contentPane);
        setModal(true);

        MHelp.add(About);
        MHelp.add(Tools);

        MenuBar.add(MHelp);

        JBAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(TFFirst.getText());
                double num2 = Double.parseDouble(TFSecond.getText());
                double result = num1 + num2;
                TFResult.setText(String.valueOf(result));
            }
        });
        JBSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(TFFirst.getText());
                double num2 = Double.parseDouble(TFSecond.getText());
                double result = num1 - num2;
                TFResult.setText(String.valueOf(result));
            }
        });
        JBMul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(TFFirst.getText());
                double num2 = Double.parseDouble(TFSecond.getText());
                double result = num1 * num2;
                TFResult.setText(String.valueOf(result));
            }
        });
        JBDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(TFFirst.getText());
                double num2 = Double.parseDouble(TFSecond.getText());
                double result = num1 / num2;
                TFResult.setText(String.valueOf(result));
            }
        });
        About.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Программа Сталина и Некрасова");
            }
        });

        Tools.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Гойда на C#");
            }
        });

        JBSin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(TFFirst.getText());
                double result = Math.sin(num1);
                TFResult.setText(String.valueOf(result));
            }
        });

        JBCos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(TFFirst.getText());
                double result = Math.cos(num1);
                TFResult.setText(String.valueOf(result));
            }
        });

        JBTan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(TFFirst.getText());
                double result = Math.tan(num1);
                TFResult.setText(String.valueOf(result));
            }
        });

        JBPi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TFResult.setText(String.valueOf(Math.PI));
            }
        });

        JBExp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(TFFirst.getText());
                double result = Math.exp(num1);
                TFResult.setText(String.valueOf(result));
            }
        });

        JBLog.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(TFFirst.getText());
                double result = Math.log(num1);
                TFResult.setText(String.valueOf(result));
            }
        });

        JBLogAB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a = Double.parseDouble(TFFirst.getText());
                double b = Double.parseDouble(TFSecond.getText());

                double result = Math.log(a) / Math.log(b);

                TFResult.setText(String.valueOf(result));
            }
        });

        JBPow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(TFFirst.getText());
                double num2 = Double.parseDouble(TFSecond.getText());

                double result = Math.pow(num1, num2);

                TFResult.setText(String.valueOf(result));
            }
        });

        JBSqrt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(TFFirst.getText());
                double num2 = Double.parseDouble(TFSecond.getText());

                double result = Math.sqrt(num1);

                TFResult.setText(String.valueOf(result));
            }
        });

        JBE.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                double result = Math.E;

                TFResult.setText(String.valueOf(result));
            }
        });

        JBHex.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num = (int) Double.parseDouble(TFFirst.getText());

                String result = "0x" + Integer.toHexString(num).toUpperCase();

                TFResult.setText(result);
            }
        });

        JBClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TFFirst.setText("");
                TFSecond.setText("");
                TFResult.setText("");
            }
        });
    }
}
