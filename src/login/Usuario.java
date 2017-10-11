package login;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ALLAN
 */
public class Usuario {

    private String cedula;
    private String nombre;
    private String email;
    private String username;
    private String password;
    private String direccion;
    private String telefono;
    private String foto;

    public Usuario() {
    }

    public Usuario(String email, String username, String password, String foto) {
        this.email = email;
        this.username = username;
        this.password = password;
        this.foto = foto;
    }

    public Usuario(String cedula, String nombre, String email, String username, String password, String direccion, String telefono, String foto) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.email = email;
        this.username = username;
        this.password = password;
        this.direccion = direccion;
        this.telefono = telefono;
        this.foto = foto;
    }

    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Usuario{" + "cedula=" + cedula + ", nombre=" + nombre + ", email=" + email + ", username=" + username + ", password=" + password + ", direccion=" + direccion + ", telefono=" + telefono + ", foto=" + foto + '}';
    }
    

}
