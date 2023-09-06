package com.teste.primeiroexemplo.model.error;

public class ErrorMessage {
    
    private String titulo;

    private Integer status;

    private String message;
    
    
    
    public ErrorMessage(String titulo, Integer status, String mensagem) {
        this.titulo = titulo;
        this.status = status;
        this.message = mensagem;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }
    public String getMensagem() {
        return message;
    }
    public void setMensagem(String mensagem) {
        this.message = mensagem;
    }

    
}
