package br.com.exemplo.projetomodelo_a.repositorio;

public class LoginService {
    Login login;

        public void autenticarLogin(String usuario, String senha){
            login = new LoginRepositorio().GetLoginByUsuario();
            login.autenticar(usuario, senha);
        }


}
