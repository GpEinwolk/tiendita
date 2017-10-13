package Modelo;
// Generated 12/10/2017 08:19:22 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Usuario generated by hbm2java
 */
public class Usuario  implements java.io.Serializable {


     private Integer idusuario;
     private String nombre;
     private String apP;
     private String apM;
     private String user;
     private String pass;
     private int nivel;
     private Set logins = new HashSet(0);

    public Usuario() {
    }

	
    public Usuario(String nombre, String apP, String apM, String user, String pass, int nivel) {
        this.nombre = nombre;
        this.apP = apP;
        this.apM = apM;
        this.user = user;
        this.pass = pass;
        this.nivel = nivel;
    }
    public Usuario(String nombre, String apP, String apM, String user, String pass, int nivel, Set logins) {
       this.nombre = nombre;
       this.apP = apP;
       this.apM = apM;
       this.user = user;
       this.pass = pass;
       this.nivel = nivel;
       this.logins = logins;
    }
   
    public Integer getIdusuario() {
        return this.idusuario;
    }
    
    public void setIdusuario(Integer idusuario) {
        this.idusuario = idusuario;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApP() {
        return this.apP;
    }
    
    public void setApP(String apP) {
        this.apP = apP;
    }
    public String getApM() {
        return this.apM;
    }
    
    public void setApM(String apM) {
        this.apM = apM;
    }
    public String getUser() {
        return this.user;
    }
    
    public void setUser(String user) {
        this.user = user;
    }
    public String getPass() {
        return this.pass;
    }
    
    public void setPass(String pass) {
        this.pass = pass;
    }
    public int getNivel() {
        return this.nivel;
    }
    
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    public Set getLogins() {
        return this.logins;
    }
    
    public void setLogins(Set logins) {
        this.logins = logins;
    }




}


