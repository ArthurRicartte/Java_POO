public class Usuarios {
    private final String usuario = "Junim";
    private final String senha = "Comprelabubu";


    public void ehUsuario(String possivelUsuario, String possivelSenha) throws UsuarioIncorretoException {
            if (!possivelUsuario.equals(usuario)){
                throw new UsuarioIncorretoException("Usuario incorreto!");
            }

            if (!possivelSenha.equals(senha)){
                throw new UsuarioIncorretoException("Senha incorreta!");
            }
    }
}
