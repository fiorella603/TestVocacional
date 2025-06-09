  
package modelo;

 
public class Pregunta { 
    private int id;
    private String pregunta;
    private boolean respuesta;
    private int valor;
   

    public Pregunta() {
    }

    public Pregunta(String pregunta, boolean respuesta, int valor, int id) {
        this.pregunta = pregunta;
        this.respuesta = respuesta;
        this.valor = valor;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
