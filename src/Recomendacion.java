class Recomendacion {
    private String nombre;
    private String sinopsis;
    private String año;
    private String dondemirar;
    private String enlace;
    private String descargar;

    public Recomendacion(String nombre, String año, String dondemirar, String sinopsis, String enlace, String descargar) {
        this.nombre = nombre;
        this.enlace = enlace;
        this.descargar = descargar;
        this.sinopsis = sinopsis;
        this.año = año;
        this.dondemirar = dondemirar;
    }

    public String getNombre() {
        return nombre;
    }
    public String getSinopsis(){
        return sinopsis;
    }
    public String getAño(){
        return año;
    }
    public String getDondemirar(){
        return dondemirar;
    }

    public String getEnlace() {
        return enlace;
    }
    public String getDescargar(){
        return descargar;
    }
}
