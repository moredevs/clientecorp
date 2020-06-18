package com.prueba.clientes.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "client")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "Client", description = "Modelo la entidad clientes")
public class Cliente {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private long id;

@NotNull
@Column(name = "nombre")
private String nombre;

@NotNull
@Column(name = "apellido")
private String apellido;

@NotNull
@Column(name = "edad")
private int edad;

@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
@NotNull
@Column(name = "fec_nac")
private Date  fec_nac;
}
