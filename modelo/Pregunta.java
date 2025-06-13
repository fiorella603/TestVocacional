  
public class Pregunta {
    private int id;
    private String pregunta;
    private String respuesta;
    private int valor;
    private int idtema;

    public Pregunta() {
    }

    public Pregunta(int id, String pregunta, String respuesta, int valor, int idtema) {
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

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
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
