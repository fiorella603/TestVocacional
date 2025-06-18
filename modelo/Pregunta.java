 package modelo;
public class Pregunta {
    private int id;
    private String pregunta;
    private boolean respuesta;
    private int valor;
    private int idtema;

    public Pregunta() {
    }

    public Pregunta(int id, String pregunta, boolean respuesta, int valor, int idtema) {
        this.id = id;
        this.pregunta = pregunta;
        this.respuesta = respuesta;
        this.valor = valor;
        this.idtema = idtema;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public boolean getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(boolean respuesta) {
        this.respuesta = respuesta;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getIdtema() {
        return idtema;
    }

    public void setIdtema(int idtema) {
        this.idtema = idtema;
    }
   

     
}
