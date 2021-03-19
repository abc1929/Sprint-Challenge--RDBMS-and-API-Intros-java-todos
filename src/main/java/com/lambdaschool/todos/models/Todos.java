package com.lambdaschool.todos.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name ="todos")
public class Todos extends Auditable {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private long todoid;


   private String description;

   private Boolean completed = false;


   @ManyToOne
   @JoinColumn(name="userid", nullable = false)
   @JsonIgnoreProperties(value = "todos", allowSetters = true)
   private User user;

   public Todos(){

   }


   public Todos( User user , String description) {
      this.user = user;
      this.description = description;
   }

   public long getTodoid() {
      return todoid;
   }

   public void setTodoid(long todoid) {
      this.todoid = todoid;
   }

   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public Boolean isCompleted() {
      return completed;
   }

   public void setCompleted(Boolean completed) {
      this.completed = completed;
   }

   public User getUser() {
      return user;
   }

   public void setUser(User user) {
      this.user = user;
   }
}
