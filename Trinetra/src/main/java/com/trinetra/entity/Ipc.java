package com.trinetra.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ipcs")
public class Ipc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String status;
    private String centername;
   
    
    
   public Long getId() {
        return id;
    }



    public void setId(Long id) {
        this.id = id;
    }



    public String getStatus() {
        return status;
    }



    public void setStatus(String status) {
        this.status = status;
    }



    public String getCentername() {
        return centername;
    }



    public void setCentername(String centername) {
        this.centername = centername;
    }



    //public Center getCenter() {
       // return center;
   // }



   //// public void setCenter(Center center) {
       // this.center = center;
   // }



//@ManyToOne
//   @JoinColumn(name = "centerId", nullable = false)
  // private Center center;
}
