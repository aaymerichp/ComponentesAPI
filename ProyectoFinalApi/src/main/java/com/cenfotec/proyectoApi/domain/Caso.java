package com.cenfotec.proyectoApi.domain;

import java.util.Date;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBIgnore;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConverted;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConvertedEnum;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConverter;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTyped;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonNaming;


@DynamoDBTable(tableName = "tcaso")
public class Caso {

		private String id;
	    private String paciente;
	    private String enfermedad;
	    private String clinica; 
	    private Date fecha;
	    private String sintomas;

	    
	    @DynamoDBTypeConvertedEnum
	    public enum Estado
		{
			OBSERVACION,CRITICO,CERRADO,RECUPERADO
		}

	    private Estado estado;
	    
	    
	    @DynamoDBHashKey
	    @DynamoDBAutoGeneratedKey
	    public String getId() {
	        return id;
	    }

	    public void setId(String id) {
	        this.id = id;
	    }

	    @DynamoDBAttribute
	    public String getPaciente() {
	        return paciente;
	    }

	    public void setPaciente(String paciente) {
	        this.paciente = paciente;
	    }
	    
	   
	    @DynamoDBAttribute
	    public String getEnfermedad() {
	        return enfermedad;
	    }

	    public void setEnfermedad(String enfermedad) {
	        this.enfermedad = enfermedad;
	    }	 
	    
	    @DynamoDBAttribute
	    public String getClinica() {
	        return clinica;
	    }

	    public void setClinica(String clinica) {
	        this.clinica = clinica;
	    }
	    
	    @DynamoDBAttribute
	    public Date getFecha() {
	        return fecha;
	    }

	    public void setFecha(Date fecha) {
	        this.fecha = fecha;
	    }	   
	    
	    @DynamoDBAttribute
	    public String getSintomas() {
	        return sintomas;
	    }

	    public void setSintomas(String sintomas) {
	        this.sintomas = sintomas;
	    }
	    
	    @DynamoDBAttribute
	    public Estado getEstado() {
	        return estado;
	    }

	    public void setEstado(Estado estado) {
	        this.estado = estado;
	    }
	    
	    
	    
	    @DynamoDBIgnore
	    private Paciente miPaciente;
	    @DynamoDBIgnore
	    public Paciente getMiPaciente() {
	        return miPaciente;
	    }
	    @DynamoDBIgnore
	    public void setMiPaciente(Paciente miPaciente) {
	        this.miPaciente = miPaciente;
	    }
	    @DynamoDBIgnore
	    private Clinica miClinica;
	    @DynamoDBIgnore
	    public Clinica getMiClinica() {
	        return miClinica;
	    }
	    @DynamoDBIgnore
	    public void setMiClinica(Clinica miClinica) {
	        this.miClinica = miClinica;
	    }
	    @DynamoDBIgnore
	    private Enfermedad miEnfermedad;
	    @DynamoDBIgnore
	    public Enfermedad getMiEnfermedad() {
	        return miEnfermedad;
	    }
	    @DynamoDBIgnore
	    public void setMiEnfermedad(Enfermedad miEnfermedad) {
	        this.miEnfermedad = miEnfermedad;
	    }
	
}
	

	
