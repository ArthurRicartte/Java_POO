import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Usuarios usuarios = new Usuarios();
        try {
            String input = JOptionPane.showInputDialog("Digite o nome de usuario");
            String usuario = input;
            input = JOptionPane.showInputDialog("Agora digite a senha:");
            String senha = input;

            usuarios.ehUsuario(usuario, senha);
        } catch (UsuarioIncorretoException e) {
            System.out.println(e.getMessage());
        }

        JOptionPane.showMessageDialog(null, "Bem vindo!");
    }
}