package domain;

import java.util.Date;

public class Cliente extends Persona{
    private int idCliente;
    private boolean vip;
    private static int contadorCliente;
    private Date fechaRegistro;

    public Cliente(String nombre,char genero,int edad,
                   String direccion, boolean vip,Date fechaRegistro){
        super(nombre,genero,edad,direccion);
        this.idCliente=++Cliente.contadorCliente;
        this.vip=vip;
        this.fechaRegistro=fechaRegistro;
    }
    public int getidCliente() {
        return this.idCliente;
    }
    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }
    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    public boolean isVip() {
        return this.vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cliente{");
        sb.append("idCliente=").append(idCliente);
        sb.append(", vip=").append(vip);
        sb.append(", fechaRegistro=").append(fechaRegistro);
        sb.append(",").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
