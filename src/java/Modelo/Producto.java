
package Modelo;

public class Producto {
    int id;
    String nom;
    String pre;
    int stock;
    String estado;
    
    public Producto(){        
    }
    public Producto(int id, String nom, String pre, int stock, String estado){
        this.id = id;
        this.nom = nom;
        this.pre = pre;
        this.stock = stock;
        this.estado = estado; 
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPre() {
        return pre;
    }

    public void setPre(String pre) {
        this.pre = pre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}

