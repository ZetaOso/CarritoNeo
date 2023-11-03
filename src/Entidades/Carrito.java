package Entidades;

import java.time.LocalDateTime;

public class Carrito {
    public Producto prod1;
    public Producto prod2;
    public Producto prod3;
    public LocalDateTime fechaCompra;

    public Carrito(Producto prod1, Producto prod2, Producto prod3, LocalDateTime fechaCompra) {
        this.prod1 = prod1;
        this.prod2 = prod2;
        this.prod3 = prod3;
        this.fechaCompra = fechaCompra;
    }

    public void setProd1(Producto prod1) {
        this.prod1 = prod1;
    }

    public Producto getProd1() {
        return this.prod1;
    }

    public void setProd2(Producto prod2) {
        this.prod2 = prod2;
    }

    public Producto getProd2() {
        return this.prod2;
    }

    public void setProd3(Producto prod3) {
        this.prod3 = prod3;
    }

    public Producto getProd3() {
        return this.prod3;
    }

    public void setFechaCompra(LocalDateTime fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public LocalDateTime getFechaCompra() {
        return this.fechaCompra;
    }

    public float costoFinal() {
        return this.prod1.costoFinal() + this.prod2.costoFinal() + this.prod3.costoFinal();
    }
}

