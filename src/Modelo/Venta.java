package Modelo;
// Generated 12/10/2017 08:19:22 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;

/**
 * Venta generated by hbm2java
 */
public class Venta  implements java.io.Serializable {


     private VentaId id;
     private Cliente cliente;
     private Login login;
     private Producto producto;
     private Date fecha;
     private int cantidad;
     private BigDecimal ganancia;
     private byte cancelada;
     private BigDecimal cambio;
     private String motivo;

    public Venta() {
    }

	
    public Venta(VentaId id, Cliente cliente, Login login, Producto producto, Date fecha, int cantidad, BigDecimal ganancia, byte cancelada, BigDecimal cambio) {
        this.id = id;
        this.cliente = cliente;
        this.login = login;
        this.producto = producto;
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.ganancia = ganancia;
        this.cancelada = cancelada;
        this.cambio = cambio;
    }
    public Venta(VentaId id, Cliente cliente, Login login, Producto producto, Date fecha, int cantidad, BigDecimal ganancia, byte cancelada, BigDecimal cambio, String motivo) {
       this.id = id;
       this.cliente = cliente;
       this.login = login;
       this.producto = producto;
       this.fecha = fecha;
       this.cantidad = cantidad;
       this.ganancia = ganancia;
       this.cancelada = cancelada;
       this.cambio = cambio;
       this.motivo = motivo;
    }
   
    public VentaId getId() {
        return this.id;
    }
    
    public void setId(VentaId id) {
        this.id = id;
    }
    public Cliente getCliente() {
        return this.cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Login getLogin() {
        return this.login;
    }
    
    public void setLogin(Login login) {
        this.login = login;
    }
    public Producto getProducto() {
        return this.producto;
    }
    
    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public int getCantidad() {
        return this.cantidad;
    }
    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public BigDecimal getGanancia() {
        return this.ganancia;
    }
    
    public void setGanancia(BigDecimal ganancia) {
        this.ganancia = ganancia;
    }
    public byte getCancelada() {
        return this.cancelada;
    }
    
    public void setCancelada(byte cancelada) {
        this.cancelada = cancelada;
    }
    public BigDecimal getCambio() {
        return this.cambio;
    }
    
    public void setCambio(BigDecimal cambio) {
        this.cambio = cambio;
    }
    public String getMotivo() {
        return this.motivo;
    }
    
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }




}

