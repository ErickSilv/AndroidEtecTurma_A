package br.com.exemplo.projetomodelo_a.repositorio;

public class LoginRepositorio {
    public static Login GetLoginByUsuario(){
        // Simulation of a query to date storage
        return new Login ("rubens", "123");
    }
}
