import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class DLG extends JDialog {
    private JPanel contentPane;
    private JComboBox CB;

    Runtime rt;
    String s[] = {"Word", "Excel", "PowerPoint"};
    String Path;
    int i;

    public DLG() {
        setContentPane(contentPane);
        setModal(true);

        for (i = 0; i <= 2; i++)
        {
            CB.addItem(s[i]);
            CB.setSelectedIndex(-1);
        };

        rt = Runtime.getRuntime();

        CB.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                Path = "C:/Program Files/Microsoft Office/root/Office16/";

                switch (((JComboBox) e.getSource()).getSelectedIndex()) {
                    case 0:
                        Path += "WINWORD.exe";
                        break;
                    case 1:
                        Path += "Excel.exe";
                        break;
                    case 2:
                        Path += "PowerPnt.exe";
                        break;
                }
                try {
                    rt.exec(Path);
                }
                catch (Exception exс) {}
            }
        });
    }
}
