/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.util.LinkedList;

/**
 *
 * @author ALLAN
 */
public class Logica {

    private LinkedList<Usuario> usuarios;
//    private Usuario logeado;

    public Logica() {
        usuarios = new LinkedList<>();
        cargarUsuarios();
    }

    private void cargarUsuarios() {
        Usuario u1 = new Usuario("usuario1@gmail.com", "usuario1", "usuario1", "usuario1.jpg");
        Usuario u2 = new Usuario("usuario2@gmail.com", "usuario2", "usuario2", "usuario2.jpg");
        Usuario u3 = new Usuario("usuario3@gmail.com", "usuario3", "usuario3", "usuario3.jpg");
        Usuario u4 = new Usuario("usuario4@gmail.com", "usuario4", "usuario4", "usuario4.jpg");
        usuarios.add(u1);
        usuarios.add(u2);
        usuarios.add(u3);
        usuarios.add(u4);

    }

    public String registrar(Usuario u, String contra) {
        if (!u.getPassword().equals(contra)) {
            return "1,Contraseñas inválidas";
        }

        if (u.getEmail().isEmpty() || u.getUsername().isEmpty()) {
            return "2,Email/Usuario requerido.";
        }

        for (Usuario usuario : usuarios) {
            if (u.getUsername().equalsIgnoreCase(usuario.getUsername())) {
                return "3,El usuario ya existe.";
            }
            if (u.getEmail().equalsIgnoreCase(usuario.getEmail())) {
                return "4,Email ya ha sido registrado";
            }
        }

        //Se registra el usuario.
        usuarios.add(u);

        return "0,Acción realizada con éxito";
    }

    public Usuario verificarUsuario(String username, String password) {
        for (Usuario usuario : usuarios) {
            if ((username.equals(usuario.getUsername())
                    || username.equals(usuario.getEmail()))
                    && password.equals(usuario.getPassword())) {
//                logeado = usuario;
                return usuario;
            }
        }
        return null;
    }

    public void modificarUsuario(Usuario user, String password) {
        for (int i = 0; i < usuarios.size(); i++) {
            if (user.getCedula().equals(usuarios.get(i).getCedula())) {
                usuarios.remove(i);
                //Validar los datos del usuario, email, pass, username 
                usuarios.add(user);
            }
        }
    }

//    public Usuario getLogeado() {
//        return logeado;
//    }
    
    
}
