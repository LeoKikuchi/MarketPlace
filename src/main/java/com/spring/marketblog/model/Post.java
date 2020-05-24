package com.spring.marketblog.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Entity
@Table(name="TB_Post")

public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank
    private String Titulo;

    @NotBlank
    private String Oferta;

    @NotBlank
    private String ProdutoPrincipal;

    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-MM-yyyy")
    private LocalDate data;

    @NotBlank
    @Lob
    private String Texto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getOferta() {
        return Oferta;
    }

    public void setOferta(String oferta) {
        Oferta = oferta;
    }

    public String getProdutoPrincipal() {
        return ProdutoPrincipal;
    }

    public void setProdutoPrincipal(String produtoPrincipal) {
        ProdutoPrincipal = produtoPrincipal;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getTexto() {
        return Texto;
    }

    public void setTexto(String texto) {
        Texto = texto;
    }
}
