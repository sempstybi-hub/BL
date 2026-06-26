import javax.swing.*;
import java.awt.event.*;
import java.io.File;
import java.io.RandomAccessFile;

public class DLG extends JDialog {
    private JPanel contentPane;
    private JButton JBGoida;
    private JTextField Edit;

    RandomAccessFile raf;
    String FileName;
    byte u[], aux;
    int i,k,n;

    public DLG() {
        setContentPane(contentPane);
        setModal(true);

        JBGoida.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FileName = Edit.getText();
                try {
                    raf = new RandomAccessFile(FileName,"rw");
                    n = (int)raf.length();
                    u = new byte[n];
                    raf.read(u,0,n);
                    raf.seek(0);
                    for (i=0,k=n-1;i<=n/2-1;i++,k--) {
                        aux = u[i];u[i]=u[k];u[k]=aux;
                    }
                    raf.write(u,0,n);
                    raf.close();
                }
                catch (Exception exc) {}
            }
        });
    }
}
