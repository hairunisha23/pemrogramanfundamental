package tugas2;

    import javax.swing.JOptionPane;
    public class authenticator2 {
        public static void main(String args[]) {
            String username = JOptionPane.showInputDialog("Username:");
            String password	= JOptionPane.showInputDialog("Password:");
            if ( username != null && password != null
                    && (
                    (username.equals("nisha") && password.equals("123")) ||
                            (username.equals("bintang") && password.equals("456"))
            )
            )
            {
                JOptionPane.showMessageDialog(null, "kamu baik.");
            }   else {
                JOptionPane.showMessageDialog(null, " anak baik.");
            }
        }
    }
