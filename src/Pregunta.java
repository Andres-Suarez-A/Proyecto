class Pregunta {
    private String texto;
    private String[] opciones;

    public Pregunta(String texto, String[] opciones) {
        this.texto = texto;
        this.opciones = opciones;
    }

    public String getTexto() {
        return texto;
    }

    public String[] getOpciones() {
        return opciones;
    }
}
