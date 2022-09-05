
package com.app.entities;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="page1")
public class Page1 implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	@Column(name="field1")
	private String field1;
	@Column(name="field2")
	private String field2;

    public Page1 withId(Integer id){
	  this.id=id;
	  return this;
	}

    public void setId(Integer id){
	  this.id=id;
	}
	
	public Integer getId(){
	 return this.id;
	}

    public Page1 withField1(String field1){
	  this.field1=field1;
	  return this;
	}

    public void setField1(String field1){
	  this.field1=field1;
	}
	
	public String getField1(){
	 return this.field1;
	}

    public Page1 withField2(String field2){
	  this.field2=field2;
	  return this;
	}

    public void setField2(String field2){
	  this.field2=field2;
	}
	
	public String getField2(){
	 return this.field2;
	}


	@Override
	public boolean equals(Object obj) {
	  if (obj == null) {
		return false;
	  }
	 Page1 that = (Page1) obj;
	 if (this.getId() == null) {
	   return this.toString().equals(that.toString());
	  }
	  return this.getId().equals(that.getId());	  
	}

	@Override
	public int hashCode() {
	  if(this.id==null) { 
	    return toString().hashCode(); 
	   }
	  return this.id.hashCode();
	}
	
	@Override
	public String toString(){
	  StringBuffer buf=new StringBuffer();
	  buf.append(this.id).append(",");
	  buf.append(this.field1).append(",");
	  buf.append(this.field2).append(",");
	  return buf.toString();
	}
}